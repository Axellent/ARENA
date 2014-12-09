package GUI;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
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
    private JTextField txtUsername;
    private JTextField txtPassword;
    private JButton btnLogin;
    private JButton btnRegister;
    private JPanel checkBoxPanel;
    private CheckboxGroup checkBoxGroup;
    
    public LoginPanel() {
        super();
        
        setLayout(new GridLayout(4, 0, 5, 2));
        
        this.setBackground(Color.black);
        
        checkBoxPanel = new JPanel();
        checkBoxPanel.setLayout(new GridLayout(1,4));
        checkBoxPanel.setBackground(Color.black);
        
        checkBoxGroup = new CheckboxGroup();
        Checkbox c;
        
        
        checkBoxPanel.add(c = new Checkbox("Advertiser"));
        c.setCheckboxGroup(checkBoxGroup);
        checkBoxPanel.add(c = new Checkbox("Operator"));
        c.setCheckboxGroup(checkBoxGroup);
        checkBoxPanel.add(c = new Checkbox("Player"));
        c.setCheckboxGroup(checkBoxGroup);
        checkBoxPanel.add(c = new Checkbox("League Owner"));
        c.setCheckboxGroup(checkBoxGroup);
        
        
        
        txtPanel = new JPanel();
        txtPanel.setLayout(new GridLayout(2,1));
        
        txtUsername = new JTextField("  Enter user name: ", 15);
        txtPassword = new JTextField("  Enter password: ", 15);
        
        txtUsername.setBackground(Color.black);
        txtUsername.setForeground(Color.white);
        txtUsername.setBorder(BorderFactory.createLineBorder(Color.green));
        txtPassword.setBackground(Color.black);
        txtPassword.setForeground(Color.white);
        txtPassword.setBorder(BorderFactory.createLineBorder(Color.green));
        
        btnPanel = new JPanel();
        btnPanel.setLayout(new GridLayout(1, 2, 2, 2));
        
        btnRegister = new JButton("      Register");
        btnLogin = new JButton("     Log In");
        
        btnRegister.setOpaque(true);
        btnRegister.setBackground(Color.green);
        btnRegister.setForeground(Color.white);
        
        btnLogin.setOpaque(true);
        btnLogin.setBackground(Color.green);
        btnLogin.setForeground(Color.white);
        
        btnPanel.setBackground(Color.black);
        btnPanel.add(btnLogin);
        btnPanel.add(btnRegister);
        
        txtPanel.add(txtUsername);
        txtPanel.add(txtPassword);
        
        this.add(txtPanel);
        this.add(btnPanel);
        this.add(checkBoxPanel);
        
    }
    
    public void addLoginListener(ActionListener listenForLoginButton){
    	         
    	        btnLogin.addActionListener(listenForLoginButton);
    	         
    	    }
    
    public void addRegisterListener(ActionListener listenForRegisterButton){
    			btnRegister.addActionListener(listenForRegisterButton);
    }
    	
   
   public String getUsername(){
	   return txtUsername.getText();
   }
   
   public String getPassword(){
	   return txtPassword.getText();
   }
   
   public String getType(){
	  return checkBoxGroup.getSelectedCheckbox().getLabel();
   }

}
