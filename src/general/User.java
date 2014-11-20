package general;

/**
 * A abstract class for a user containing name and password
 * 
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
	 * 
	 * @author Albin Olausson
	 * @param name
	 * @param password
	 */
	public User() {

	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Returns the name
	 * 
	 * @author Albin Olausson
	 * @return
	 */

	public String getName() {
		return name;
	}

	/**
	 * Returns id
	 * 
	 * @author Albin Olausson
	 * @return
	 */

	public int getId() {
		return id;
	}

	/**
	 * Returns the password
	 * 
	 * @author Albin Olausson
	 * @return
	 */
	public String getPassword() {
		return password;
	}

}
