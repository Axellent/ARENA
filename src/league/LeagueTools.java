package league;

import general.UnimplementedToolException;

/**
 * 
 * @author Axel Sigl
 *
 */
public abstract class LeagueTools {
	
	public void createTournament() throws UnimplementedToolException{
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
}
