package com.sample;

import javax.swing.*;
import java.awt.*;

public class FullScreenLoginForm extends JFrame {
    public FullScreenLoginForm() {
        // Set up the JFrame
        setTitle("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the JPanel and set the layout
        JPanel panel = new JPanel(new GridLayout(2, 2, 10, 10));

        // Add components to the panel
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);

        // Create the JButton and add it to the JPanel
        JButton loginButton = new JButton("Login");
        panel.add(loginButton);

        // Add the JPanel to the JFrame
        add(panel);

        // Set the JFrame to be full screen and center the content
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);

        // Set the JFrame to be visible
        setVisible(true);
    }

    public static void main(String[] args) {
        FullScreenLoginForm form = new FullScreenLoginForm();
    }
}
