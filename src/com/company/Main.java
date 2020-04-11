package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Frame frame = new Frame();
        frame.setSize(850 , 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null); // so the screen appears in the middle of the window
    }
}
