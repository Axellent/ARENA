package advertisement;

import java.util.Date;

/**
 * 
 *
 * @author Albin Olausson
 */

public class DefineAdvertisementScheme extends AdvertiserTools {

	private Date startDate;
	private Date stopDate;
	private int leagueId;
	private int tournamentId;


	public void DefineAdvertismentScheme(Date startDate, Date stopDate,
			int leagueId, int tournamentId) {
		
		this.startDate = startDate;
		this.stopDate = stopDate;
		this.leagueId = leagueId;
		this.tournamentId = tournamentId;
	
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getStopDate() {
		return stopDate;
	}

	public int getLeagueId() {
		return leagueId;
	}

	public int getTournamentId() {
		return tournamentId;
	}


}
