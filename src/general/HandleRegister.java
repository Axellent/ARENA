package general;

public class HandleRegister extends GeneralTools {
	
Connection connection;
String output;
    
	public HandleRegister(String username, String password, String type, Connection connection){
	
		this.connection = connection;
		output = connection.command("register " + username + " " + password + " " + type + " ");
		System.out.println(output);
	}

}
