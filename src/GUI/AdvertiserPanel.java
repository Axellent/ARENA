package GUI;

import java.awt.BorderLayout;
import java.awt.Color;


import java.awt.FileDialog;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.FileChooserUI;

public class AdvertiserPanel extends JPanel {
    
    private JPanel leftPanel;
    private JPanel rightPanel;
    private FileDialog fileDialog;
    private JComboBox leagueList;
    private JComboBox tournamentList;
    private JLabel uploadAd;
    private JLabel addFunds;
    private JLabel emptyAccount;
    private JLabel funds;
    private JButton remove;
    private JLabel currentAds;
    
    public AdvertiserPanel() {
        super();

        this.setLayout(new GridLayout(1,2));
        leftPanel = new JPanel();
        leftPanel.setBackground(Color.black);
        leftPanel.setLayout(new GridLayout(6,1));
        
        uploadAd = new JLabel("Upload ad");
        
        leftPanel.add(uploadAd);
        
        String[] leagues = { "4inARow", "Some game", "Choose league" };
        leagueList = new JComboBox(leagues);
        leagueList.setSelectedIndex(2);
        
        String[] tournaments = { "4inARow", "Some game", "Choose tournament" };
        tournamentList = new JComboBox(tournaments);
        tournamentList.setSelectedIndex(2);
        
        funds = new JLabel("Funds: 12€");
        addFunds = new JLabel("Add funds");
        addFunds.setForeground(Color.green);
        emptyAccount = new JLabel("Empty account");
        emptyAccount.setForeground(Color.green);
        
        rightPanel = new JPanel();
        rightPanel.setBackground(Color.black);
        
        currentAds = new JLabel("Current ads:");
        remove = new JButton("Remove");
        
        rightPanel.add(currentAds);
        rightPanel.add(remove);
        
        leftPanel.add(leagueList);
        leftPanel.add(tournamentList);
        leftPanel.add(funds);
        leftPanel.add(addFunds);
        leftPanel.add(emptyAccount);
        
        this.add(leftPanel);
        this.add(rightPanel);
    }
}
