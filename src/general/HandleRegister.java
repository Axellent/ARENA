package general;

public class HandleRegister extends GeneralTools {
	
Connection connection;
    
	public HandleRegister(String username, String password, String type, Connection connection){
	
		this.connection = connection;
		connection.command("register " + username + " " + password + " " + type + " ");
		
	}

}
