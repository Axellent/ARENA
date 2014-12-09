package general;

import GUI.Controller;
import general.Connection;

/**
 * 
 * @author Axel Sigl
 *
 */
public class Arena {
	

    public static void main(String[]args){
        
    	
    	Connection connection = new Connection();
    	new Controller(connection);
        //connection.command("help");
        //System.out.println(connection.requestTournament("testTournament").getName());
        //connection.command("login testName testPassword");
        //connection.closeConnection();
    	

    	
    	
        
    }
}
