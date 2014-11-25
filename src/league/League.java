package league;

import play.Game;
import play.Player;

/**
 * TODO Move the add and remove players to LeagueTools or some such.
 * @author Axel SIgl
 *
 */
public class League {
	private LeagueOwner leagueOwner;
	private int minPlayers;
	private int maxPlayers;
	private Player[] players;
	private int nPlayers;
	
	/**
	 * Creates a League with the default amount of minPlayers.
	 * @author Axel Sigl
	 * @param leagueOwner
	 * @param maxPlayers
	 */
	public League(LeagueOwner leagueOwner, int maxPlayers){
		new League(leagueOwner, maxPlayers, 1);
	}
	
	/**
	 * Creates a League with the settings given.
	 * @author Axel Sigl
	 * @param leagueOwner
	 * @param maxPlayers
	 * @param minPlayers
	 */
	public League(LeagueOwner leagueOwner, int maxPlayers, int minPlayers){
		this.leagueOwner = leagueOwner;
		this.maxPlayers = maxPlayers;
		this.minPlayers = minPlayers;
		nPlayers = 0;
	}
	
	/**
	 * Adds a player to the league if the maximum is not reached.
	 * @author Axel Sigl
	 * @param player
	 */
	public void addPlayer(Player player){
		if(nPlayers < maxPlayers){
			players[nPlayers] = player;
			nPlayers++;
		}
		else{
			System.out.println("Maximum players reached!");
		}
	}
	
	/**
	 * Searches the players vector and removes the player with the matching ID.
	 * @author Axel Sigl
	 * @param player
	 */
	public void removePlayer(Player player){
		for(int i = 0; i < nPlayers; i++){
			if(player.getID() == players[i].getID()){
				removePlayer(i);
			}
		}
	}
	
	/**
	 * Removes the player at given index.
	 * @author Axel Sigl
	 * @param pos
	 */
	public void removePlayer(int pos){
		for(int i = pos; i < nPlayers; i++){
			players[i] = players[i+1];
		}
	}
	
	/**
	 * 
	 * @author Axel Sigl
	 * @param leagueOwner
	 */
	public void setLeagueOwner(LeagueOwner leagueOwner){
		this.leagueOwner = leagueOwner;
	}
	
	/**
	 * 
	 * @author Axel Sigl
	 * @param players
	 */
	public void setPlayers(Player[] players){
		this.players = players;
	}
	
	/**
	 * 
	 * @author Axel Sigl
	 * @return
	 */
	public LeagueOwner getLeagueOwner(){
		return leagueOwner;
	}
	
	/**
	 * 
	 * @author Axel Sigl
	 * @return
	 */
	public Player[] getPlayers(){
		return players;
	}
}
