package league;

import play.Game;
import play.Player;

/**
 * Holds all data required to organize and conduct a tournament
 * @author Axel Sigl
 *
 */
public class Tournament {
	private LeagueOwner leagueOwner;
	private Game game;
	private Schedule schedule;
	private String name;
	private int minPlayers;
	private int maxPlayers;
	private Player[] players;
	private int nPlayers;
	
	/**
	 * Creates a new Tournament object with the default amount of minPlayers.
	 * @author Axel Sigl
	 * @param name
	 * @param maxPlayers
	 */
	public Tournament(LeagueOwner leagueOwner, Game game, String name, int maxPlayers){
		new Tournament(leagueOwner, game, name, maxPlayers, 1);
	}
	
	/**
	 * Creates a Tournament object with the given parameters.
	 * @author Axel Sigl
	 * @param name
	 * @param maxPlayers
	 * @param minPlayers
	 */
	public Tournament(LeagueOwner leagueOwner, Game game, String name, int maxPlayers, int minPlayers){
		schedule = new Schedule();
		this.leagueOwner = leagueOwner;
		this.game = game;
		this.name = name;
		this.maxPlayers = maxPlayers;
		this.minPlayers = minPlayers;
		nPlayers = 0;
	}
	
	/**
	 * Adds a player to the tournament if the maximum is not reached.
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
	
	public void scheduleMatches(){
		schedule.randomSchedule(this);
	}
	
	/**
	 * Changes tournament name.
	 * @author Axel Sigl
	 * @param name
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * Changes minimum number of players.
	 * @author Axel Sigl
	 * @param minPlayers
	 */
	public void setMinPlayers(int minPlayers){
		this.minPlayers = minPlayers;
	}
	
	/**
	 * Changes maximum number of players.
	 * @author Axel Sigl
	 * @param maxPlayers
	 */
	public void setMaxPlayers(int maxPlayers){
		this.maxPlayers = maxPlayers;
	}
	
	/**
	 * 
	 * @author Axel Sigl
	 * @return Schedule for the tournament.
	 */
	public Schedule getSchedule(){
		return schedule;
	}
	
	/**
	 * 
	 * @author Axel Sigl
	 * @return Name of the tournament.
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * 
	 * @author Axel Sigl
	 * @return Minimum number of players.
	 */
	public int getMinPlayers(){
		return minPlayers;
	}
	
	/**
	 * 
	 * @author Axel Sigl
	 * @return Maximum number of players.
	 */
	public int getMaxPlayers(){
		return maxPlayers;
	}
	
	/**
	 * 
	 * @author Axel Sigl
	 * @return All players in the tournament.
	 */
	public Player[] getPlayers(){
		return players;
	}
	
	/**
	 * 
	 * @author Axel Sigl
	 * @return Number of players in the tournament.
	 */
	public int getnPlayers(){
		return nPlayers;
	}
}
