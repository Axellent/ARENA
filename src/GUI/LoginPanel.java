package GUI;

import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class LoginPanel extends JPanel {
    
    private JPanel txtPanel;
    private JPanel btnPanel;
    private JTextField txtUserName;
    private JTextField txtPassword;
    private JLabel btnLogin;
    private JLabel btnRegister;
    
    public LoginPanel() {
        super();
        
        setLayout(new GridLayout(3, 0, 5, 2));
        
        this.setBackground(Color.black);
        
        txtPanel = new JPanel();
        txtPanel.setLayout(new GridLayout(2,1));
        
        txtUserName = new JTextField("  Enter user name: ", 15);
        txtPassword = new JTextField("  Enter password: ", 15);
        
        txtUserName.setBackground(Color.black);
        txtUserName.setForeground(Color.white);
        txtUserName.setBorder(BorderFactory.createLineBorder(Color.green));
        txtPassword.setBackground(Color.black);
        txtPassword.setForeground(Color.white);
        txtPassword.setBorder(BorderFactory.createLineBorder(Color.green));
        
        btnPanel = new JPanel();
        btnPanel.setLayout(new GridLayout(1, 2, 2, 2));
        
        btnRegister = new JLabel("      Register");
        btnLogin = new JLabel("     Log In");
        
        btnRegister.setOpaque(true);
        btnRegister.setBackground(Color.green);
        btnRegister.setForeground(Color.white);
        //btnRegister.setBorder(BorderFactory.createLineBorder(Color.darkGray));
        
        btnLogin.setOpaque(true);
        btnLogin.setBackground(Color.green);
        btnLogin.setForeground(Color.white);
        
        btnPanel.setBackground(Color.black);
        
        btnPanel.add(btnLogin);
        btnPanel.add(btnRegister);
        
        txtPanel.add(txtUserName);
        txtPanel.add(txtPassword);
        
        this.add(txtPanel);
        this.add(btnPanel);
        
    }
}

