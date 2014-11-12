package league;

/**
 * 
 * @author Axel Sigl
 *
 */
public class AnnounceTournament extends LeagueTools{
	
	@Override
	public void announceTournament(Tournament tournament){
		System.out.println("Announcing tournament: " + tournament.getName()
				+ " Minimum players: " + tournament.getMinPlayers()
				+ " Maximum players: " + tournament.getMaxPlayers());
	}
}
