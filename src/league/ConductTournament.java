package league;

/**
 * 
 * @author Axel Sigl
 *
 */
public class ConductTournament extends LeagueTools{
	private Tournament tournament;
	
	@Override
	public void startTournament(Tournament tournament){
		this.tournament = tournament;
	}
	
	@Override
	public void scheduleMatches(){
		tournament.getSchedule().randomSchedule(tournament);
	}
	
	@Override
	public void kickoffTournament(){
		
	}
	
}
