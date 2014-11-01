package administration;

import administration.OperatorTools.UnimplementedToolException;
import arena.User;

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
			systemOnOff.stopSystem();
		} catch (UnimplementedToolException e){
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @author Axel Sigl
	 * @param args
	 */
	public static void main(String[] args){
		new Operator();
	}
	
}
