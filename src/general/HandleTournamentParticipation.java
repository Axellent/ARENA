package general;


import play.Player;
import league.Tournament;


/**
 * Adds a player to a tournament
 * if it's not full
 *
 * @author Albin Olausson
 */
public class HandleTournamentParticipation extends GeneralTools{
	int count = 0;
	
	public HandleTournamentParticipation(){
		
	}
	

	/**
	 * 
	 *adds a player if it's not full
	 *@author Albin Olausson
	 * @param player
	 * @param league
	 */
	public void addPlayerToTournament(Player player, Tournament tournament) {
		
		count = countPlayersinTournament(tournament);
		
		if (tournament.getMaxPlayers() < count)
			
			tournament.addPlayer(player);
		
		else System.out.println("Tournament is full");

	}

	
	/**
	 * 
	 *count's the players allready in the tournament.
	 *@author Albin Olausson
	 * @param league
	 * @return count
	 */
	public int countPlayersinTournament(Tournament tournament) {
		count = 0;

		for (int i = 0; i <= tournament.getPlayers().length; i++) {
			if (i > 0) 
				count++;	
		}
		return count;
	}
}





