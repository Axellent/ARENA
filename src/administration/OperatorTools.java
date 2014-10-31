package administration;

public abstract class OperatorTools {

	public void startSystem() throws UnimplementedToolException{
		throw new UnimplementedToolException("StartSystem");
	}
	
	public class UnimplementedToolException extends Exception{
		public UnimplementedToolException(String method){
			super(method + " is not implemented for this tool");
		}
	}
}
