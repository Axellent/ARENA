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
	private int tournamentId = -1;
	int placement;
	private Image ad;
	private double price;
	private int userId;
	
	public void DefineAdvertismentScheme(Date startDate, Date stopDate, int leagueId, int placement, double price) {
		this.startDate= startDate;
		this.stopDate = stopDate;
		this.leagueId = leagueId;
		this.placement = placement;
		this.price = price;
		
	}


	public void setTournamentId(int tournamentId){
		this.tournamentId = tournamentId;
	}
	
	private void setAd(Image ad){
		this.ad = ad;
	}
	
		
	public Date getStartDate(){
		return startDate;
	}
	
	public Date getStopDate(){
		return stopDate;
	}
	
	public int getLeagueId(){
		return leagueId;
	}
	
	public int getTournamentId(){
		return tournamentId;
	}
	
	
	public int getPlacement(){
		return placement;
	}
	
	public Image getAd(){
		return ad;
	}
	public double getPrice(){
		return price;
	}
	

	
	


}
