package general;

/**
 * A abstract class for a user containing name and password
 * @author Albin Olausson
 *
 */
public abstract class User {
	private String name;
	private String password;
	private int id;
	private GeneralTools login;
	
	
/**
 * Sets the name and password
 * @author Albin Olausson
 * @param name
 * @param password
 */
	public User(String name, String password, int id){
		this.name = name;
		this.password = password;
		this.id = id;
	}
	
	
	/**
	 * Returns the name 
	 * @author Albin Olausson
	 * @return
	 */
	public String getName(){
		return name;
		
	}
	
	
	/**
	 * Returns the password
	 * @author Albin Olausson
	 * @return
	 */
	public String getPassword(){
		return password;
	}
}
