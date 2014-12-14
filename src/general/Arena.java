package general;

<<<<<<< HEAD
import play.Game;
import GUI.ArenaFrame;
=======
import GUI.Controller;
>>>>>>> 95d8fac490ebaeeb9385255284de8148f3eb226a
import general.Connection;

/**
 * 
 * @author Axel Sigl
 *
 */
public class Arena {
	

    public static void main(String[]args){
<<<<<<< HEAD
        new ArenaFrame();
=======
        
    	
    	Connection connection = new Connection();
    	new Controller(connection);
        //connection.command("help");
        //System.out.println(connection.requestTournament("testTournament").getName());
        //connection.command("login testName testPassword");
        //connection.closeConnection();
    	

    	
    	
        
>>>>>>> 95d8fac490ebaeeb9385255284de8148f3eb226a
    }
}
