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
	 * @author Andreas Lönnermark
	 */
	public CheckStatistics(Player player){
		this.player=player;
		
	}
	
	/**
	 * Returns the number of matches played
	 * @author Andreas Lönnermark
	 * @return
	 */
	public int getMatchesPlayed(){
		return player.getMatchesPlayed();
	}
	
	/**
	 * Returns the number of matches won
	 * @author Andreas Lönnermark
	 * @return
	 */
	public int getMatchesWon(){
		return player.getMatchesWon();
	}
	
	/**
	 * Returns the number of matches lost
	 * @author Andreas Lönnermark
	 * @return
	 */
	public int getMatchesLost(){
		return player.getMatchesLost();
	}
	
	/**
	 * Returns the ranking
	 * @author Andreas Lönnermark
	 * @return
	 */
	public int getRanking(){
		return player.getRanking();
	}

}
