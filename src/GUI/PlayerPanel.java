package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PlayerPanel extends JPanel {
    private JLabel myGames;
    private JLabel fourInARowGame;
    private String path;
    private ImageIcon icon = null;
    private BufferedImage myPicture = null;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JLabel availableTournaments;
    private JLabel tournamentX;
    private JButton apply;
    
    public PlayerPanel() {
        super();
        
        this.setLayout(new GridLayout(1,2));
        leftPanel = new JPanel();
        leftPanel.setBackground(Color.black);
        leftPanel.setLayout(new GridLayout(2,1));
        
        myGames = new JLabel("My games");
        
        path = "img\\4inARow.png";
        
        try {
            myPicture = ImageIO.read(new File(path));
            icon = new ImageIcon(myPicture);
        } catch (IOException ex) {
            // handle exception
        }
        
        fourInARowGame = new JLabel(icon);
        
        leftPanel.add(myGames);
        leftPanel.add(fourInARowGame);
        
        rightPanel = new JPanel();
        rightPanel.setBackground(Color.black);
        rightPanel.setLayout(new GridLayout(3,1));
        
        availableTournaments =  new JLabel("Available tournaments");
        tournamentX = new JLabel("Tournament X");
        apply = new JButton("Apply");
        
        
        rightPanel.add(availableTournaments);
        rightPanel.add(tournamentX);
        rightPanel.add(apply);
        
        this.add(leftPanel);
        this.add(rightPanel);
        
    }
}
