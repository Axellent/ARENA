package general;

import GUI.ArenaFrame;
import general.Connection;

/**
 * 
 * @author Axel Sigl
 *
 */
public class Arena {

    public static void main(String[]args){
    	
    	new ArenaFrame();
        
    	Connection connection = new Connection();
    	connection.command("help");
    	connection.requestTournament("testTournament");
    	connection.closeConnection();
    	
        
    }
}
