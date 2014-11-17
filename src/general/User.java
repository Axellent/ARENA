package general;

/**
 * 
 * @author Albin Olausson
 *
 */
public abstract class User {
	private String name;
	private String password;
	private GeneralTools login;
	
	

	protected User(String name, String password){
		this.name = name;
		this.password = password;
	}
	
	public String getName(){
		return name;
		
	}
	
	public String getPassword(){
		return password;
	}
}
