package GUI;

import java.awt.Color;

import java.awt.GridLayout;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author Stella Wallin
 *
 */
public class ArenaFrame extends JFrame {
    private String path;
    private JTextField textfield1;
    private JTextField textfield2;
    
    public static void main(String[]args){
        
        new ArenaFrame();
        
    }
    public ArenaFrame() {
        super();
        JLabel arenaLogo;
        JPanel login;
        ImageIcon icon = null;
        BufferedImage myPicture = null;
        
        
        path = "img\\arena_logo.png";
        
        try {
            myPicture = ImageIO.read(new File(path));
            icon = new ImageIcon(myPicture);
        } catch (IOException ex) {
            // handle exception
        }
                
        //setIcon(icon);
        
        setLayout(new GridLayout(2,2));
        
        textfield1 = new JTextField("Enter user name: ", 10);
        textfield2 = new JTextField("Enter password: ", 10);
        
        login = new JPanel();
        //login.setLayout(new GridLayout(2,1));
        login.add(textfield1);
        login.add(textfield2);
        login.setBackground(Color.black);

        this.setVisible(true);
        arenaLogo = new JLabel(icon);
        this.getContentPane().setBackground(Color.black);
        
        this.add(arenaLogo);
        this.add(login);
        this.setSize(740,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
    }
}
