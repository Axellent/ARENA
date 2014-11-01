package administration;

/**
 * Superclass for all tools authorized for use by an Operator.
 * @author Axel Sigl
 *
 */
public abstract class OperatorTools {

	/**
	 * Runs when a tool lacks the necessary implementation and throws an appropriate Exception.
	 * @author Axel Sigl
	 * @throws UnimplementedToolException
	 */
	public void startSystem() throws UnimplementedToolException{
		throw new UnimplementedToolException("StartSystem");
	}
	
	/**
	 * Runs when a tool lacks the necessary implementation and throws an appropriate Exception.
	 * @author Axel Sigl
	 * @throws UnimplementedToolException
	 */
	public void stopSystem() throws UnimplementedToolException{
		throw new UnimplementedToolException("StopSystem");
	}
	
	/**
	 * Should be thrown when a method of a subclass to OperatorTools is not implemented.
	 * @author Axel Sigl
	 */
	public class UnimplementedToolException extends Exception{
		public UnimplementedToolException(String method){
			super(method + " is not implemented for this tool");
		}
	}
}
