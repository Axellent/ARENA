package general;

import GUI.LoginPanel;
import administration.Operator;
import advertisement.Advertiser;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import league.LeagueOwner;
import play.Player;

/**
 *
 * @author Stella Wallin
 *
 */
public class HandleLogin extends GeneralTools {
   
	public HandleLogin(String username, String password, Connection connection) {
	
		connection.command("login " + username + " " + password);
                 
	}
        
        
 /*  public int getUserID(String userName) {
       //IF: UserName exists in our list -> Return the user ID.
       for (User u : userList) {
           if (u.getName().equals(userName)) {
               return u.getID();
           }
       }

       //ELSE: Does not exist in our list -> Return null (indicating not found).
       return 0;
   }*/

}
