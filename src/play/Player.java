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
	
	public Player(){
		
	}
	
	public int getMatchesPlayed(){
		return matchesPlayed;
	}
	
	public int getMatchesWon(){
		return matchesWon;
	}
	
	public int getMatchesLost(){
		return matchesLost;
	}
	
	public int getRanking(){
		return ranking;
	}
	
}
