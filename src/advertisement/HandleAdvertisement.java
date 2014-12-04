package advertisement;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

/**
 * Creates and handles an advertisement.
 * @author Albin Olausson
 *
 */
public class HandleAdvertisement extends AdvertiserTools {

	private double costPerDay = 50;
	private int days;
	BufferedImage ad;

	public HandleAdvertisement() {

	}

	/**
	 * Defines a new advertisementscheme
	 * @author Albin Olausson
	 * @param startDate
	 * @param stopDate
	 * @param leagueId
	 * @param placement
	 * @return DefineAdvertisementScheme
	 */
	public DefineAdvertisementScheme createAdvertisementScheme(Date startDate,
			Date stopDate, int leagueId, int placement) {

		return new DefineAdvertisementScheme();
	}

	/**
	 * Returns the total price for an ad
	 * @author Albin Olausson
	 * @param newScheme
	 * @return double
	 */
	public double getPrice(DefineAdvertisementScheme newScheme) {

		days = (int) ((newScheme.getStartDate().getTime() - newScheme
				.getStopDate().getTime()) / 86400000);

		return days * this.costPerDay;

	}

	/**
	 * reads an ad from a file and resize it
	 * @author Albin Olausson
	 * @param adName
	 */
	public void setAdImage(String adName) {

		try {
			// scale image on disk
			BufferedImage originalImage = ImageIO.read(new File(adName));
			int type = originalImage.getType() == 0 ? BufferedImage.TYPE_INT_ARGB
					: originalImage.getType();

			BufferedImage resizedImage = resizeImage(originalImage, type, 150,
					150);

			this.ad = resizedImage;
		} catch (IOException e) {
		}

	}

	
	/**
	 * Resizes an ad image
	 * @author Albin Olausson
	 * @param originalImage
	 * @param type
	 * @param img_width
	 * @param img_height
	 * @return Image
	 */
	private static BufferedImage resizeImage(BufferedImage originalImage,
			int type, Integer img_width, Integer img_height) {
		BufferedImage resizedImage = new BufferedImage(img_width, img_height,
				type);
		Graphics2D g = resizedImage.createGraphics();
		g.drawImage(originalImage, 0, 0, img_width, img_height, null);
		g.dispose();

		return resizedImage;
	}

	
	/**
	 * returns an ad
	 * @author Albin Olausson
	 * @return Image
	 */
	public BufferedImage getAdImage() {
		return this.ad;
	}

}
