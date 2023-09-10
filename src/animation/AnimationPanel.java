package src.animation;

import src.drivers.GraphicDriver;
import src.tsp.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class AnimationPanel extends JPanel {
    private DecimalFormat DF = new DecimalFormat("#.###");

    public int count;
    private Graphics2D g2D;
    private MouseAdapter mouseAdapter;
    private boolean isSelecting;
    private Stroke stroke = new BasicStroke(3);
    public GeneticAThread geneticAThread = new GeneticAThread(this);

    public AnimationPanel() {
        this.geneticAThread.initialRoute = new ArrayList<City>();

        Image backgroundImage = new ImageIcon("res/TurkiyeMap.png").getImage();
        this.setVisible(true);
    }


    //start animation w start button
    public void startAnimation() {

        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                updateCityPositions();
            }
        });

        //if initialRoute is selected
        if (!geneticAThread.initialRoute.isEmpty()) {
            geneticAThread.population = new Population(Settings.POPULATION_SIZE, geneticAThread.initialRoute);
            geneticAThread.population.sortRoutesByFitness();
            drawPopulation();
            GraphicDriver.fitnessLabel.setText("Highest Fitness: " + DF.format(geneticAThread.population.getRoutes().get(0).getFitness()));
            GraphicDriver.totalDistanceLabel.setText("Best total distance:" + geneticAThread.population.getRoutes().get(0).totalDistance());

        }
        geneticAThread.start();

    }

    public void drawPopulation() {
        drawBestRoute();
        g2D.setColor(Color.RED);
        geneticAThread.population.getRoutes().forEach(x -> {
            ArrayList<City> route = x.getCities();
            drawRoute(route);
        });
        drawBestRoute();
    }

    public void drawBestRoute() {
        g2D.setColor(Color.DARK_GRAY);
        g2D.setStroke(stroke);
        drawRoute(geneticAThread.population.getRoutes().get(0).getCities());
        g2D.setStroke(new BasicStroke(0));
        g2D.setColor(Color.blue);
    }

    private void drawRoute(ArrayList<City> route) {
        City currentCity;
        City nextCity;

        for (int i = 0; i < route.size() - 1; i++) {
            currentCity = route.get(i);
            nextCity = route.get(i + 1);
            g2D.drawLine(currentCity.getX(), currentCity.getY(), nextCity.getX(), nextCity.getY());

        }
        currentCity = route.get(route.size() - 1);
        nextCity = route.get(0);
        g2D.drawLine(currentCity.getX(), currentCity.getY(), nextCity.getX(), nextCity.getY());
    }


    public void selectCities() {
        geneticAThread.population = null;
        Settings.POPULATION_SIZE = 0;
        GraphicDriver.populationNumber.setText(Integer.toString(Settings.POPULATION_SIZE));
        GraphicDriver.settingsPanel.repaint();
        count = 0;
        geneticAThread.initialRoute.clear();
        repaint();

        if (isSelecting) {
            if (mouseAdapter != null) {
                this.removeMouseListener(mouseAdapter);
            }
            mouseAdapter = new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {

                    if (isSelecting) {
                        int x = e.getX();
                        int y = e.getY();
                        String name = Integer.toString(count);

                        int padding = 5;
                        int panelWidth = getWidth();
                        int panelHeight = getHeight();

                        if (x < padding) {
                            x = padding;
                        } else if (x > panelWidth - padding) {
                            x = panelWidth - padding;

                        }
                        if (y < padding) {
                            y = padding;
                        } else if (y > panelHeight - padding) {
                            y = panelHeight - padding;

                        }
                        geneticAThread.initialRoute.add(new City(name, x, y));
                        count++;
                        Settings.POPULATION_SIZE = count;
                        GraphicDriver.populationNumber.setText(Integer.toString(Settings.POPULATION_SIZE));
                        GraphicDriver.settingsPanel.repaint();
                        repaint();
                    }
                }
            };
            this.addMouseListener(mouseAdapter);
        } else {
            isSelecting = true;
            this.removeMouseListener(mouseAdapter);
        }
    }

    public void randomCities() {
        geneticAThread.population = null;
        geneticAThread.initialRoute.clear();
        repaint();
        int height = this.getHeight() - 40;
        int width = this.getWidth() - 40;

        for (int i = 0; i < Settings.NUM_OF_CITIES; i++) {
            String name = Integer.toString(i);
            int coordinateX = (int) (Math.random() * width) + 20;
            int coordinateY = (int) (Math.random() * height) + 20;
            geneticAThread.initialRoute.add(new City(name, coordinateX, coordinateY));
        }
    }

    private void updateCityPositions() {
        if (geneticAThread.initialRoute.isEmpty()) {
            return;
        }

        int panelWidth = getWidth();
        int panelHeight = getHeight();

        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MAX_VALUE;
        int maxY = Integer.MAX_VALUE;

        for (City city : geneticAThread.initialRoute) {
            int x = city.getX();
            int y = city.getY();

            minX = Math.min(minX, x);
            minY = Math.min(minY, y);
            maxX = Math.max(maxX, x);
            maxY = Math.max(maxY, y);
        }

        int rangeX = maxX - minX;
        int rangeY = maxY - minY;

        double scaleX = (double) (panelWidth - 2 * 20) / rangeX;
        double scaleY = (double) (panelHeight - 2 * 20) / rangeY;

        for (City city : geneticAThread.initialRoute) {
            int x = city.getX();
            int y = city.getY();
            city.setX((int) ((x - minX) * scaleX + 20));
            city.setY((int) ((y - minY) * scaleY + 20));
        }
        repaint();
    }

    @Override

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image backgroundImage = new ImageIcon("res/TurkiyeMap.png").getImage();
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        this.g2D = (Graphics2D) g;

        if (geneticAThread.population != null) {
            if (geneticAThread.running)
                drawPopulation();
            else {
                drawBestRoute();
            }
        }

        for (City city : geneticAThread.initialRoute) {
            int x = city.getX();
            int y = city.getY();
            g.fillOval(x - 4, y - 4, 8, 8);
        }
    }

    public void setIsSelecting(boolean b) {
        this.isSelecting = b;
    }
}
