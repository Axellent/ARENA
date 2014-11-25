package play;

import general.User;

/**
 * 
 * @author Axel Sigl
 *
 */

public class Player extends User{
	private Game game;
	private String name;
	private String password;
	private int ID;
	private int matchesPlayed;
	private int matchesWon;
	private int matchesLost;
	private int ranking;
	
	
	
	/**
	 * @author Andreas L�nnermark
	 */
	public Player(){
		this.name = super.getName();
		this.password = super.getPassword();
		this.ID = super.getID();
	}
	
	/**
	 * Returns the number of matches played
	 * @author Andreas L�nnermark
	 * @return
	 */
	public int getMatchesPlayed(){
		return matchesPlayed;
	}

	/**
	 * Returns the number of matches won
	 * @author Andreas L�nnermark
	 * @return
	 */
	public int getMatchesWon(){
		return matchesWon;
	}

	/**
	 * Returns the number of matches lost
	 * @author Andreas L�nnermark
	 * @return
	 */
	public int getMatchesLost(){
		return matchesLost;
	}

	/**
	 * Returns the ranking
	 * @author Andreas L�nnermark
	 * @return
	 */
	public int getRanking(){
		return ranking;
	}
	
}
