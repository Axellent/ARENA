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
	 * @author Andreas L�nnermark
	 */
	public HandleAccount(Player player){
		this.player = player;
	}
	
	/**
	 * @author Andreas L�nnermark
	 */
	public void changeUsername(String username){
		player.setName(username);
	}
	
	/**
	 * @author Andreas L�nnermark
	 */
	public void changePassword(String password){
		player.setPassword(password);
	}
	
	

}
