package administration;

import general.UnimplementedToolException;

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
}
