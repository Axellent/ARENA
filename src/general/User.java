package general;

/**
 * 
 * @author Axel Sigl
 *
 */
public abstract class User {
	private GeneralTools login;
	private int ID;
	private String name;
	
	/**
	 * Changes user ID.
	 * @author Axel Sigl
	 * @param ID
	 */
	public void setID(int ID){
		this.ID = ID;
	}
	
	/**
	 * Changes user name.
	 * @author Axel Sigl
	 * @param name
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * 
	 * @author Axel Sigl
	 * @return ID of the user.
	 */
	public int getID(){
		return ID;
	}
	
	/**
	 * 
	 * @author Axel Sigl
	 * @return Name of the user.
	 */
	public String getName(){
		return name;
	}
}
