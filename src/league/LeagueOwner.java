package league;

import general.UnimplementedToolException;
import general.User;

/**
 * 
 * @author Axel Sigl
 *
 */
public class LeagueOwner extends User{
	private LeagueTools organizeTournament;
	private LeagueTools conductTournament;
	private LeagueTools handleLeague;
	private League[] leagues;
	
	public LeagueOwner(String name){
		setName(name);
		organizeTournament = new OrganizeTournament();
		conductTournament = new ConductTournament();
		handleLeague = new HandleLeague();
		
		//testing stuff
		startLeague();
		createTournament();
		startTournament();
		scheduleMatches();
	}
	
	public void startLeague(){
		try {
			handleLeague.startLeague();
		} catch (UnimplementedToolException e) {
			e.printStackTrace();
		}
	}
	
	public void createTournament(){
		try {
			organizeTournament.createTournament(this);
		} catch (UnimplementedToolException e) {
			e.printStackTrace();
		}
	}
	
	public void startTournament(){
		try {
			conductTournament.startTournament(organizeTournament.getTournament());
		} catch (UnimplementedToolException e) {
			e.printStackTrace();
		}
	}
	
	public void scheduleMatches(){
		try {
			conductTournament.scheduleMatches();
		} catch (UnimplementedToolException e) {
			e.printStackTrace();
		}
	}
}
