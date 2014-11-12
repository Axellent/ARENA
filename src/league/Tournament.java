package league;

import play.Player;

/**
 * 
 * @author Axel Sigl
 *
 */
public class Tournament {
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
	public Tournament(String name, int maxPlayers){
		this.name = name;
		this.maxPlayers = maxPlayers;
		minPlayers = 1;
		players = new Player[maxPlayers];
		nPlayers = 0;
	}
	
	/**
	 * Creates a Tournament object with the given parameters.
	 * @author Axel Sigl
	 * @param name
	 * @param maxPlayers
	 * @param minPlayers
	 */
	public Tournament(String name, int maxPlayers, int minPlayers){
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
