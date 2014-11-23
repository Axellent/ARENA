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
        
    	//new Connection().command("Test output");
        new ArenaFrame();
        new LeagueOwner("ownerName");
    }
}
