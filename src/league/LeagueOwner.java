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
	private League[] leagues;
	
	public LeagueOwner(String name){
		setName(name);
		this.organizeTournament = new OrganizeTournament();
		this.conductTournament = new ConductTournament();
		
		//testing stuff
		createTournament();
		startTournament();
		scheduleMatches();
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
