package administration;

import general.User;
import advertisement.Advertiser;
import play.Player;
import league.LeagueOwner;
/**
 * 
 * @author Axel Sigl
 *
 */
public class HandleUser extends OperatorTools{
	
	public void deleteUser(User user){ //vet inte hur anv�ndarna kommer att lagras
		
		/*
		for(int i = 1; i<max nUsers;i++ ){
			if(tUser[i].id == user.id){
			//delUser(i)
			 }
		}
		
		
		*/
	}
	
	public void changeUserType(User user, String newType){
		 int id;
		 String password, name;		 
		 
		 //
		 
		 name = user.getName();
		 password = user.getPassword();
		 id = user.getID();
		 
		 deleteUser(user); // ska man spara ner den gamla profilen och dess data s� att den inte f�rsvinner?
		

		 //case "player": new Player(name, password, id);
		 		 //break;


 		 
		 }
	
		 }
		
	
	
	
	
	//private void delUser(int pos){ kommer antagligen inte se ut s� h�r 
	//	for(int i = pos; i < nUsers; i++){
	//	users[i] = users[i+1];
	//}
	

