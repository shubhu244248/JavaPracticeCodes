package com.sample;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {
    private JLabel userLabel;
    private JTextField textField1;
    private JLabel passLabel;
    private JPasswordField textField2;
    private JButton b1;
    private JPanel newPanel;

    public LoginFrame() {
        super("Login Form");

        userLabel = new JLabel("Username:");
        userLabel.setPreferredSize(new Dimension(100, 30)); // set preferred size for the label
        textField1 = new JTextField(15);
        textField1.setPreferredSize(new Dimension(200, 30)); // set preferred size for the text field
        passLabel = new JLabel("Password:");
        passLabel.setPreferredSize(new Dimension(100, 30)); // set preferred size for the label
        textField2 = new JPasswordField(8);
        textField2.setPreferredSize(new Dimension(200, 30)); // set preferred size for the password field
        b1 = new JButton("Submit");
        b1.setPreferredSize(new Dimension(100, 30)); // set preferred size for the button
        newPanel = new JPanel(new GridLayout(3, 1));
        newPanel.add(userLabel);
        newPanel.add(textField1);
        newPanel.add(passLabel);
        newPanel.add(textField2);
        newPanel.add(b1);

        add(newPanel, BorderLayout.CENTER);

        setSize(400, 150); // set the size of the frame
        setLocationRelativeTo(null); // center the frame on the screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginFrame();
    }
}
