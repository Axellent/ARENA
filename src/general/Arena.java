package general;

import league.LeagueOwner;
import GUI.ArenaFrame;

/**
 * 
 * @author Axel Sigl
 *
 */
public class Arena {

    public static void main(String[]args){
        
    	Connection connection = new Connection();
    	connection.command("help");
    	//connection.closeConnection();
    	
        new ArenaFrame();
        new LeagueOwner("ownerName");
    }
}
