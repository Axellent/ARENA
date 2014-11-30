package advertisement;

import java.util.Date;

/**
 * 
 * @author Axel Sigl
 *
 */
public class HandleAdvertisement extends AdvertiserTools {

	private double costPerDay = 50, totalCost;
	private int days;

	public HandleAdvertisement() {

	}

	public DefineAdvertisementScheme createAdvertisementScheme(Date startDate,
			Date stopDate, int leagueId, int placement) {

		return new DefineAdvertisementScheme();
	}

	public void getPrice(DefineAdvertisementScheme newScheme) {

		days = (int) ((newScheme.getStartDate().getTime() - newScheme
				.getStopDate().getTime()) / 86400000);
	
		
	}

	public double getTotalCost() {
		return totalCost;
	}
	

}
