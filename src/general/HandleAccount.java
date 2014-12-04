package general;

import play.Player;

/**
 * 
 * @author Axel Sigl
 *
 */
public class HandleAccount extends GeneralTools{
	
	private Player player;
	
	
	/**
	 * @author Andreas Lönnermark
	 */
	public HandleAccount(Player player){
		this.player = player;
	}
	
	/**
	 * @author Andreas Lönnermark
	 */
	public void changeUsername(String username){
		player.setName(username);
	}
	
	/**
	 * @author Andreas Lönnermark
	 */
	public void changePassword(String password){
		player.setPassword(password);
	}
	
	

}
