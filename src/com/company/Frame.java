package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.Flow;

public class Frame extends JFrame implements ActionListener {
    private ArrayList <Product> ProductArray  = new ArrayList<Product>();
    private Product product_ref;
    private Double d;
    private int x , flag = 0 , flag1;
    private String output;
    private Box box;
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
    private Color c1;
    // for south we need 3 labels and 2 text fields 1 jcombobox 1 button
    private JPanel southPanel , p9 ,p10;
    private JLabel updateLabel , newLabel ,barlabel;
    private JComboBox comboBox ;
    private JTextField  text , secondText;
    private JButton update;
    private String names[] = {"-------------","Product" , "Price" , "Quantity"};
    public Frame(){
        super("Store inventory");
        borderLayout = new BorderLayout(0,4);
        setLayout(borderLayout);
        output = "";
        container = getContentPane();
        container.setBackground(Color.pink); // so that the lines can show up between borders
        northPanel = new JPanel();
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        c1 = Color.lightGray;
        //Adding for south!!
        southPanel = new JPanel();
        p9 = new JPanel();
        p10 = new JPanel();

        updateLabel = new JLabel("Update Product :");
        updateLabel.setForeground(Color.cyan);

        barlabel = new JLabel("Barcode");
        comboBox = new JComboBox(names);
        text = new JTextField(20);
        newLabel = new JLabel("New Value");
        secondText = new JTextField(20);
        update = new JButton(" Update ");
        update.addActionListener(this);
        //finsh south

        //flag1 = 0;

        blueFon = new Font("Garamond",3 ,22);
        updateLabel.setFont(blueFon); // for south
        //for the buttons
        insert = new JButton(" Insert ");
        clear = new JButton(" Clear ");
        clear.addActionListener(this);
        insert.addActionListener(this);
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
        l1 = new JLabel("Choose one choice :");
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
        find.addActionListener(this);
        findText = new JTextField(30);

        //adding for center -textArea
        big = new JTextArea(20,60);
        big.setEditable(false);

        //for adding to north border
        northPanel.setLayout(new GridLayout(4 ,4));
        //bigLabel.setHorizontalAlignment(FlowLayout.LEFT);
        p1.add(bigLabel);
        p1.setBackground(c1);
        p1.setLayout(new FlowLayout(FlowLayout.LEFT));
        p2.setLayout(new GridLayout(1,4));
        p2.add(barcodeLabel);
        p2.add(productLabel);
        p2.add(priceLabel);
        p2.add(quantityLabel);
        p2.setBackground(c1);
        p3.setLayout(new GridLayout(1 , 4));
        p3.add(text1);
        p3.add(text2);
        p3.add(text3);
        p3.add(text4);
        p3.setBackground(c1);
        p4.add(insert);
        p4.add(clear);
        p4.setBackground(c1);
        northPanel.add(p1);
        northPanel.add(p2);
        northPanel.add(p3);
        northPanel.add(p4);

        add(northPanel , BorderLayout.NORTH);

        // for the Center borderlayout

        centerPanel.setLayout(new GridLayout(3,2));
        p5.setLayout(new GridLayout(0,3));
        p5.add(searchLabel);
        p5.setBackground(c1);
        p6.setLayout(new FlowLayout(FlowLayout.LEFT));
        p6.add(l1);
        p6.setBackground(c1);
        p6.add(barcode);
        p6.add(product);
        //centerPanel.add(p5);
        centerPanel.add(p5);

        p6.add(find);
        p6.add(findText);
        //p5.setLayout(new FlowLayout(FlowLayout.LEFT));
        //p6.setPreferredSize(new Dimension(10,10));
        centerPanel.add(p6);
        p8.add(big);
        p8.setBackground(c1);
        centerPanel.add(p8);
        add(centerPanel , BorderLayout.CENTER);

        // adding for south !!
        southPanel.setLayout(new GridLayout(2,6));
        p9.setLayout(new FlowLayout(FlowLayout.LEFT));
        p9.add(updateLabel);
        p9.setBackground(c1);
        southPanel.add(p9);
        p10.setLayout(new FlowLayout(FlowLayout.LEFT));
        p10.add(barlabel);
        p10.add(text);
        p10.add(comboBox);
        p10.add(newLabel);
        p10.add(secondText);
        p10.add(update);
        p10.setBackground(c1);
        southPanel.add(p10);
        add(southPanel,BorderLayout.SOUTH);

    }//public construtor

    public void actionPerformed(ActionEvent event){

        if(event.getSource() == clear){
            //clear buttons
            clearText(text1,text2,text3,text4);
        }
        else if(event.getSource() == update){
            if(comboBox.getSelectedIndex() == 0){
                JOptionPane.showMessageDialog(null , "You should choose from the list to make an update!","Warrning" ,JOptionPane.WARNING_MESSAGE);
            }
            else{
                for(Product p : ProductArray){
                    if(p.getBardcod().equals(text.getText())){
                        if(comboBox.getSelectedItem() == "Product" && !secondText.getText().isEmpty()){
                            //System.out.println("inside product");
                            JOptionPane.showMessageDialog(null , "You change : " +p.getName()+"\nTo : " +secondText.getText());
                            p.setName(secondText.getText());
                            secondText.setText("");
                        }
                        else if(comboBox.getSelectedItem() == "Price" && !secondText.getText().isEmpty()){
                            //System.out.println("inside price");
                            JOptionPane.showMessageDialog(null , "You change : " +p.getPrice()+"\nTo : " +secondText.getText());
                            p.setPrice(Double.parseDouble(secondText.getText()));
                            secondText.setText("");
                        }
                        else if(comboBox.getSelectedItem() == "Quantity" && !secondText.getText().isEmpty()){
                            //System.out.println("inside quantity");
                            JOptionPane.showMessageDialog(null , "You change : " +p.getQuantity()+"\nTo : " +secondText.getText());
                            p.setQuantity(Integer.parseInt(secondText.getText()));
                            secondText.setText("");
                        }
                        else
                            JOptionPane.showMessageDialog(null , "Text cannot be emphty");
                    }
                    else{
                        JOptionPane.showMessageDialog(null , "No barcod found");
                    }
                }
            }
        }
        else if(event.getSource() == insert) {
            //for insert button
            if (flag != 0) {
                if (text1.getText().isEmpty() || text2.getText().isEmpty() || text3.getText().isEmpty() || text4.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all the textfields !", "Warning!", JOptionPane.WARNING_MESSAGE);
                    clearText(text1, text2, text3, text4);
                }
                else {
                    flag1 = 0;
                    for(Product p : ProductArray){
                        if(text1.getText().matches(p.getBardcod())){
                            JOptionPane.showMessageDialog(null ,"The barcod is already exists!" ,"Error" ,JOptionPane.ERROR_MESSAGE);
                            text1.setText("");
                            flag1++;
                            break;
                        }

                    }
                    if(flag1 == 0){
                        product_ref = new Product();
                        product_ref.setBardcod(text1.getText());
                        product_ref.setName(text2.getText());
                        d = Double.parseDouble(text3.getText());
                        product_ref.setPrice(d);
                        x = Integer.parseInt(text4.getText());
                        product_ref.setQuantity(x);
                        ProductArray.add(product_ref);
                        JOptionPane.showMessageDialog(null, "You added \nBarcod : " + text1.getText() + "\nName : " + text2.getText() + "" +
                                "\nPrice : " + text3.getText() + "\nQuantitiy : " + text4.getText());
                        clearText(text1, text2, text3, text4);

                    }

                }
            }
            else if (flag == 0) {
                if (text1.getText().isEmpty() || text2.getText().isEmpty() || text3.getText().isEmpty() || text4.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all the textfields !", "Warning!", JOptionPane.WARNING_MESSAGE);
                    clearText(text1, text2, text3, text4);
                } else {
                    product_ref = new Product();
                    product_ref.setBardcod(text1.getText());
                    product_ref.setName(text2.getText());
                    d = Double.parseDouble(text3.getText());
                    product_ref.setPrice(d);
                    x = Integer.parseInt(text4.getText());
                    product_ref.setQuantity(x);
                    ProductArray.add(product_ref);
                    JOptionPane.showMessageDialog(null, "You added \nBarcod : " + text1.getText() + "\nName : " + text2.getText() + "" +
                            "\nPrice : " + text3.getText() + "\nQuantitiy : " + text4.getText());
                    clearText(text1, text2, text3, text4);
                    flag ++;
                }
            }
        }
        else if(event.getSource() == find){
            //System.out.println("Inside find");
            if (barcode.isSelected()){
                //System.out.println("barcod");
                for(Product p : ProductArray){
                    if(findText.getText() == p.getBardcod()){
                        output = p.getBardcod() + "\t\t" +p.getName() +"\t\t" + p.getPrice()+"\t\t" +p.getQuantity() ;
                        big.setText(output);
                        System.out.println();
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Not Found!", "ERROR", JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                }
            }
            else if(product.isSelected()){

                for(Product p : ProductArray){
                    if(findText.getText().matches(p.getName())){
                        output += p.getBardcod() + "\t\t" +p.getName() +"\t\t" + p.getPrice()+"\t\t" +p.getQuantity() +"\n";
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Not Found!", "ERROR", JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                }
                big.setText(output);
            }

        }//end of the else of handler
        }//action performed function

    public void clearText(JTextField t1 , JTextField t2 , JTextField t3 , JTextField t4){
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
    }
}//class
