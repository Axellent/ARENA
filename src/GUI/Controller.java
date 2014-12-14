package GUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;

import general.Connection;
import general.HandleLogin;
import general.HandleRegister;
/**
 * 
 * @author Stella Wallin
 *
 */
public class Controller {
	
	ArenaFrame arenaFrame;
	LoginPanel loginPanel;
	OperatorPanel operatorPanel;
	AdvertiserPanel advertiserPanel;
	PlayerPanel playerPanel;
	LeagueOwnerPanel leagueOwnerPanel;
	
	Box operatorPanelBox;
	Box advertiserPanelBox;
	Box playerPanelBox;
	Box leagueOwnerPanelBox;
	
	Box loginPanelBox;
	HandleLogin handleLogin;
	Connection connection;
	String username;
	String password;
	String type;
	
/**
 * 
 * @author Stella Wallin
 *
*/
public Controller(Connection connection){
		
	this.connection = connection;
		
	arenaFrame = new ArenaFrame();
	loginPanelBox = arenaFrame.getLoginPanelBox();
	loginPanel = new LoginPanel();
	loginPanelBox.add(loginPanel);
	arenaFrame.add(loginPanelBox);
	arenaFrame.revalidate();
		
	loginPanel.addLoginListener(new LoginListener());
	loginPanel.addRegisterListener(new RegisterListener());
	}
	
/*
 * Listens for the login button and pass user name
 * and password to the Arena server for authentication.
 * Also gets type of logged in user in order to change
 * to appropriate GUI.
 * 
 * @author Stella Wallin
 */
	
class LoginListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
			username = loginPanel.getUsername();
			password = loginPanel.getPassword();
			handleLogin = new HandleLogin(username, password, connection);
			type = handleLogin.getUserType();
			System.out.println(type);
			setGUI(type);
		}
	}

/*
 * Listens for register button in login panel and
 * pass information to Arena server to create a
 * new user.
 * 
 * @author Stella Wallin
 * 
 */
class RegisterListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
			username = loginPanel.getUsername();
			password = loginPanel.getPassword();
			type = loginPanel.getType();
			new HandleRegister(username, password, type, connection);
		}
	}

/**
 * Set GUI according to user type
 * 
 * @author Stella Wallin
 * @param userType
 */
public void setGUI(String userType){
    
    arenaFrame.remove(loginPanelBox);
    
    if(userType.equals("Advertiser")){
    		setAdvertiserGUI();
    } else if(userType.equals("Player")){
    		setPlayerGUI();
    } else if (userType.equals("Operator")){
    		setOperatorGUI();
    } else if (userType.equals("LeagueOwner")){
    		setLeagueOwnerGUI();
    } else {
        System.out.println("Error no such user type.");
    }
    arenaFrame.revalidate();
    
}

public void setAdvertiserGUI(){
	advertiserPanelBox = arenaFrame.getAdvertiserPanelBox();
	advertiserPanel = new AdvertiserPanel();
	advertiserPanelBox.add(advertiserPanel);
    arenaFrame.add(advertiserPanelBox, BorderLayout.CENTER);
}

public void setPlayerGUI(){
    playerPanelBox = arenaFrame.getPlayerPanelBox();
    playerPanel = new PlayerPanel();
    playerPanelBox.add(playerPanel);
    arenaFrame.add(playerPanelBox, BorderLayout.CENTER);
}

public void setOperatorGUI(){
    operatorPanelBox = arenaFrame.getOperatorPanelBox();
    operatorPanel = new OperatorPanel();
    operatorPanelBox.add(operatorPanel);
    arenaFrame.add(operatorPanelBox, BorderLayout.CENTER);
}

public void setLeagueOwnerGUI(){
    leagueOwnerPanelBox = arenaFrame.getLeagueOwnerPanelBox();
    leagueOwnerPanel = new LeagueOwnerPanel();
    leagueOwnerPanelBox.add(leagueOwnerPanel);
    arenaFrame.add(leagueOwnerPanelBox, BorderLayout.CENTER);
}


}
