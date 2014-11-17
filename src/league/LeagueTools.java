package league;

import play.Player;
import general.UnimplementedToolException;

/**
 * 
 * @author Axel Sigl
 *
 */
public abstract class LeagueTools {
	
	public League startLeague() throws UnimplementedToolException{
		throw new UnimplementedToolException("startLeague");
	}
	
	public void createTournament(LeagueOwner leagueOwner) throws UnimplementedToolException{
		throw new UnimplementedToolException("createTournament");
	}
	
	public void submitAdvertisement(Tournament tournament) throws UnimplementedToolException{
		throw new UnimplementedToolException("submitAdvertisement");
	}
	
	public Tournament getTournament() throws UnimplementedToolException{
		throw new UnimplementedToolException("getTournament");
	}
	
	public void startTournament(Tournament tournament) throws UnimplementedToolException{
		throw new UnimplementedToolException("startTournament");
	}
	
	public void scheduleMatches() throws UnimplementedToolException{
		throw new UnimplementedToolException("scheduleMatches");
	}
	
	public void kickoffTournament() throws UnimplementedToolException{
		throw new UnimplementedToolException("kickoffTournament");
	}
	
	public void announceTournament(Tournament tournament) throws UnimplementedToolException{
		throw new UnimplementedToolException("announceTournament");
	}

	public void applyForTournament(Tournament tournament, Player player) throws UnimplementedToolException{
		throw new UnimplementedToolException("applyForTournament");
	}
}
