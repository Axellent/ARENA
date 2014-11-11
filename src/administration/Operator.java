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

	/**
	 * 
	 * @author Axel Sigl
	 */
	public Operator(){
		systemOnOff = new SystemOnOff();
		
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

	/**
	 * 
	 * @author Axel Sigl
	 * @param args
	 */
	public static void main(String[] args){
		new Operator();
		new LeagueOwner();
	}
	
}
