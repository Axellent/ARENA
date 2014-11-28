package GUI;

import java.awt.BorderLayout;
import java.awt.Color;

import GUI.ArenaFrame;

import general.HandleLogin;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class LoginPanel extends JPanel{
    
    private JPanel txtPanel;
    private JPanel btnPanel;
    private JTextField txtUserName;
    private JTextField txtPassword;
    private JButton btnLogin;
    private JButton btnRegister;
    private ArenaFrame arenaFrame;
    //private BtnListener listener;
    private HandleLogin handleLogin;
    
    public LoginPanel(ArenaFrame arenaFrame) {
        super();
    
        
        this.arenaFrame = arenaFrame;
        
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
        
        btnRegister = new JButton("      Register");
        btnLogin = new JButton("     Log In");
        
        BtnListener listener = new BtnListener();
        
        btnRegister.setOpaque(true);
        btnRegister.setBackground(Color.green);
        btnRegister.setForeground(Color.white);
        
        btnLogin.setOpaque(true);
        btnLogin.setBackground(Color.green);
        btnLogin.setForeground(Color.white);
        

        
        listener = new BtnListener();
        btnLogin.addActionListener(listener);
        
        btnPanel.setBackground(Color.black);
        
      
        btnPanel.add(btnLogin);
        btnPanel.add(btnRegister);
        
        txtPanel.add(txtUserName);
        txtPanel.add(txtPassword);
        
        this.add(txtPanel);
        this.add(btnPanel);
        
       /* btnLogin.addActionListener(new ActionListener(){        
            
            public void actionPerformed(ActionEvent e) {
            changeGUI(); 
        }
        });*/
    }


   /**
     * An actionlistener that checks which button is pressed
     * and either starts a new game or quits the program
     */

    private class BtnListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            changeGUI(); 
        }
    }   
   
   public void  changeGUI(){
	    handleLogin = new HandleLogin();
        int id;
        String userName;
        userName = txtUserName.getText();
       //String password = txtPassword.getText();
       id = handleLogin.getUserID(userName);
       id = id%10;
       arenaFrame.setGUI(this.arenaFrame, id);
   }

}