package general;

/**
 * Should be thrown when a method of a subclass to OperatorTools is not implemented.
 * @author Axel Sigl
 */
public class UnimplementedToolException extends Exception{
	/**
	 * Returns the method from which the Exception is thrown.
	 * @author Axel Sigl
	 * @param method
	 */
	public UnimplementedToolException(String method){
		super(method + " is not implemented for this tool");
	}
}
