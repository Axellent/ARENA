package league;

/**
 * 
 * @author Axel Sigl
 *
 */
public class HandleLeague extends LeagueTools{
	private League league;
	
	@Override
	public void startLeague(LeagueOwner leagueOwner){
		league = new League(leagueOwner, 50, 2);
	}
	
	/**
	 * 
	 * @author Axel Sigl
	 * @param league
	 */
	public void setLeague(League league){
		this.league = league;
	}
	
	/**
	 * 
	 * @author Axel Sigl
	 * @return
	 */
	public League getLeague(){
		return league;
	}
	
}
