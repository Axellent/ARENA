package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Stella Wallin
 *
 */
public class ArenaFrame extends JFrame {
	private String path;
	private JLabel arenaLogo;
	private ImageIcon icon = null;
	private BufferedImage myPicture = null;
	private Box logoBox;
	private Box loginPanelBox;
	private Box advertiserPanelBox;
	private Box playerPanelBox;
	private Box leagueOwnerPanelBox;
	private Box operatorPanelBox;

	public ArenaFrame() {
		super();

		String OS = System.getProperty("os.name").toLowerCase();

		if (OS.indexOf("win") >= 0) {
			path = "img\\arena_logo.png";
		}
		if (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0
				|| OS.indexOf("aix") >= 0) {
			path = "img/arena_logo.png";
		}

		try {
			myPicture = ImageIO.read(new File(path));
			icon = new ImageIcon(myPicture);
		} catch (IOException ex) {

		}

		setLayout(new BorderLayout());

		/*
		 * Box for logotype
		 */
		arenaLogo = new JLabel(icon);
		logoBox = Box.createHorizontalBox();
		logoBox.add(arenaLogo);
		this.add(logoBox, BorderLayout.PAGE_START);

		getContentPane().setBackground(Color.black);
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);

	}

	public Box getPlayerPanelBox() {
		playerPanelBox = Box.createHorizontalBox();
		playerPanelBox.setBorder(new EmptyBorder(50, 150, 150, 150));
		return playerPanelBox;
	}

	public Box getLeagueOwnerPanelBox() {
		leagueOwnerPanelBox = Box.createHorizontalBox();
		leagueOwnerPanelBox.setBorder(new EmptyBorder(50, 200, 200, 200));
		return leagueOwnerPanelBox;
	}

	public Box getOperatorPanelBox() {
		operatorPanelBox = Box.createHorizontalBox();
		operatorPanelBox.setBorder(new EmptyBorder(50, 200, 200, 200));
		return operatorPanelBox;
	}

	public Box getAdvertiserPanelBox() {
		advertiserPanelBox = Box.createHorizontalBox();
		advertiserPanelBox.setBorder(new EmptyBorder(50, 200, 200, 200));
		return advertiserPanelBox;
	}

	public Box getLoginPanelBox() {
		loginPanelBox = Box.createHorizontalBox();
		loginPanelBox.setBorder(new EmptyBorder(80, 200, 100, 200));
		return loginPanelBox;
	}

}
