package league;

/**
 * 
 * @author Axel Sigl
 *
 */
public class ConductTournament extends LeagueTools{
	private Tournament tournament;
	private Schedule schedule;
	
	@Override
	public void startTournament(Tournament tournament){
		this.tournament = tournament;
		schedule = new Schedule();
	}
	
	@Override
	public void scheduleMatches(){
		schedule.randomSchedule(tournament);
	}
	
	@Override
	public void kickoffTournament(){
		
	}
	
}
