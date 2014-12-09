package general;

import play.Player;

import league.League;



/**
 * 
 *adds a player to a league if it's not full
 * @author Albin Olausson
 */
public class HandleLeagueParticipation extends GeneralTools {
	int count;

	public HandleLeagueParticipation() {

	}
	

	/**
	 * 
	 *adds a player to a league if it's not full
	 *@author Albin Olausson
	 * @param player
	 * @param league
	 */
	public void addPlayerToLeague(Player player, League league) {
		count = countPlayersInLeague(league);
		if (league.getMaxPlayers() < count)

			league.addPlayer(player);
		
		else System.out.println("League is full");

	}

	
	/**
	 * 
	 *count's the players already in the league.
	 *@author Albin Olausson
	 * @param league
	 * @return
	 */
	public int countPlayersInLeague(League league) {
		count = 0;

		for (int i = 0; i <= league.getPlayers().length; i++) {
			if (i > 0) {
				count++;
			}
		}
		return count;
	}

}
