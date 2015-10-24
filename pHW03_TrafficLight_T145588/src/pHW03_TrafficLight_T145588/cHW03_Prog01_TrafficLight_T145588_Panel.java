/**
 * 
 */
package pHW03_TrafficLight_T145588;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * @author HuynhThanh
 *
 */
public class cHW03_Prog01_TrafficLight_T145588_Panel extends JPanel {

	int z = 0;

	public void red() {
		repaint();
		z = 1;
	}

	public void green() {
		repaint();
		z = 2;
	}

	public void yellow() {
		repaint();
		z = 3;
	}

	public void paint(Graphics g) {

		g.setColor(Color.black);
		g.drawLine(600, 00, 600, 300);
		g.drawLine(400, 0, 400, 300);
		g.drawLine(00, 300, 400, 300);
		g.drawLine(00, 500, 400, 500);
		g.drawLine(600, 500, 600, 1000);
		g.drawLine(400, 500, 400, 1000);
		g.drawLine(600, 500, 1000, 500);
		g.drawLine(600, 300, 1000, 300);
		g.setColor(Color.black);
		g.fillRect(360, 180, 40, 120);
		g.fillRect(280, 500, 120, 40);
		g.fillRect(600, 500, 40, 120);
		g.fillRect(600, 260, 120, 40);

		g.setColor(Color.gray);

		g.fillOval(360, 180, 40, 40);
		g.fillOval(360, 220, 40, 40);
		g.fillOval(360, 260, 40, 40);

		g.fillOval(360, 500, 40, 40);
		g.fillOval(320, 500, 40, 40);
		g.fillOval(280, 500, 40, 40);

		g.fillOval(600, 500, 40, 40);
		g.fillOval(600, 540, 40, 40);
		g.fillOval(600, 580, 40, 40);

		g.fillOval(600, 260, 40, 40);
		g.fillOval(640, 260, 40, 40);
		g.fillOval(680, 260, 40, 40);

		if (z == 1) {
			g.setColor(Color.red);
			g.fillOval(360, 260, 40, 40);
			g.fillOval(600, 500, 40, 40);
			g.setColor(Color.green);
			g.fillOval(360, 500, 40, 40);
			g.fillOval(600, 260, 40, 40);
		}
		if (z == 2) {
			g.setColor(Color.green);
			g.fillOval(360, 220, 40, 40);
			g.fillOval(600, 540, 40, 40);
			g.setColor(Color.red);
			g.fillOval(320, 500, 40, 40);
			g.fillOval(640, 260, 40, 40);
		}
		if (z == 3) {
			g.setColor(Color.yellow);
			g.fillOval(360, 180, 40, 40);
			g.fillOval(600, 580, 40, 40);
		}
	}

}
