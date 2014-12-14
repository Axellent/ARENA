package play;

import general.Connection;

import java.io.Serializable;

/**
 * 
 * @author Axel Sigl
 *
 */
public class Game implements Serializable{
	private static final long serialVersionUID = -6704043570819952414L;
	private String name;
	private int nPlayers;

	/**
	 *
	 * @author Axel Sigl
	 * @param name
	 * @param nPlayers
	 */
	public Game(String name, int nPlayers){
		this.name = name;
		this.nPlayers = nPlayers;
	}
	
	/**
	 * Note that the only game currently on the arena server (fourinarow) has not been fully implemented for multiplayer yet.
	 * @author Axel Sigl
	 * @param connection
	 */
	public void setupMatch(Connection connection, String path, String args){
		connection.command("startGame " + path + " " + args);
	}
}
