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
	
	public void setID(int ID){
		this.ID = ID;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getID(){
		return ID;
	}
	
	public String getName(){
		return name;
	}
}
