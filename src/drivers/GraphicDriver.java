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


        //setting panel for selection  -- number of cities
        settingsPanel.setBackground(new java.awt.Color(179, 204, 255));

        settingsLabel1.setFont(new java.awt.Font("Arial", 0, 18));
        settingsLabel1.setText("Number of cities");

        settingsBox1.setFont(new java.awt.Font("Arial", 0, 15));
        settingsBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"10", "12", "15", "20", "25", "30", "40", "50"}));
        settingsBox1.setSelectedItem("10");
        settingsBox1.addActionListener(e -> {
            Settings.NUM_OF_CITIES = Integer.parseInt((String) settingsBox1.getSelectedItem());
        });

        //if select button pressed, populationNumber
        populationNumber.setFont(new java.awt.Font("Arial", 0, 15));
        populationNumber.setText("000");


        //population size settings
        settingsLabel2.setFont(new java.awt.Font("Arial", 0, 18));
        settingsLabel2.setText("Population Size");

        settingsBox2.setFont(new java.awt.Font("Arial", 0, 15));
        settingsBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"5", "8", "10", "15", "30", "40", "50"}));
        settingsBox2.setSelectedItem("10");
        settingsBox2.addActionListener(e -> {
            Settings.POPULATION_SIZE = Integer.parseInt((String) settingsBox2.getSelectedItem());
        });

        //number of generations settings
        settingsLabel3.setFont(new java.awt.Font("Arial", 0, 18));
        settingsLabel3.setText("Number of generations");

        settingsBox3.setFont(new java.awt.Font("Arial", 0, 15));
        settingsBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"15", "30", "50", "100", "200", "300", "500", "800", "1000"}));
        settingsBox3.setSelectedItem("30");
        settingsBox3.addActionListener(e -> {
            Settings.GENERATION_LIMIT = Integer.parseInt((String) settingsBox3.getSelectedItem());
        });


        //mutation rate settings
        settingsLabel4.setFont(new java.awt.Font("Arial", 0, 18));
        settingsLabel4.setText("Mutation rate");

        settingsBox4.setFont(new java.awt.Font("Arial", 0, 15));
        settingsBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"0%", "2%", "3%", "5%", "6%", "8%", "10%", "50%", "100%"}));
        settingsBox4.setSelectedItem("5%");
        settingsBox4.addActionListener(e -> {
            String selectedItem = (String) settingsBox4.getSelectedItem();
            //convert  to double values
            double setValue;
            switch (selectedItem){
                case "0%": setValue = 0;
                break;
                case "2%": setValue = 0.02;
                break;
                case "3%" : setValue = 0.03;
                break;
                case "5%" : setValue = 0.05;
                break;
                case "6%" : setValue = 0.06;
                break;
                case "8%" : setValue = 0.08;
                break;
                case "10%": setValue = 0.1;
                break;
                case "50%" :setValue = 0.5;
                break;
                case "100%" : setValue = 1;
                break;
                default: setValue = 0.05;
            }
            Settings.MUTATION_RATE = setValue;
        });

        // selection settings
        settingsLabel5.setFont(new java.awt.Font("Arial", 0, 18));
        settingsLabel5.setText("Selection");

        settingsBox5.setFont(new java.awt.Font("Arial", 0, 15));
        settingsBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"2", "3","4", "5","6","7","8","9","10"}));
        settingsBox5.setSelectedItem("4");
        settingsBox5.addActionListener(e -> {
            Settings.SELECTION_SIZE = Integer.parseInt((String) settingsBox5.getSelectedItem());

        });


        //elite routes settings
        settingsLabel6.setFont(new java.awt.Font("Arial", 0, 18));
        settingsLabel6.setText("Elite Routes");

        settingsBox6.setFont(new java.awt.Font("Arial",0,15));
        settingsBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"0","1","2", "3","4", "5","6","7","8"}));
        settingsBox6.setSelectedItem("1");
        settingsBox6.addActionListener(e -> {
            Settings.NUMB_OF_ELITE_ROUTES = Integer.parseInt((String) settingsBox6.getSelectedItem());

        });

        //animation speed settings
        settingsLabel7.setFont(new java.awt.Font("Arial", 0, 18));
        settingsLabel7.setText("Animation speed");

        settingsBox7.setFont(new java.awt.Font("Arial", 0, 15));
        settingsBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"10%","20%","30%","40%","50%","60%","70%","80%","90%","100%"}));
        settingsBox7.setSelectedItem("100%");
        settingsBox7.addActionListener(e -> {
            String selectedItem = (String) settingsBox7.getSelectedItem();

            int setValue;
            switch (selectedItem){
                case "10%" : setValue = 1000;
                break;
                case "20%": setValue = 900;
                break;
                case "30%": setValue = 800;
                break;
                case "40%": setValue = 700;
                break;
                case "50%":setValue = 500;
                break;
                case "60%" : setValue = 400;
                break;
                case "70%" : setValue = 300;
                break;
                case "80%": setValue = 200;
                break;
                case "90%": setValue = 100;
                break;
                case "100%": setValue = 20;
                break;
                default: setValue = 100;
            }
            Settings.DELAY = setValue;
        });

        //layout for settingspanel
        javax.swing.GroupLayout settingsPanelLayout = new javax.swing.GroupLayout(settingsPanel);
        settingsPanel.setLayout(settingsPanelLayout);
        settingsPanelLayout.setHorizontalGroup(
                settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(settingsPanelLayout.createSequentialGroup()
                                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(settingsPanelLayout.createSequentialGroup()
                                                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(settingsPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                .addComponent(settingsLabel4)
                                                                .addComponent(settingsLabel5)
                                                                .addComponent(settingsLabel6)
                                                                .addComponent(settingsLabel2)
                                                                .addComponent(settingsLabel3))
                                                        .addComponent(settingsLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addGap(10,10,10))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsPanelLayout.createSequentialGroup()
                                                .addComponent(settingsLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(populationNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(settingsBox5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE )
                                        .addComponent(settingsBox4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(settingsBox3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(settingsBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(settingsBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(settingsBox6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(settingsBox7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))

        );

        settingsPanelLayout.setVerticalGroup(
                settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(settingsPanelLayout.createSequentialGroup()
                                .addGroup(0,0,0)
                                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(settingsBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(populationNumber)
                                        .addComponent(settingsLabel1))
                                .addGap(20,20,20)
                                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(settingsLabel2)
                                        .addComponent(settingsBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20,20,20)
                                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(settingsBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(settingsLabel3))
                                .addGap(20,20,20)
                                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(settingsLabel4)
                                        .addComponent(settingsBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20,20,20)
                                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(settingsBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(settingsLabel5))
                                .addGap(20,20,20)
                                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(settingsPanelLayout.createSequentialGroup()
                                                .addComponent(settingsBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(20,20,20)
                                                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(settingsBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(settingsLabel7)))
                                        .addComponent(settingsLabel6))
                                .addGap(0,0,0))
        );

        copyrightLabel.setText("Copyright 2023 betulsahin");

        //right panel layout
        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
                rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(rightPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(divider4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(settingsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(divider3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(divider2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(divider1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(rightPanelLayout.createSequentialGroup()
                                                .addGap(33,33,33)
                                                .addComponent(titleLabel)))
                                .addGap(0,0,Short.MAX_VALUE))
                        .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(rightPanelLayout.createSequentialGroup()
                                                .addGap(65,65,65)
                                                .addComponent(explanatoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(rightPanelLayout.createSequentialGroup()
                                                .addGap(79,79,79)
                                                .addComponent(copyrightLabel)))
                                .addContainerGap(49, Short.MAX_VALUE))
        );

        rightPanelLayout.setVerticalGroup(
                rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGap(23,23,23)
                                .addComponent(titleLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(divider1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13,13,13)
                                .addComponent(divider2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18,18,18)
                                .addComponent(explanatoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18,18,18)
                                .addComponent(divider3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18,18,18)
                                .addComponent(settingsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(divider4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(copyrightLabel)
                                .addGap(12,12,12))
        );


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(0,0,0)
                                .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();

        settingsPanel.remove(populationNumber);
        repaint();
        setVisible(true);

    }


    //animation part




}