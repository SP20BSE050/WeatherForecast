/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wf.java.GUI;

/**
 *
 * @author sp20-bse-050
 */

//Import Required Stuff

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.attribute.UserDefinedFileAttributeView;

public class login implements ActionListener {
    //Setup elements so all methods can access them
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;

    //Main method
    public static void main(String[] args) {
        //Setup Panel
        JPanel panel = new JPanel();
        //Setup frame
        JFrame frame = new JFrame();
        //make the frame 100 x 100 px
        frame.setSize(350, 200);
        //When X is pressed to close then close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Add the panel to the frame
        frame.add(panel);

        // Panel stuff
        panel.setLayout(null);

        //Setup label
        userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        //setup text field
        userText = new JTextField();
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        //Setup Password Label
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        //Setup Password text field
        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        //Setup Button
        button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new login());
        panel.add(button);

        //success label -- wont be visible imeediatly
        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);
        success.setText("");

        //Make the frame Visible
        frame.setVisible(true);
    }// main method end

    // this code will be run when the button is pressed
    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
        //Print Login succsessful if the text inputed equals the correct login
        if (user.equals("Saqib") && password.equals("123")) {
            success.setText("Login Successful!");
        } else {
            //else remove the text
            success.setText("");
        }

    }
}
