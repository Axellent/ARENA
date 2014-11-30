package advertisement;

import java.awt.Image;
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
	private Image image;

	public void DefineAdvertismentScheme(Date startDate, Date stopDate,
			int leagueId, Image image, int tournamentId) {
		
		this.startDate = startDate;
		this.stopDate = stopDate;
		this.leagueId = leagueId;
		this.tournamentId = tournamentId;
		this.image = image;
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

	public Image getAd() {
		return image;
	}
}
