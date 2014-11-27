package general;

import play.Player;

/**
 * 
 * @author Axel Sigl
 *
 */


public class CheckStatistics extends GeneralTools{
	private Player player;
	
	/**
	 * @author Andreas L�nnermark
	 */
	public CheckStatistics(Player player){
		this.player=player;
		
	}
	
	/**
	 * Returns the number of matches played
	 * @author Andreas L�nnermark
	 * @return
	 */
	public int getMatchesPlayed(){
		return player.getMatchesPlayed();
	}
	
	/**
	 * Returns the number of matches won
	 * @author Andreas L�nnermark
	 * @return
	 */
	public int getMatchesWon(){
		return player.getMatchesWon();
	}
	
	/**
	 * Returns the number of matches lost
	 * @author Andreas L�nnermark
	 * @return
	 */
	public int getMatchesLost(){
		return player.getMatchesLost();
	}
	
	/**
	 * Returns the ranking
	 * @author Andreas L�nnermark
	 * @return
	 */
	public int getRanking(){
		return player.getRanking();
	}

}
