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
		throw new UnimplementedToolException("startSystem");
	}
	
	/**
	 * Runs when a tool lacks the necessary implementation and throws an appropriate Exception.
	 * @author Axel Sigl
	 * @throws UnimplementedToolException
	 */
	public void stopSystem() throws UnimplementedToolException{
		throw new UnimplementedToolException("stopSystem");
	}
	
	/**
	 * 
	 * @author Axel Sigl
	 * @throws UnimplementedToolException
	 */
	public void getTestGame() throws UnimplementedToolException{
		throw new UnimplementedToolException("getTestGame");
	}
	
	/**
	 * 
	 * @author Axel Sigl
	 * @throws UnimplementedToolException
	 */
	public void installGame() throws UnimplementedToolException{
		throw new UnimplementedToolException("installGame");
	}
	
	/**
	 * 
	 * @author Axel Sigl
	 * @throws UnimplementedToolException
	 */
	public void testGame() throws UnimplementedToolException{
		throw new UnimplementedToolException("testGame");
	}
	
}
