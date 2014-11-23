package GUI;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LeagueOwnerPanel extends JPanel {
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JLabel createNewTournament;
    private JComboBox leagueList;
    private JComboBox tournamentStyleList;
    private JButton btnCreate;
    
    public LeagueOwnerPanel() {
        super();
        
        leftPanel = new JPanel();
        rightPanel = new JPanel();
        
        createNewTournament = new JLabel("Create new tournament");
        
        String[] leagues = { "4inARow", "Some game", "Choose league" };
        leagueList = new JComboBox(leagues);
        leagueList.setSelectedIndex(2);
        
        String[] tournaments = { "Style 1", "Style 2", "Choose tournament style" };
        tournamentStyleList = new JComboBox(tournaments);
        tournamentStyleList.setSelectedIndex(2);
        
        btnCreate = new JButton("Create");
        
        leftPanel.add(createNewTournament);
        leftPanel.add(leagueList);
        leftPanel.add(tournamentStyleList);
        leftPanel.add(btnCreate);
        
        
    }
}
