package GUI;

import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


/**
 *
 * @author Stella Wallin
 *
 */
public class ArenaFrame extends JFrame {
    private String path;

    public static void main(String[]args){
        
        new ArenaFrame();
        
    }
    
    public ArenaFrame() {
        super();
        JLabel arenaLogo;
        ImageIcon icon = null;
        BufferedImage myPicture = null;
        Box logoBox;
        Box loginPanelBox;
        
        path = "img\\arena_logo.png";
        
        try {
            myPicture = ImageIO.read(new File(path));
            icon = new ImageIcon(myPicture);
        } catch (IOException ex) {
            // handle exception
        }
                        
        
        setLayout(new BorderLayout());

        arenaLogo = new JLabel(icon);
        logoBox = Box.createHorizontalBox();
        logoBox.add(arenaLogo);
        
        loginPanelBox = Box.createHorizontalBox();
        loginPanelBox.add(new LoginPanel());
        loginPanelBox.setBorder(new EmptyBorder(50, 200, 200, 200));
        
        this.add(logoBox, BorderLayout.PAGE_START);
        this.add(loginPanelBox, BorderLayout.CENTER);
        
        getContentPane().setBackground(Color.black);
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        
        

    }
}
