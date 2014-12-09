package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;

import general.Connection;
import general.HandleLogin;
import general.HandleRegister;

public class Controller {
	
	ArenaFrame arenaFrame;
	LoginPanel loginPanel;
	Box loginPanelBox;
	HandleLogin handleLogin;
	Connection connection;
	AdvertiserPanel advertiserPanel;
	String username;
	String password;
	String type;
	
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
	

	
class LoginListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
			username = loginPanel.getUsername();
			password = loginPanel.getPassword();
			new HandleLogin(username, password, connection);
		}
	}

class RegisterListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
			username = loginPanel.getUsername();
			password = loginPanel.getPassword();
			type = loginPanel.getType();
			new HandleRegister(username, password, type, connection);
		
		}
	}

/*public void setGUI(ArenaFrame arenaFrame, int userID){
    
    arenaFrame.remove(loginPanelBox);
    
    if(userID == 1){
        advertiserPanelBox = createAdvertiserPanelBox();
        arenaFrame.add(advertiserPanelBox, BorderLayout.CENTER);
    } else if(userID == 2){
        playerPanelBox = createPlayerPanelBox();
        arenaFrame.add(playerPanelBox, BorderLayout.CENTER);
    } else if (userID == 3){
        operatorPanelBox = createOperatorPanelBox();
        arenaFrame.add(operatorPanelBox, BorderLayout.CENTER);
    }else if (userID == 4){
        leagueOwnerPanelBox = createLeagueOwnerPanelBox();
        arenaFrame.add(leagueOwnerPanelBox, BorderLayout.CENTER);
    } else {
        System.out.println("funkint");
    }
    revalidate();
    
}*/

}
