package play;

import general.User;

/**
 * 
 * @author Axel Sigl
 *
 */
public class Player extends User{
	private int ID;
	private String name;
	private PlayGame playGame;
	
	/**
	 * Changes player ID.
	 * @author Axel Sigl
	 * @param ID
	 */
	public void setID(int ID){
		this.ID = ID;
	}
	
	/**
	 * Changes player name.
	 * @author Axel Sigl
	 * @param name
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * 
	 * @author Axel Sigl
	 * @return Id of the player.
	 */
	public int getID(){
		return ID;
	}
	
	/**
	 * 
	 * @author Axel Sigl
	 * @return Name of the player.
	 */
	public String getName(){
		return name;
	}
}
