package league;

import play.Player;

public class Tournament {
	private String name;
	private int minPlayers;
	private int maxPlayers;
	private Player[] players;
	private int nPlayers;
	
	/**
	 * 
	 * @author Axel Sigl
	 * @param name
	 */
	public Tournament(String name, int maxPlayers){
		this.name = name;
		this.maxPlayers = maxPlayers;
		minPlayers = 1;
		players = new Player[maxPlayers];
		nPlayers = 0;
	}
	
	/**
	 * 
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
	 * 
	 * @author Axel Sigl
	 * @param name
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * 
	 * @author Axel Sigl
	 * @param minPlayers
	 */
	public void setMinPlayers(int minPlayers){
		this.minPlayers = minPlayers;
	}
	
	/**
	 * 
	 * @author Axel Sigl
	 * @param maxPlayers
	 */
	public void setMaxPlayers(int maxPlayers){
		this.maxPlayers = maxPlayers;
	}
	
	/**
	 * 
	 * @author Axel Sigl
	 * @return
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * 
	 * @author Axel Sigl
	 * @return
	 */
	public int getMinPlayers(){
		return minPlayers;
	}
	
	/**
	 * 
	 * @author Axel Sigl
	 * @return
	 */
	public int getMaxPlayers(){
		return maxPlayers;
	}
}
