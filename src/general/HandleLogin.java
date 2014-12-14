package general;

/**
 *
 * @author Stella Wallin
 *
 */
public class HandleLogin extends GeneralTools {
	private String type;
	private Connection connection;
	private String username;
   
	public HandleLogin(String username, String password, Connection connection) {
	
		this.username = username;
		this.connection = connection;
		
		type = connection.command("login " + username + " " + password);
		System.out.println(type);
                 
	}
        
        
   public String getUserType() {
	   return connection.command("accountType " + username);
       }
}
