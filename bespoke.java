package com.company;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.util.*;

public class Main {
    public static class bespoke extends JFrame {

        // lunch options
        String[] lunchFood = new String[] {"Szechuan Shredded Pork Rice Bowl", "Chicken & Mushroom Rice Bowl",
                "Sweet & Sour Pork and Pineapple Rice Bowl", "Five Spice Beef Brisket Noodles", "Singapore Vermicelli",
                "Seafood Hofun in Soup", "Mixed Vegetables Noodles in Soup", "Red Curry Chicken Noodles in Soup",
                "Char Siu BBQ Pork Buns", "Egg Yolk Sweet Custard Buns", "Mini Vegetable Spring Rolls"};

        // evening options
        String[] eveningFood = new String[] {"Pork & Prawn Siu Mai Dumplings","Chicken Buns", "Char Siu BBQ Pork Buns","Egg Yolk Sweet Custard Buns",
                "Five Spice Beef Brisket & Egg Noodles in Soup", "Seafood Hofun in Soup", "Mixed Vegetables Noodles in Soup", "Red Curry Chicken Rice Noodles in Soup",
                "Hot & Sour Soup Sweet Potato Vermicelli", "Five Spice Beef Brisket & Egg Noodles", "Beef Black Bean Hofun", "Stir Fried Beef Hofun", "Singapore Vermicelli"};

        // appetizer options
        String[] apps = new String[] {"Prawn Crackers", "Hot & Sour Soup", "Tomato & Egg Drop Soup", "Deep Fried Spicy Tofu Cubes", "Vegetarian Mini Spring Rolls",
                "Lettuce Wraps", "Starter Platter", "Pan Friend Pork Dumplings with Vinegar Dip", "DimSum Taster"};

        // poultry options
        String[] Poultry = new String[]{"Cantonese Sweet & Sour Chicken", "Cantonese Stir Fried Black Bean Chicken", "Thai Red Curry Chicken",
                "Shanghai Crispy Garlic Chicken Nuggets", "Szechuan Fried Chicken with Dried Chilies", "Stir Fried Duck with Spring Onions & Ginger",
                "Thai Red Curry Duck", "Szechuan Spicy \"Ma Lat\" Chicken Hot Pot"};

        // beef and lamb options
        String[] Beef = new String[]{"Beef in Singapore Satay Sauce", "Stir Fried Beef with Leeks", "Thai Red Curry Beef", "Szechuan Spicy Beef",
                "Aromatic Spicy Beef with Chillies in Pot", "Stir Fried Lamb with Spring Onion & Ginger", "Spicy Deep Fried Cumin Lamb Ribs",
                "Sizzling Beef with Oyster Sauce"};

        // pork options
        String[] Pork = new String[]{"Sweet & Sour Pork Strips", "Szechuan Pork in Godmother's Chili Sauce", "Shanghai Braised Sweet Soy Pork Belly & Potato",
                "Szechuan Spicy Tofu & Minced Pork Pot", "Szechuan Spicy Shredded Pork", "Stir Fried Beansprouts with Shredded Pork", "Stir Fried Pork with Green Chili Peppers"};

        // seafood options
        String[] Seafood = new String[]{"Whole Seabass Braised in Shanghai Sauce", "Steam Whole Seabass in Black Bean Sauce", "Fish Slices in Szechuan Red Spicy Peppercorn Broth",
                "King Prawns in Singapore Satay Sauce", "Kung Bo King Prawns", "Sweet & Sour Prawns", "King Prawn Tempura", "Oyster Omelette", "Shanghai Mixed Seafood with Soft Tofu"};

        // vegetable options
        String[] Vegetable = new String[]{"Garlic Sauce Choi Sum", "Garlic Broccoli Florets", "Ginger Chinese Stem Broccoli", "Stir Fried Chinese Leaf",
                "Stewed Aubergine with Fresh Chillies", "Stir Fried Beansprouts", "Thai Style Red Curry Vegetables", "Kung Bo Vegetables", "Stir Fried Tomato & Egg"};

        // dessert options
        String[] Dessert = new String[]{"Toffee Pineapple or Banana", "Movenpick Vanilla or Strawberry Ice Cream", "Lychees Drizzled with Grenadine Syrup",
                "Pineapple or Banana Fritter"};

        // drink options
        String[] Drinks = new String[]{"Pespi or Diet Pepsi", "Lemonade", "Orange Juice", "Apple Juice", "Pineapple Juice", "Mango Juice", "Cranberry Juice", "Passionfruit Juice",
                "Water", "Iced or Hot Milk Tea", "Chinese Tea", "English Tea", "Coffee"};

        // array of all dinner entrees for bespoke to pick random entree
        String[][] entrees = new String[][]{Poultry, Beef, Pork, Seafood, Vegetable};

        // arrays of check boxes for each menu tab
        ArrayList<JCheckBox> selections1 = new ArrayList<>();
        ArrayList<JCheckBox> selections2 = new ArrayList<>();
        ArrayList<JCheckBox> selections3 = new ArrayList<>();
        ArrayList<JCheckBox> selections4 = new ArrayList<>();
        ArrayList<JCheckBox> selections5 = new ArrayList<>();
        ArrayList<JCheckBox> selections6 = new ArrayList<>();
        ArrayList<JCheckBox> selections7 = new ArrayList<>();
        ArrayList<JCheckBox> selections8 = new ArrayList<>();
        ArrayList<JCheckBox> selections9 = new ArrayList<>();
        ArrayList<JCheckBox> selections10 = new ArrayList<>();

        // array of items ordered
        ArrayList<String> cart = new ArrayList<>();

        // to display items ordered
        JTextArea itemsOrdered = new JTextArea();

        // function to reset check boxes
        public void resetBoxes() {
            for (JCheckBox jCheckBox4 : selections1) {
                jCheckBox4.setSelected(false);
            }
            for (JCheckBox jCheckBox3 : selections2) {
                jCheckBox3.setSelected(false);
            }
            for (JCheckBox jCheckBox2 : selections3) {
                jCheckBox2.setSelected(false);
            }
            for (JCheckBox jCheckBox1 : selections4) {
                jCheckBox1.setSelected(false);
            }
            for (JCheckBox element : selections5) {
                element.setSelected(false);
            }
            for (JCheckBox item : selections6) {
                item.setSelected(false);
            }
            for (JCheckBox value : selections7) {
                value.setSelected(false);
            }
            for (JCheckBox box : selections8) {
                box.setSelected(false);
            }
            for (JCheckBox checkBox : selections9) {
                checkBox.setSelected(false);
            }
            for (JCheckBox jCheckBox : selections10) {
                jCheckBox.setSelected(false);
            }
        }

        // function to format headers
        public void format(JLabel name, JPanel page){
            name.setFont(new Font("Helvetica", Font.PLAIN, 40));
            name.setBorder(BorderFactory.createEmptyBorder(20,15,0,0));
            page.add(name, BorderLayout.NORTH);
        }

        public bespoke(){
            super("SoJo Restaurant");

            Container c = getContentPane();

            // header at the top
            JPanel header = new JPanel();
            header.setLayout(new BorderLayout());
            header.setBorder(BorderFactory.createEmptyBorder(10, 10,10,10));
            header.setBackground(Color.BLACK);
            JLabel logo = new JLabel("SoJo Restaurant \uD83C\uDF5C");
            logo.setFont(new Font("Helvetica", Font.PLAIN, 35));
            logo.setForeground(Color.WHITE);
            JLabel loc = new JLabel("\uD83D\uDCCD Oxford, England");
            loc.setFont(new Font("Helvetica", Font.PLAIN, 15));
            loc.setForeground(Color.WHITE);
            header.add(logo, BorderLayout.WEST);
            header.add(loc, BorderLayout.EAST);

            // home page
            JPanel home = new JPanel();
            home.setBackground(Color.LIGHT_GRAY);
            // adding a title
            JLabel story = new JLabel("Our Story");
            story.setFont(new Font("Helvetica", Font.PLAIN, 40));
            story.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
            home.add(story);
            // adding an info blurb
            JTextPane blurb = new JTextPane();
            SimpleAttributeSet attribs = new SimpleAttributeSet();
            StyleConstants.setAlignment(attribs, StyleConstants.ALIGN_CENTER);
            StyleConstants.setFontSize(attribs, 15);
            StyleConstants.setFontFamily(attribs, "Helvetica");
            blurb.setParagraphAttributes(attribs, true);
            blurb.setText("SoJo is not your typical run of the mill Chinese restaurant that " +
                    "dishes out the obligatory items you find in most Chinese " +
                    "restaurants. SoJo aims to serve food that a Chinese grandmother " +
                    "would put on the dinner table. Our dishes come from centuries old, " +
                    "traditional and authentic Chinese recipes which prompted " +
                    "Giles Coren to write about us in The Sunday Times in August 2009.");
            blurb.setEditable(false);
            blurb.setBackground(Color.LIGHT_GRAY);
            blurb.setPreferredSize(new Dimension(580, 140));
            blurb.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
            home.add(blurb);

            // adding bespoke option
            JLabel bespoke = new JLabel("Not sure what to order? Let us pick something for you.");
            bespoke.setBackground(Color.LIGHT_GRAY);
            bespoke.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
            bespoke.setFont(new Font("Helvetica", Font.PLAIN, 15));
            home.add(bespoke);
            JPanel button = new JPanel();
            button.setPreferredSize(new Dimension(580, 100));
            button.setBackground(Color.LIGHT_GRAY);
            JButton go = new JButton("Pick for me!");
            go.setFont(new Font("Helvetica", Font.PLAIN, 12));
            // implement action for bespoke
            go.addActionListener(actionEvent -> {
                double r = Math.random();
                // random drink
                itemsOrdered.append(Drinks[(int)(r * 13)] + "\n");
                r = Math.random();
                // random appetizer
                itemsOrdered.append(apps[(int)(r * 9)] + "\n");
                r = Math.random();
                double r2 = Math.random();
                // random entree
                itemsOrdered.append(entrees[(int)r][(int)(r2 * (entrees[(int)r].length))] + "\n");
                r = Math.random();
                // random dessert
                itemsOrdered.append(Dessert[(int)(r * 4)] + "\n");
            });
            button.add(go);
            home.add(button);

            // lunch menu
            JPanel lunch = new JPanel();
            lunch.setLayout(new BorderLayout());
            lunch.setBackground(Color.LIGHT_GRAY);
            // adding title
            JLabel title1 = new JLabel("LUNCH SPECIALS");
            format(title1, lunch);
            JTextArea items1 = new JTextArea();
            // panel for check boxes
            JPanel boxes1 = new JPanel();
            boxes1.setLayout(new GridLayout(11, 1));
            boxes1.setBackground(Color.LIGHT_GRAY);
            // space check boxes
            boxes1.setBorder(BorderFactory.createEmptyBorder(12,15,70,15));
            // add menu items and check boxes
            for (int i = 0; i < 11; i++){
                items1.append(lunchFood[i] + "\n");
                selections1.add(new JCheckBox());
                boxes1.add(selections1.get(i));
                selections1.get(i).setBackground(Color.LIGHT_GRAY);
                int finalI = i;
                // add action event to add item to cart if selected
                selections1.get(i).addActionListener(actionEvent -> {
                    cart.add(lunchFood[finalI]);
                    itemsOrdered.append(cart.get(cart.size()-1) + "\n");
                });
            }
            items1.setFont(new Font("Helvetica", Font.PLAIN, 15));
            items1.setEditable(false);
            items1.setPreferredSize(new Dimension(350, 400));
            items1.setBackground(Color.LIGHT_GRAY);
            items1.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
            lunch.add(items1, BorderLayout.WEST);
            lunch.add(boxes1, BorderLayout.CENTER);

            // evening menu
            JPanel evening = new JPanel();
            evening.setLayout(new BorderLayout());
            evening.setBackground(Color.LIGHT_GRAY);
            // adding a title
            JLabel title2 = new JLabel("EVENING DIMSUM & NOODLES");
            format(title2, evening);
            JTextArea items2 = new JTextArea();
            // panel for check boxes
            JPanel boxes2 = new JPanel();
            boxes2.setLayout(new GridLayout(13,1));
            boxes2.setBackground(Color.LIGHT_GRAY);
            // spacing the check boxes
            boxes2.setBorder(BorderFactory.createEmptyBorder(15,15,35,15));
            // add menu items and check boxes
            for (int i = 0; i < 13; i++){
                items2.append(eveningFood[i] + "\n");
                selections2.add(new JCheckBox());
                boxes2.add(selections2.get(i));
                selections2.get(i).setBackground(Color.LIGHT_GRAY);
                int finalI = i;
                // add action event to add item to cart if selected
                selections2.get(i).addActionListener(actionEvent -> {
                    cart.add(eveningFood[finalI]);
                    itemsOrdered.append(cart.get(cart.size()-1) + "\n");
                });
            }
            items2.setFont(new Font("Helvetica", Font.PLAIN, 15));
            items2.setEditable(false);
            items2.setPreferredSize(new Dimension(350, 400));
            items2.setBackground(Color.LIGHT_GRAY);
            items2.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
            evening.add(items2, BorderLayout.WEST);
            evening.add(boxes2, BorderLayout.CENTER);

            // dinner tab has its own tab menu
            JPanel dinner = new JPanel();
            dinner.setBackground(Color.LIGHT_GRAY);
            dinner.setLayout(new BorderLayout());

            // appetizers menu
            JPanel appetizers = new JPanel();
            appetizers.setBackground(Color.LIGHT_GRAY);
            appetizers.setLayout(new BorderLayout());
            // adding title
            JLabel title3 = new JLabel("APPETIZERS");
            format(title3, appetizers);
            // panel for check boxes
            JPanel boxes3 = new JPanel();
            boxes3.setLayout(new GridLayout(9,1));
            boxes3.setBackground(Color.LIGHT_GRAY);
            // spacing the check boxes
            boxes3.setBorder(BorderFactory.createEmptyBorder(15,15,810,15)); //fix this
            JTextArea items3 = new JTextArea();
            // add menu items and check boxes
            for (int i = 0; i < 9; i++){
                items3.append(apps[i] + "\n");
                selections3.add(new JCheckBox());
                boxes3.add(selections3.get(i));
                selections3.get(i).setBackground(Color.LIGHT_GRAY);
                // spacing check boxes
                selections3.get(i).setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
                int finalI = i;
                // add action event to add item to cart if selected
                selections3.get(i).addActionListener(actionEvent -> {
                    cart.add(apps[finalI]);
                    itemsOrdered.append(cart.get(cart.size()-1) + "\n");
                });
            }
            items3.setFont(new Font("Helvetica", Font.PLAIN, 15));
            items3.setEditable(false);
            items3.setPreferredSize(new Dimension(350, 400));
            items3.setBackground(Color.LIGHT_GRAY);
            items3.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
            appetizers.add(items3, BorderLayout.WEST);
            appetizers.add(boxes3, BorderLayout.CENTER);

            // poultry menu
            JPanel poultry = new JPanel();
            poultry.setBackground(Color.LIGHT_GRAY);
            poultry.setLayout(new BorderLayout());
            // adding title
            JLabel title4 = new JLabel("POULTRY");
            format(title4, poultry);
            JTextArea items4 = new JTextArea();
            // panel for check boxes
            JPanel boxes4 = new JPanel();
            boxes4.setLayout(new GridLayout(8, 1));
            boxes4.setBackground(Color.LIGHT_GRAY);
            // spacing the check boxes
            boxes4.setBorder(BorderFactory.createEmptyBorder(15,15,830,15)); //fix this
            // add menu items and check boxes
            for (int i = 0; i < 8; i++){
                items4.append(Poultry[i] + "\n");
                selections4.add(new JCheckBox());
                boxes4.add(selections4.get(i));
                selections4.get(i).setBackground(Color.LIGHT_GRAY);
                // spacing check boxes
                selections4.get(i).setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
                int finalI = i;
                // add action event to add item to cart if selected
                selections4.get(i).addActionListener(actionEvent -> {
                    cart.add(Poultry[finalI]);
                    itemsOrdered.append(cart.get(cart.size()-1) + "\n");
                });
            }
            items4.setFont(new Font("Helvetica", Font.PLAIN, 15));
            items4.setEditable(false);
            items4.setPreferredSize(new Dimension(350, 400));
            items4.setBackground(Color.LIGHT_GRAY);
            items4.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
            poultry.add(items4, BorderLayout.WEST);
            poultry.add(boxes4, BorderLayout.CENTER);

            // beef and lamb menu
            JPanel beef = new JPanel();
            beef.setBackground(Color.LIGHT_GRAY);
            beef.setLayout(new BorderLayout());
            // adding title
            JLabel title5 = new JLabel("BEEF & LAMB");
            format(title5, beef);
            JTextArea items5 = new JTextArea();
            // panel for check boxes
            JPanel boxes5 = new JPanel();
            boxes5.setLayout(new GridLayout(8,1));
            boxes5.setBackground(Color.LIGHT_GRAY);
            // spacing the check boxes
            boxes5.setBorder(BorderFactory.createEmptyBorder(15,15,830,15));
            // add menu items and check boxes
            for (int i = 0; i < 8; i++){
                items5.append(Beef[i] + "\n");
                selections5.add(new JCheckBox());
                boxes5.add(selections5.get(i));
                selections5.get(i).setBackground(Color.LIGHT_GRAY);
                // spacing check boxes
                selections5.get(i).setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
                int finalI = i;
                // add action event to add item to cart if selected
                selections5.get(i).addActionListener(actionEvent -> {
                    cart.add(Beef[finalI]);
                    itemsOrdered.append(cart.get(cart.size()-1) + "\n");
                });
            }
            items5.setFont(new Font("Helvetica", Font.PLAIN, 15));
            items5.setEditable(false);
            items5.setPreferredSize(new Dimension(350, 400));
            items5.setBackground(Color.LIGHT_GRAY);
            items5.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
            beef.add(items5, BorderLayout.WEST);
            beef.add(boxes5, BorderLayout.CENTER);

            // pork menu
            JPanel pork = new JPanel();
            pork.setBackground(Color.LIGHT_GRAY);
            pork.setLayout(new BorderLayout());
            // adding title
            JLabel title6 = new JLabel("PORK");
            format(title6, pork);
            JTextArea items6 = new JTextArea();
            // panel for check boxes
            JPanel boxes6 = new JPanel();
            boxes6.setLayout(new GridLayout(7,1));
            boxes6.setBackground(Color.LIGHT_GRAY);
            // spacing the check boxes
            boxes6.setBorder(BorderFactory.createEmptyBorder(15,15,845,15));
            // adding menu items and check boxes
            for (int i = 0; i < 7; i++){
                items6.append(Pork[i] + "\n");
                selections6.add(new JCheckBox());
                boxes6.add(selections6.get(i));
                selections6.get(i).setBackground(Color.LIGHT_GRAY);
                // spacing check boxes
                selections6.get(i).setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
                int finalI = i;
                // add action event to add item to cart if selected
                selections6.get(i).addActionListener(actionEvent -> {
                    cart.add(Pork[finalI]);
                    itemsOrdered.append(cart.get(cart.size()-1) + "\n");
                });
            }
            items6.setFont(new Font("Helvetica", Font.PLAIN, 15));
            items6.setEditable(false);
            items6.setPreferredSize(new Dimension(375, 400));
            items6.setBackground(Color.LIGHT_GRAY);
            items6.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
            pork.add(items6, BorderLayout.WEST);
            pork.add(boxes6, BorderLayout.CENTER);

            // seafood menu
            JPanel seafood = new JPanel();
            seafood.setBackground(Color.LIGHT_GRAY);
            seafood.setLayout(new BorderLayout());
            // adding title
            JLabel title7 = new JLabel("SEAFOOD");
            format(title7, seafood);
            // panel for check boxes
            JPanel boxes7 = new JPanel();
            boxes7.setLayout(new GridLayout(9,1));
            boxes7.setBackground(Color.LIGHT_GRAY);
            // spacing the check boxes
            boxes7.setBorder(BorderFactory.createEmptyBorder(12,15,808,15));
            // adding menu items and check boxes
            JTextArea items7 = new JTextArea();
            for (int i = 0; i < 9; i++){
                items7.append(Seafood[i] + "\n");
                selections7.add(new JCheckBox());
                boxes7.add(selections7.get(i));
                selections7.get(i).setBackground(Color.LIGHT_GRAY);
                // spacing check boxes
                selections7.get(i).setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
                int finalI = i;
                // add action event to add item to cart if selected
                selections7.get(i).addActionListener(actionEvent -> {
                    cart.add(Seafood[finalI]);
                    itemsOrdered.append(cart.get(cart.size()-1) + "\n");
                });
            }
            items7.setFont(new Font("Helvetica", Font.PLAIN, 15));
            items7.setEditable(false);
            items7.setPreferredSize(new Dimension(350, 400));
            items7.setBackground(Color.LIGHT_GRAY);
            items7.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
            seafood.add(items7, BorderLayout.WEST);
            seafood.add(boxes7, BorderLayout.CENTER);

            // vegetable menu
            JPanel vegetable = new JPanel();
            vegetable.setBackground(Color.LIGHT_GRAY);
            vegetable.setLayout(new BorderLayout());
            // adding title
            JLabel title8 = new JLabel("VEGETABLE");
            format(title8, vegetable);
            // panel for check boxes
            JPanel boxes8 = new JPanel();
            boxes8.setLayout(new GridLayout(8,1));
            boxes8.setBackground(Color.LIGHT_GRAY);
            // spacing the check boxes
            boxes8.setBorder(BorderFactory.createEmptyBorder(10,15,825,15));
            // adding menu items and check boxes
            JTextArea items8 = new JTextArea();
            for (int i = 0; i < 8; i++){
                items8.append(Vegetable[i] + "\n");
                selections8.add(new JCheckBox());
                boxes8.add(selections8.get(i));
                selections8.get(i).setBackground(Color.LIGHT_GRAY);
                // spacing check boxes
                selections8.get(i).setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
                int finalI = i;
                // add action event to add item to cart if selected
                selections8.get(i).addActionListener(actionEvent -> {
                    cart.add(Vegetable[finalI]);
                    itemsOrdered.append(cart.get(cart.size()-1) + "\n");
                });
            }
            items8.setFont(new Font("Helvetica", Font.PLAIN, 15));
            items8.setEditable(false);
            items8.setPreferredSize(new Dimension(290, 400));
            items8.setBackground(Color.LIGHT_GRAY);
            items8.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
            vegetable.add(items8, BorderLayout.WEST);
            vegetable.add(boxes8, BorderLayout.CENTER);

            // dessert menu
            JPanel dessert = new JPanel();
            dessert.setBackground(Color.LIGHT_GRAY);
            dessert.setLayout(new BorderLayout());
            // adding title
            JLabel title9 = new JLabel("DESSERT");
            format(title9, dessert);
            // panel for check boxes
            JPanel boxes9 = new JPanel();
            boxes9.setLayout(new GridLayout(4,1));
            boxes9.setBackground(Color.LIGHT_GRAY);
            // spacing check boxes
            boxes9.setBorder(BorderFactory.createEmptyBorder(15,15,900,15));
            // adding menu items and check boxes
            JTextArea items9 = new JTextArea();
            for (int i = 0; i < 4; i++) {
                items9.append(Dessert[i] + "\n");
                selections9.add(new JCheckBox());
                boxes9.add(selections9.get(i));
                selections9.get(i).setBackground(Color.LIGHT_GRAY);
                // spacing check boxes
                selections9.get(i).setBorder(BorderFactory.createEmptyBorder(1,0,0,0));
                int finalI = i;
                // add action event to add item to cart if selected
                selections9.get(i).addActionListener(actionEvent -> {
                    cart.add(Dessert[finalI]);
                    itemsOrdered.append(cart.get(cart.size()-1) + "\n");
                });
            }
            items9.setFont(new Font("Helvetica", Font.PLAIN, 15));
            items9.setEditable(false);
            items9.setPreferredSize(new Dimension(330, 400));
            items9.setBackground(Color.LIGHT_GRAY);
            items9.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
            dessert.add(items9, BorderLayout.WEST);
            dessert.add(boxes9, BorderLayout.CENTER);

            // creating the tabbed pane for the dinner menu
            JTabbedPane opts = new JTabbedPane();
            opts.setBounds(0,90, 780, 400);
            opts.add("APPETIZERS", appetizers);
            opts.add("POULTRY", poultry);
            opts.add("BEEF & LAMB", beef);
            opts.add("PORK", pork);
            opts.add("SEAFOOD", seafood);
            opts.add("VEGETABLE", vegetable);
            opts.add("DESSERT", dessert);
            dinner.add(opts, BorderLayout.NORTH);

            // drinks menu
            JPanel drinks = new JPanel();
            drinks.setBackground(Color.LIGHT_GRAY);
            drinks.setLayout(new BorderLayout());
            // adding title
            JLabel title10 = new JLabel("DRINKS");
            format(title10, drinks);
            JTextArea items10 = new JTextArea();
            // panel for check boxes
            JPanel boxes10 = new JPanel();
            boxes10.setLayout(new GridLayout(13,1));
            boxes10.setBackground(Color.LIGHT_GRAY);
            // spacing the check boxes
            boxes10.setBorder(BorderFactory.createEmptyBorder(15,15,35,15));
            // adding menu items and check boxes
            for (int i = 0; i < 13; i++){
                items10.append(Drinks[i] + "\n");
                selections10.add(new JCheckBox());
                boxes10.add(selections10.get(i));
                selections10.get(i).setBackground(Color.LIGHT_GRAY);
                int finalI = i;
                // add action event to add item to cart if selected
                selections10.get(i).addActionListener(actionEvent -> {
                    cart.add(Drinks[finalI]);
                    itemsOrdered.append(cart.get(cart.size()-1) + "\n");
                });
            }
            items10.setFont(new Font("Helvetica", Font.PLAIN, 15));
            items10.setEditable(false);
            items10.setPreferredSize(new Dimension(200, 400));
            items10.setBackground(Color.LIGHT_GRAY);
            items10.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
            drinks.add(items10, BorderLayout.WEST);
            drinks.add(boxes10, BorderLayout.CENTER);

            // order panel to display order
            JPanel order = new JPanel();
            order.setBackground(Color.LIGHT_GRAY);
            order.setLayout(new BorderLayout());
            // adding title
            JLabel title11 = new JLabel("Your Order:");
            title11.setFont(new Font("Helvetica", Font.PLAIN, 40));
            title11.setBorder(BorderFactory.createEmptyBorder(20,15,0,0));
            order.add(title11, BorderLayout.NORTH);
            itemsOrdered.setFont(new Font("Helvetica", Font.PLAIN, 15));
            itemsOrdered.setEditable(false);
            itemsOrdered.setPreferredSize(new Dimension(350, 400));
            itemsOrdered.setBackground(Color.LIGHT_GRAY);
            itemsOrdered.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
            order.add(itemsOrdered, BorderLayout.WEST);
            JPanel buttons = new JPanel();
            buttons.setBackground(Color.LIGHT_GRAY);
            // button to clear order
            JButton clear = new JButton("Clear Order");
            clear.addActionListener(actionEvent -> {
                // clear display
                itemsOrdered.setText("");
                // reset all check boxes
                resetBoxes();
            });
            // checkout button creates dialog box and clears order
            JButton checkout = new JButton("Checkout");
            checkout.addActionListener(actionEvent -> {
                JDialog thanks = new JDialog();
                thanks.setSize(new Dimension(300, 200));
                JPanel dialog = new JPanel();
                dialog.setLayout(new BorderLayout());
                JLabel done = new JLabel("Thanks for your order!", SwingConstants.CENTER);
                dialog.add(done, BorderLayout.CENTER);
                JButton ok = new JButton("OK");
                // ok button closes dialog box
                ok.addActionListener(actionEvent1 -> thanks.setVisible(false));
                dialog.add(ok, BorderLayout.SOUTH);
                thanks.add(dialog);
                thanks.setVisible(true);
                // clear display
                itemsOrdered.setText("");
                // reset all check boxes
                resetBoxes();
            });
            buttons.add(clear, BorderLayout.SOUTH);
            buttons.add(checkout, BorderLayout.NORTH);
            order.add(buttons, BorderLayout.SOUTH);

            // creates main tabbed menu
            JTabbedPane navbar = new JTabbedPane();
            navbar.setBounds(0,60,780,420);
            navbar.add("HOME", home);
            navbar.add("LUNCH SPECIALS", lunch);
            navbar.add("EVENING DIMSUM & NOODLES", evening);
            navbar.add("DINNER MENU", dinner);
            navbar.add("DRINKS", drinks);
            navbar.add("ORDER", order);

            // add to frame
            c.add(header, BorderLayout.NORTH);
            c.add(navbar);
            c.setBackground(Color.BLACK);
            setSize(780, 475);
            setVisible(true);
        }
    }
    public static void main(String[] args) {
        bespoke menu = new bespoke();
        menu.addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent e){
                        System.exit(0);
                    }
                }
        );
    }
}
