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
	
	public LeagueOwner(){
		this.organizeTournament = new OrganizeTournament();
		this.conductTournament = new ConductTournament();
		
		//testing stuff
		createTournament();
		startTournament();
	}
	
	public void createTournament(){
		try {
			organizeTournament.createTournament();
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
}
