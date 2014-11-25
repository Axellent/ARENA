package league;

import general.UnimplementedToolException;

/**
 * 
 * @author Axel Sigl
 *
 */
public class OrganizeTournament extends LeagueTools{
	private LeagueTools announceTournament;
	private Tournament tournament;
	
	public OrganizeTournament(){
		announceTournament = new AnnounceTournament();
	}
	
	@Override
	public void createTournament(LeagueOwner leagueOwner){
		tournament = new Tournament(leagueOwner, null, "testname", 10, 2);
		
		try {
			announceTournament.announceTournament(tournament);
		} catch (UnimplementedToolException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void submitAdvertisement(Tournament tournament){
		
	}
	
	/**
	 * 
	 * @author Axel Sigl
	 * @return
	 */
	@Override
	public Tournament getTournament(){
		return tournament;
	}
}
