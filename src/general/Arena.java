package general;

import play.Game;
import GUI.ArenaFrame;
import GUI.Controller;
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
    	new Controller(connection);
    }
}
