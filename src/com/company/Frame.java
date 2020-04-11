package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class Frame extends JFrame {
    // for the north we need 5 labels and 4 text fields and 2 buttons
    private JPanel northPanel ,p1 , p2 ,p3 , p4;
    private JLabel bigLabel , barcodeLabel , productLabel , priceLabel , quantityLabel;
    private Font blueFon ;
    private JTextField text1 , text2 , text3 , text4;
    private JButton insert , clear;
    private Container container;
    private BorderLayout borderLayout;

    //for the center we need 1 label and 2 radiobuttons and button and 1 textfield

    private JLabel searchLabel , l1;
    private JPanel centerPanel,p5 ,p6 , p7 , p8;
    private JRadioButton barcode , product;
    private ButtonGroup buttonGroup;
    private JButton find ;
    private JTextField findText;
    private JTextArea big;

    // for south we need 3 labels and 2 text fields 1 jcombobox 1 button
    private JPanel southPanel , p9 ,p10;
    private JLabel updateLabel , newLabel ,barlabel;
    private JComboBox comboBox ;
    private JTextField  text , secondText;
    private JButton update;
    private String names[] = {"-------------","Product" , "Price" , "Quantity"};
    public Frame(){
        super("Store inventory");
        borderLayout = new BorderLayout(0,2);
        setLayout(borderLayout);

        container = getContentPane();
        container.setBackground(Color.pink);
        northPanel = new JPanel();
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();


        //Adding for south!!
        southPanel = new JPanel();
        p9 = new JPanel();
        p10 = new JPanel();

        updateLabel = new JLabel("Update Product :");
        updateLabel.setForeground(Color.CYAN);

        barlabel = new JLabel("Barcode");
        comboBox = new JComboBox(names);
        text = new JTextField(20);
        newLabel = new JLabel("New Value");
        secondText = new JTextField(20);
        update = new JButton(" Update ");
        //finsh south

        blueFon = new Font("Garamond",3 ,20);
        updateLabel.setFont(blueFon); // for south
        //for the buttons
        insert = new JButton(" Insert ");
        clear = new JButton(" Clear ");
        //for the first panel
        bigLabel = new JLabel("New Product :");
        bigLabel.setFont(blueFon);
        bigLabel.setForeground(Color.cyan);

        barcodeLabel = new JLabel("Barcode :");
        productLabel = new JLabel("Product name :");
        priceLabel = new JLabel("Price :");
        quantityLabel = new JLabel("Quantity :");
        //adding texts for north
        text1 = new JTextField(15);
        text2 = new JTextField(15);
        text3 = new JTextField(15);
        text4 = new JTextField(15);
        //done for text fields

        //adding for center
        p5 = new JPanel();
        p6 = new JPanel();
        p7 = new JPanel();
        p8 = new JPanel();
        l1 = new JLabel(" Choose one choice :");
        l1.setFont(new Font("Garamond" ,1,16));
        l1.setForeground(Color.GREEN);
        centerPanel = new JPanel();
        searchLabel = new JLabel("Search Product By :");
        searchLabel.setFont(blueFon);
        searchLabel.setForeground(Color.CYAN);
        //adding for center - second panel
        buttonGroup = new ButtonGroup();
        barcode = new JRadioButton("Barcode" ,true);
        product = new JRadioButton("Product Name");
        buttonGroup.add(barcode); buttonGroup.add(product);

        //adding for center find and textfield
        find = new JButton(" Find ");
        findText = new JTextField(30);

        //adding for center -textArea
        big = new JTextArea(120,60);
        big.setEditable(false);


        //for adding to north border
        northPanel.setLayout(new GridLayout(4 ,4));
        //bigLabel.setHorizontalAlignment(FlowLayout.LEFT);
        p1.add(bigLabel);
        p1.setLayout(new FlowLayout(FlowLayout.LEFT));
        p2.setLayout(new GridLayout(1,4));
        p2.add(barcodeLabel);
        p2.add(productLabel);
        p2.add(priceLabel);
        p2.add(quantityLabel);
        p3.setLayout(new GridLayout(1 , 4));
        p3.add(text1);
        p3.add(text2);
        p3.add(text3);
        p3.add(text4);
        p4.add(insert);
        p4.add(clear);
        northPanel.add(p1);
        northPanel.add(p2);
        northPanel.add(p3);
        northPanel.add(p4);
        add(northPanel , BorderLayout.NORTH);

        // for the Center borderlayout

        centerPanel.setLayout(new GridLayout(4,0));
        p5.setLayout(new FlowLayout(FlowLayout.LEFT));
        p5.add(searchLabel);
        p6.setLayout(new GridLayout(1,2));
        p6.add(l1);
        p6.add(barcode);
        p6.add(product);
        centerPanel.add(p5);
        centerPanel.add(p6);
        p7.add(find);
        p7.add(findText);
        p7.setLayout(new FlowLayout(FlowLayout.LEFT));
        centerPanel.add(p7);
        p8.add(big);
        centerPanel.add(p8);
        add(centerPanel , BorderLayout.CENTER);

        // adding for south !!
        southPanel.setLayout(new GridLayout(2,6));
        p9.setLayout(new FlowLayout(FlowLayout.LEFT));
        p9.add(updateLabel);
        southPanel.add(p9);
        p10.setLayout(new FlowLayout(FlowLayout.LEFT));
        p10.add(barlabel);
        p10.add(text);
        p10.add(comboBox);
        p10.add(newLabel);
        p10.add(secondText);
        p10.add(update);
        southPanel.add(p10);
        add(southPanel,BorderLayout.SOUTH);

    }//public construtor
}//class
