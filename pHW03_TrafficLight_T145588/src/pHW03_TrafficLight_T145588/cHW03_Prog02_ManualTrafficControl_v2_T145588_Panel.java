/**
 * 
 */
package pHW03_TrafficLight_T145588;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * @author Thanh Huynh (T145588)
 *
 */
public class cHW03_Prog02_ManualTrafficControl_v2_T145588_Panel extends JPanel {
	Timer Cou = null;
	int t;

	public void redT() {
		t = 1;
		repaint();
	}

	public void greenT() {
		t = 2;
		repaint();
	}

	public void yellowT() {
		t = 3;
		repaint();
	}

	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.black);
		g.fillRect(49, 10, 52, 160);
		g.setColor(Color.gray);
		g.fillOval(50, 10, 50, 50);
		g.fillOval(50, 65, 50, 50);
		g.fillOval(50, 120, 50, 50);
		if (t == 1) {
			g.setColor(Color.red);
			g.fillOval(50, 10, 50, 50);
		}
		if (t == 2) {
			g.setColor(Color.green);
			g.fillOval(50, 65, 50, 50);
		}
		if (t == 3) {
			g.setColor(Color.yellow);
			g.fillOval(50, 120, 50, 50);
		}
	}
}
