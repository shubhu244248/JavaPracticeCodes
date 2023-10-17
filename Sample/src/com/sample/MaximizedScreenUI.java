package com.sample;

import javax.swing.*;
import java.awt.*;

public class MaximizedScreenUI extends JFrame {
    public MaximizedScreenUI() {
        // Set up the JFrame
        setTitle("Maximized Screen UI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // Create the JPanel and set the layout
        JPanel panel = new JPanel(new BorderLayout());

        // Add components to the panel
        JLabel titleLabel = new JLabel("Title", SwingConstants.CENTER);
        titleLabel.setPreferredSize(new Dimension(0, 50)); // Set the height of the title label
        panel.add(titleLabel, BorderLayout.NORTH);

        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        panel.add(scrollPane, BorderLayout.CENTER);

        JButton button = new JButton("Button");
        button.setPreferredSize(new Dimension(150, 30)); // Set the size of the button
        panel.add(button, BorderLayout.SOUTH);

        // Add the panel to the JFrame
        add(panel);

        // Set the JFrame to be visible
        pack();
        setLocationRelativeTo(null); // Center the JFrame on the screen
        setVisible(true);
    }

    public static void main(String[] args) {
        MaximizedScreenUI ui = new MaximizedScreenUI();
    }
}
