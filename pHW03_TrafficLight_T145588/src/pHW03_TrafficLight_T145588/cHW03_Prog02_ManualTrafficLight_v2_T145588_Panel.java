/**
 * 
 */
package pHW03_TrafficLight_T145588;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * @author HuynhThanh
 *
 */
public class cHW03_Prog02_ManualTrafficLight_v2_T145588_Panel extends JPanel {
	int t;
	int i;

	public void red() {
		t = 1;
	}

	public void yellow() {
		t = 2;
	}

	public void Green() {
		t = 3;
	}

	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(49, 99, 51, 163);
		g.setColor(Color.gray);
		g.fillOval(50, 100, 50, 50);
		g.fillOval(50, 155, 50, 50);
		g.fillOval(50, 210, 50, 50);
		if (t == 1) {
			g.setColor(Color.red);
			g.fillOval(50, 100, 50, 50);
		}
		if (t == 2) {
			g.setColor(Color.green);
			g.fillOval(50, 155, 50, 50);
		}
		if (t == 3) {
			g.setColor(Color.yellow);
			g.fillOval(50, 210, 50, 50);
		}
	}
}
