package com.sample;

import javax.swing.*;

public class SetBoundsExample extends JFrame {
    public SetBoundsExample() {
        // Set up the JFrame
        setTitle("SetBounds Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);

        // Create a JLabel and set its position and size
        JLabel label = new JLabel("Hello, world!");
        label.setBounds(30, 40, 150, 20);

        // Add the JLabel to the JFrame
        add(label);

        // Set the JFrame to be visible
        setVisible(true);
    }

    public static void main(String[] args) {
        SetBoundsExample example = new SetBoundsExample();
    }
}
