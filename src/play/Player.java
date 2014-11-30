package play;

import general.User;

/**
 * 
 * @author Axel Sigl
 *
 */

public class Player extends User{
	private Game game;
	private int matchesPlayed;
	private int matchesWon;
	private int matchesLost;
	private int ranking;
	
	
	
	/**
	 * @author Andreas L�nnermark
	 */
	public Player(String name, String password, int id){
	    setName(name);
	    setPassword(password);
	    setId(id);
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
