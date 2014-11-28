package general;

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
 * @author Albin
 *
 */
public class HandleLogin extends GeneralTools implements Serializable {

    private static List<User> userList = new ArrayList<User>();
    
    private User user1;
    private User user2;
    private User user3;
    private User user4;
        
	public HandleLogin() {
                
	    user1 = new Advertiser("Advertiser1", "oglog", 11, 12);
            user2 = new Player("Player1", "shhoo", 12);
            user3 = new Operator("Operator1", "likks", 13);
	    user4 = new LeagueOwner("LeagueOwner1", "poop", 14);
            
            userList.add(user1);
	    userList.add(user2);
	    userList.add(user3);
	    userList.add(user4);
            
        try{
            saveUserRegister();
        } catch (IOException ex) {
                    
        }
        
	}
        
   //Prints the user register to a file.
    public void saveUserRegister() throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Users.txt"));
        for (User d : userList) {
            out.writeObject(d);
        }
        out.close();
    }
        
   public int getUserID(String userName) {
       //IF: UserName exists in our list -> Return the user ID.
       for (User u : userList) {
           if (u.getName().equals(userName)) {
               return u.getID();
           }
       }

       //ELSE: Does not exist in our list -> Return null (indicating not found).
       return 0;
   }

}
