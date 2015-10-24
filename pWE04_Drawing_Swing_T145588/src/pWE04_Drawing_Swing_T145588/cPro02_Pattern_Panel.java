/**
 * 
 */
package pWE04_Drawing_Swing_T145588;

import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * @author HuynhThanh
 *
 */
public class cPro02_Pattern_Panel extends JPanel {
	public void paint(Graphics g) {
		g.drawLine(150, 0, 150, 300);
		g.drawLine(0, 135, 300, 135);
		g.drawOval(25, 25, 100, 100);
		g.drawOval(175, 25, 100, 100);
		g.drawOval(25, 160, 100, 100);
		g.drawOval(175, 160, 100, 100);
		g.drawLine(75, 25, 75, 125);
		g.drawLine(25, 75, 125, 75);

		g.drawLine(225, 25, 225, 125);
		g.drawLine(125, 75, 125, 75);

		g.drawLine(150, 255, 25, 225);
		g.drawLine(25, 75, 125, 75);

		g.drawLine(75, 25, 75, 125);
		g.drawLine(25, 75, 125, 75);

	}
}
