package src.animation;

import src.drivers.GraphicDriver;
import src.tsp.*;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class GeneticAThread implements Runnable {

    private final DecimalFormat DF = new DecimalFormat("#.###");

    private Thread geneticAThread;

    public ArrayList<City> initialRoute;

    public Population population;

    private AnimationPanel panel;

    public boolean running = false;

    private int generationNumber = 1;

    public GeneticAThread(AnimationPanel panel) {
        this.panel = panel;
    }

    public void start(){
        if (population == null)
            return;
        generationNumber = 0;
        running = true;
        geneticAThread = new Thread(this);
        geneticAThread.start();
    }

    public void stop(){
        if (geneticAThread == null)
            return;
        running = false;
        geneticAThread.interrupt();
        geneticAThread = null;
    }

    @Override
    public void run(){
        if (!running)
            return;

        GeneticAlgorithm geneticAlgorithm = new GeneticAlgorithm(initialRoute);

        while (running && generationNumber < Settings.GENERATION_LIMIT+1){
            GraphicDriver.generationLabel.setText("Generation: "+ generationNumber++);
            population = geneticAlgorithm.evolve(population);
            population.sortRoutesByFitness();
            GraphicDriver.fitnessLabel.setText("Highest Fitness:"+ DF.format(population.getRoutes().get(0).getFitness()));
            GraphicDriver.totalDistanceLabel.setText("Best total distance:"+ population.getRoutes().get(0).totalDistance());
            panel.repaint();

            try{
                Thread.sleep(Settings.DELAY);

            } catch (InterruptedException e){

            }
        }
        running = false;
        panel.repaint();
    }

}
