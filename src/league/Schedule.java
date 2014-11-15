package league;

import java.util.Random;
import play.Player;

/**
 * Handles the schedule for a tournament.
 * @author Axel Sigl
 *
 */
public class Schedule {
	private Player[] unscheduledPlayers;
	private int nUnscheduledPlayers;
	private Player[][] matches;
	private int nMatches;

	/**
	 * Creates a random tournament schedule.
	 * @TODO schedule for uneven number of players?
	 * @TODO scheduling for multiple tournament stages (semifinal, final etc).
	 * @author Axel Sigl
	 * @param tournament
	 */
	public void randomSchedule(Tournament tournament){
		Random rand = new Random();
		int randPlayer;
		
		unscheduledPlayers = tournament.getPlayers();
		nUnscheduledPlayers = tournament.getnPlayers();
		matches = new Player[tournament.getMaxPlayers()][2];
		nMatches = 0;
		
		for(int i = 0; i < tournament.getnPlayers()/2; i++){
			randPlayer = rand.nextInt((nUnscheduledPlayers - 0)) + 0;
			matches[i][1] = unscheduledPlayers[randPlayer];
			nMatches++;
			removeUnscheduledPlayer(randPlayer);
			
			randPlayer = rand.nextInt((nUnscheduledPlayers - 0)) + 0;
			matches[i][2] = unscheduledPlayers[randPlayer];
			nMatches++;
			removeUnscheduledPlayer(randPlayer);
		}
	}
	
	/**
	 * Removes the player at pos from the unscheduledPlayers array.
	 * @author Axel Sigl
	 * @param pos
	 */
	private void removeUnscheduledPlayer(int pos){
		for(int i = pos; i < nUnscheduledPlayers; i++){
			unscheduledPlayers[i] = unscheduledPlayers[i+1];
		}
		nUnscheduledPlayers--;
	}
	
	/**
	 * 
	 * @author Axel Sigl
	 * @return The schedule of all the matches in the tournament.
	 */
	public Player[][] getMatches(){
		return matches;
	}
	
	/**
	 * 
	 * @author Axel Sigl
	 * @return
	 */
	public int getnMatches(){
		return nMatches;
	}
}
