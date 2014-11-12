package league;

import java.util.Random;
import play.Player;

/**
 * 
 * @author Axel Sigl
 *
 */
public class Schedule {
	private Player[] unScheduledPlayers;
	private int nUnScheduledPlayers;
	private Player[][] matches;
	private int nMatches;

	/**
	 * Creates a random tournament schedule.
	 * @Known_Problems schedule for uneven number of players?
	 * @author Axel Sigl
	 * @param tournament
	 */
	public void randomSchedule(Tournament tournament){
		Random rand = new Random();
		int randPlayer;
		
		unScheduledPlayers = tournament.getPlayers();
		nUnScheduledPlayers = tournament.getnPlayers();
		matches = new Player[tournament.getMaxPlayers()][2];
		nMatches = 0;
		
		for(int i = 0; i < tournament.getnPlayers()/2; i++){
			randPlayer = rand.nextInt((nUnScheduledPlayers - 0)) + 0;
			matches[i][1] = unScheduledPlayers[randPlayer];
			removeUnscheduledPlayer(randPlayer);
			
			randPlayer = rand.nextInt((nUnScheduledPlayers - 0)) + 0;
			matches[i][2] = unScheduledPlayers[randPlayer];
			removeUnscheduledPlayer(randPlayer);
		}
	}
	
	private void removeUnscheduledPlayer(int pos){
		
	}
}
