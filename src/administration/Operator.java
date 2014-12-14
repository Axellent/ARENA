package administration;

import league.LeagueOwner;
import general.UnimplementedToolException;
import general.User;

/**
 * Has access to all funtionality related to operating the application.
 * @author Axel Sigl
 *
 */
public class Operator extends User{
	private OperatorTools systemOnOff;
	private OperatorTools handleUser;
	/**
	 * 
	 * @author Axel Sigl
	 */
	
	public Operator(String name, String password, int id){
		setName(name);
		setPassword(password);
		setId(id);
		
		systemOnOff = new SystemOnOff();
		handleUser = new HandleUser();
		
		try {
			systemOnOff.startSystem();
			//systemOnOff.stopSystem();
		} catch (UnimplementedToolException e){
			e.printStackTrace();
		}
	}
	
	
	public boolean handleLeagueRequest(){
		return true;
	}
}
