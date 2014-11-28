package GUI;

//import general.Connection;

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

import league.LeagueOwner;


/**
 *
 * @author Stella Wallin
 *
 */
public class ArenaFrame extends JFrame {
    private String path;
    private int gui = 0;
    private JLabel arenaLogo;
    private ImageIcon icon = null;
    private BufferedImage myPicture = null;
    private LoginPanel loginPanel;
    private Box logoBox;
    private Box loginPanelBox;
    private Box advertiserPanelBox;
    private Box playerPanelBox;
    
    public ArenaFrame() {
        super();
        
        String OS = System.getProperty("os.name").toLowerCase();
        
        if(OS.indexOf("win") >= 0){
        	path = "img\\arena_logo.png";
        }
        if(OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") >= 0){
        	path = "img/arena_logo.png";
        }
        
        try {
            myPicture = ImageIO.read(new File(path));
            icon = new ImageIcon(myPicture);
        } catch (IOException ex) {

        }
                        
        setLayout(new BorderLayout());

        /*
         * Box for logotype
         */
        arenaLogo = new JLabel(icon);
        logoBox = Box.createHorizontalBox();
        logoBox.add(arenaLogo);
        this.add(logoBox, BorderLayout.PAGE_START);
        
        /*
         * Box for login panel
         */
        loginPanelBox = createLoginPanelBox(this);
        this.add(loginPanelBox, BorderLayout.CENTER);
        
        
        getContentPane().setBackground(Color.black);
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);

    }

    
    private Box createAdvertiserPanelBox(){
        advertiserPanelBox = Box.createHorizontalBox();
        advertiserPanelBox.add(new AdvertiserPanel());
        advertiserPanelBox.setBorder(new EmptyBorder(50, 200, 200, 200));
        return advertiserPanelBox;
    }
    
    private Box createPlayerPanelBox(){
        playerPanelBox = Box.createHorizontalBox();
        playerPanelBox.add(new PlayerPanel());
        playerPanelBox.setBorder(new EmptyBorder(50, 150, 150, 150));
        return playerPanelBox;
    }
    
    private Box createLoginPanelBox(ArenaFrame arenaFrame){
        loginPanelBox = Box.createHorizontalBox();
        loginPanel = new LoginPanel(arenaFrame);
        loginPanelBox.add(loginPanel);
        loginPanelBox.setBorder(new EmptyBorder(50, 200, 200, 200));
        return loginPanelBox;
    }
    
    public void setGUI(ArenaFrame arenaFrame, int userID){
        
        arenaFrame.remove(loginPanelBox);
        
        if(userID == 1){
            advertiserPanelBox = createAdvertiserPanelBox();
            arenaFrame.add(advertiserPanelBox, BorderLayout.CENTER);
        } else if(userID == 2){
            playerPanelBox = createPlayerPanelBox();
            arenaFrame.add(playerPanelBox, BorderLayout.CENTER);
        } else {
            advertiserPanelBox = createAdvertiserPanelBox();
            arenaFrame.add(advertiserPanelBox, BorderLayout.CENTER);
        }
        revalidate();
        
    }
}