package com.sample;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm extends JFrame {

    public LoginForm() {
        super("Login Form");

        // Create labels and fields
        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");
        JTextField userField = new JTextField(15);
        JPasswordField passField = new JPasswordField(15);
        JButton loginButton = new JButton("Login");

        // Set the layout manager
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        // Add the labels and fields to the panel
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.WEST;
        panel.add(userLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(userField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(passLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(passField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        panel.add(loginButton, constraints);

        // Add the panel to the frame
        add(panel, BorderLayout.CENTER);

        // Set the window size and position
        setSize(new Dimension(350, 150));
        setLocationRelativeTo(null);

        // Exit the application when the window is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the window visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}
