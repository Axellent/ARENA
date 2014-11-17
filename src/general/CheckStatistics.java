package general;

import play.Player;

/**
 * 
 * @author Axel Sigl
 *
 */


public class CheckStatistics extends GeneralTools{
	private Player player;
	
	
	public CheckStatistics(Player player){
		this.player=player;
		
	}
	
	public int getMatchesPlayed(){
		return player.getMatchesPlayed();
	}
	
	public int getMatchesWon(){
		return player.getMatchesWon();
	}
	
	public int getMatchesLost(){
		return player.getMatchesLost();
	}
	
	public int getRanking(){
		return player.getRanking();
	}

}
