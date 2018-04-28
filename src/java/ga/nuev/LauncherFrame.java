package ga.nuev;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class LauncherFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;

	private static final int WIDTH = 800+8+8;
	private static final int HEIGHT = 500+8+31;
	
	LauncherFrame() {
		super("Nuev Launcher");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		//Make frame in the middle of the screen
		this.setBounds((int)((screenSize.getWidth()-WIDTH)/2), (int)((screenSize.getHeight()-HEIGHT)/2), WIDTH, HEIGHT);
		this.setVisible(true);
		
		JPanel panel = new LauncherPanel();
		this.add(panel);
	}
}
