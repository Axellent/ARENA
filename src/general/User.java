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
	//private GeneralTools login;
	
	public User(){
		
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

	/**
	 * Returns the id
	 * @author Andreas Lönnermark
	 * @return
	 */
	public int getID(){
		return id;
	}

	/**
	 * @author Andreas Lönnermark
	 * @param name
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 *
	 *@author Albin Olausson
	 * @param id
	 */
	public void setId(int id){
		this.id = id;
	}
	
	
	/**
	 *
	 *@author Albin Olausson
	 * @param setPassword
	 */
	public void setPassword(String setPassword){
		this.password = password;
	}
}
