package ga.nuev;

import java.awt.Graphics;

import javax.swing.JPanel;

public class LauncherPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * 26, 26, 311, 85
	 * 351, 27, 37, 37
	 * 351, 71, 37, 37
	 * 25, 140, 363, 250
	 * 412, 25, 363, 340
	 */

	@Override
	public void paintComponent(Graphics g) {
		g.drawRect(26, 26, 311, 85);
		g.drawOval(351, 27, 37, 37);
		g.drawOval(351, 71, 37, 37);
		g.drawRect(25, 140, 360, 250);
		g.drawRect(412, 25, 363, 340);
	}
}
