package administration;

/**
 * Used to start and stop the entire application.
 * @author Axel Sigl
 *
 */
public class SystemOnOff extends OperatorTools{

	/**
	 *
	 * @author Axel Sigl
	 */
	@Override
	public void startSystem(){
		System.out.println("Welcome to the prototype of the ARENA application\n");
		System.out.println("Test\n");
	}
	
	/**
	 * Exits the application.
	 * @author Axel Sigl
	 */
	@Override
	public void stopSystem(){
		System.exit(0);
	}
}
