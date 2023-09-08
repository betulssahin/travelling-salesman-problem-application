package src.drivers;

import src.animation.AnimationPanel;
import src.tsp.Settings;

import javax.swing.*;
import java.awt.Color;



public class GraphicDriver extends javax.swing.JFrame {

    //declaration
    //  RightPanel and its components
    private javax.swing.JPanel rightPanel;

    //  Title (Traveling salesman)
    private javax.swing.JLabel titleLabel;

    //  divider lines
    private javax.swing.JSeparator divider1;
    private javax.swing.JSeparator divider2;
    private javax.swing.JSeparator divider3;
    private javax.swing.JSeparator divider4;

    //  Buttons panel with start,random and select.
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JButton startButton;
    private javax.swing.JButton randomButton;
    private javax.swing.JButton selectButton;
    private javax.swing.JLabel copyrightLabel;

    //  Explanatory panel with information about  the animation
    private javax.swing.JPanel explanatoryPanel;
    private javax.swing.JLabel bestRouteLabel;
    private javax.swing.JLabel citiesLabel;
    private javax.swing.JLabel routesLabel;
    private javax.swing.JLabel image1;
    private javax.swing.JLabel image2;
    private javax.swing.JLabel image3;

    //  Panel for animation settings
    public static javax.swing.JPanel settingsPanel;
    //  Population number appears when the select button is pressed.
    public static javax.swing.JLabel populationNumber;
    //  Settings texts
    private javax.swing.JLabel settingsLabel1;
    private javax.swing.JLabel settingsLabel2;
    private javax.swing.JLabel settingsLabel3;
    private javax.swing.JLabel settingsLabel4;
    private javax.swing.JLabel settingsLabel5;
    private javax.swing.JLabel settingsLabel6;
    private javax.swing.JLabel settingsLabel7;
    //  Settings boxes
    private javax.swing.JComboBox<String> settingsBox1;
    private javax.swing.JComboBox<String> settingsBox2;
    private javax.swing.JComboBox<String> settingsBox3;
    private javax.swing.JComboBox<String> settingsBox4;
    private javax.swing.JComboBox<String> settingsBox5;
    private javax.swing.JComboBox<String> settingsBox6;
    private javax.swing.JComboBox<String> settingsBox7;

    //  Left panel and its components
    private javax.swing.JPanel leftPanel;
    //  Header with fitness, generation number and best total distance values.
    private javax.swing.JPanel headerPanel;
    public static java.awt.Label fitnessLabel;
    public static java.awt.Label generationLabel;
    public static java.awt.Label totalDistanceLabel;

    //  Canvas for the animation
    private AnimationPanel panel1;

    public GraphicDriver() {

        initComponents();
    }
    // for initializing components and building the JFrame
    private void initComponents() {

        //creating instance of each variable
        settingsLabel1 = new javax.swing.JLabel();
        settingsLabel2 = new javax.swing.JLabel();
        settingsLabel3 = new javax.swing.JLabel();
        settingsLabel4 = new javax.swing.JLabel();
        settingsLabel5 = new javax.swing.JLabel();
        settingsLabel6 = new javax.swing.JLabel();
        settingsLabel7 = new javax.swing.JLabel();

        settingsBox1 = new javax.swing.JComboBox<>();
        settingsBox2 = new javax.swing.JComboBox<>();
        settingsBox3 = new javax.swing.JComboBox<>();
        settingsBox4 = new javax.swing.JComboBox<>();
        settingsBox5 = new javax.swing.JComboBox<>();
        settingsBox6 = new javax.swing.JComboBox<>();
        settingsBox7 = new javax.swing.JComboBox<>();

        leftPanel = new javax.swing.JPanel();
        rightPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();

        panel1 = new AnimationPanel();

        buttonsPanel = new javax.swing.JPanel();
        settingsPanel = new javax.swing.JPanel();
        explanatoryPanel = new javax.swing.JPanel();

       // panel1 = new AnimationPanel();

        divider1 = new javax.swing.JSeparator();
        divider2 = new javax.swing.JSeparator();
        divider3 = new javax.swing.JSeparator();
        divider4 = new javax.swing.JSeparator();

        generationLabel = new java.awt.Label();
        totalDistanceLabel = new java.awt.Label();
        fitnessLabel = new java.awt.Label();

        populationNumber = new JLabel();

        titleLabel = new javax.swing.JLabel();
        copyrightLabel = new javax.swing.JLabel();

        randomButton = new javax.swing.JButton();
        selectButton = new javax.swing.JButton();
        startButton = new javax.swing.JButton();

        citiesLabel = new javax.swing.JLabel();
        routesLabel = new javax.swing.JLabel();
        bestRouteLabel = new javax.swing.JLabel();

        image1 = new javax.swing.JLabel();
        image2 = new javax.swing.JLabel();
        image3 = new javax.swing.JLabel();

        //JFrame settings
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        setBackground(Color.BLUE);
        setMinimumSize(new java.awt.Dimension(1360, 765));
        setPreferredSize(new java.awt.Dimension(1360, 765));

        ImageIcon icon = new ImageIcon("res/map.png");
        setIconImage(icon.getImage());
        setTitle("Traveling Salesman Problem Application");

        //header panel settings
        headerPanel.setBackground(new java.awt.Color(255, 230, 179));


        //Label for generation
        generationLabel.setFont (new java.awt.Font("Arial", 0, 18));
        generationLabel.setForeground(new java.awt.Color(31, 31, 31 ));
        generationLabel.setText("Generation: 000");

        //Label for best total distance
        totalDistanceLabel.setFont(new java.awt.Font("Arial", 0, 18));
        totalDistanceLabel.setForeground(new java.awt.Color(31, 31, 31));
        totalDistanceLabel.setText("Best Total Distance: 00000");

        //label for highest fitness
        fitnessLabel.setFont(new java.awt.Font("Arial", 0, 18));
        fitnessLabel.setForeground(new java.awt.Color(31, 31, 31));
        fitnessLabel.setText("Highest Fitness: 0.000");

        //header panel layout
        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);

        headerPanelLayout.setHorizontalGroup(
                headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(headerPanelLayout.createSequentialGroup()
                                .addContainerGap(50, Short.MAX_VALUE)
                                .addComponent(generationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(80, 80, 80)
                                .addComponent(totalDistanceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(80, 80, 80)
                                .addComponent(fitnessLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap(50, Short.MAX_VALUE))
        );

        headerPanelLayout.setVerticalGroup(
                headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment. LEADING)
                        .addComponent(totalDistanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fitnessLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(generationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        leftPanel.setBackground(Color.BLACK);
        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
                leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(leftPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        leftPanelLayout.setVerticalGroup(
                leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(leftPanelLayout.createSequentialGroup()
                                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())

        );


        //right panel settings
        rightPanel.setBackground(new java.awt.Color(179, 204, 255));
        rightPanel.setFont(new java.awt.Font("Arial", 0, 25));

        //title label
        titleLabel.setFont(new java.awt.Font("Arial", 0, 25));
        titleLabel.setText("Welcome");
        titleLabel.setToolTipText("");

        //button panel
        buttonsPanel.setBackground(new java.awt.Color(204, 179, 255));

        //random button
        randomButton.setBackground(new java.awt.Color(191, 255, 179));
        randomButton.setFont(new java.awt.Font("Arial", 0, 18));
        randomButton.setForeground(new java.awt.Color(36, 36, 36));
        randomButton.setText("Random");
        randomButton.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                randomButtonActionPerformed(evt);
            }
        });

        //select button
        selectButton.setBackground(new java.awt.Color(191, 255, 179));
        selectButton.setFont(new java.awt.Font("Arial", 0, 18));
        selectButton.setForeground(new java.awt.Color(36, 36, 36));
        selectButton.setText("Select");
        selectButton.addActionListener(new java.awt.event.ActionEvent(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                selectButtonActionPerformed(evt);
            }
        });

        //start button
        startButton.setBackground(new java.awt.Color(191, 255, 179));
        startButton.setFont(new java.awt.Font("Arial", 0, 18));
        startButton.setForeground(new java.awt.Color(36, 36, 36));
        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionEvent(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                startButtonActionPerformed(evt);
            }
        });

        //layout for buttonsPanel
        javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
                buttonsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(buttonsPanelLayout.createSequentialGroup()
                                .addComponent(startButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(13, 13, 13)
                                .addComponent(randomButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(13, 13, 13)
                                .addComponent(selectButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonsPanelLayout.setVerticalGroup(
                buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(buttonsPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(randomButton)
                                        .addComponent(selectButton)
                                        .addComponent(startButton))
                                .addContainerGap(8, Short.MAX_VALUE))
        );

        //explanatoryPanel
        explanatoryPanel.setBackground(new java.awt.Color(179, 204, 255));

        citiesLabel.setFont(new java.awt.Font("Arial", 0, 18));
        citiesLabel.setText("Cities");  //number of cities ?

        ImageIcon icon1 = new ImageIcon("res/city.png");
        image1.setIcon(icon1);

        bestRouteLabel.setFont(new java.awt.Font("Arial", 0, 18));
        bestRouteLabel.setText("the best route");
        ImageIcon icon2 = new ImageIcon("res/line1.png");
        image2.setIcon(icon2);

        routesLabel.setFont(new java.awt.Font("Arial", 0, 18));
        routesLabel.setText("possible routes");
        ImageIcon icon3 = new ImageIcon("res/line2.png");
        image3.setIcon(icon3);


        //layout for explanatory panel
        javax.swing.GroupLayout explanatoryPanelLayout = new javax.swing.GroupLayout(explanatoryPanel);
        explanatoryPanel.setLayout(explanatoryPanelLayout);

        explanatoryPanelLayout.setHorizontalGroup(
                explanatoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(explanatoryPanelLayout.createSequentialGroup()
                                .addGroup(explanatoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(explanatoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(image2)
                                                .addComponent(image3))
                                        .addComponent(image1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(explanatoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(routesLabel)
                                        .addComponent(bestRouteLabel)
                                        .addComponent(citiesLabel)))
        );

        explanatoryPanelLayout.setVerticalGroup(
                explanatoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(explanatoryPanelLayout.createSequentialGroup()
                                .addGroup(explanatoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(image1)
                                        .addComponent(citiesLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(explanatoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bestRouteLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(image2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(explanatoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(explanatoryPanelLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(routesLabel))
                                        .addGroup(explanatoryPanelLayout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(image3))))
        );


        //setting panel for selection
        settingsPanel.setBackground(new java.awt.Color(179, 204, 255));

        settingsLabel1.setFont(new java.awt.Font("Arial", 0, 18));
        settingsLabel1.setText("Number of cities");

        settingsBox1.setFont(new java.awt.Font("Arial", 0, 15));
        settingsBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"10", "12", "15", "20", "25", "30", "40", "50"}));
        settingsBox1.setSelectedItem("10");
        settingsBox1.addActionListener(e -> {
            Settings.NUM_OF_CITIES = Integer.parseInt((String) settingsBox1.getSelectedItem());
        });
        

    }






}