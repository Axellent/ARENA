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
public class HandleUser extends OperatorTools {

	public void deleteUser(User user) { // vet inte hur användarna kommer att
										// lagras

		/*
		 * for(int i = 1; i<max nUsers;i++ ){ if(tUser[i].id == user.id){
		 * //delUser(i) } }
		 */
	}

	public void changeUserType(User user, String newType) {
		int id;
		String password, name;

		//

		name = user.getName();
		password = user.getPassword();
		id = user.getID();

		deleteUser(user); // ska man spara ner den gamla profilen och dess data
							// så att den inte försvinner?

		switch (newType.toLowerCase()) {
		case "player":
			new Player(name, password, id);
			break;
		case "leagueowner":
			new LeagueOwner(name, password, id);
		case "advertiser":
			new Advertiser(name, password, id);
			// case 4: new Operator(name, password, id);

		}

	}

}

// private void delUser(int pos){ kommer antagligen inte se ut så här
// for(int i = pos; i < nUsers; i++){
// users[i] = users[i+1];
// }

