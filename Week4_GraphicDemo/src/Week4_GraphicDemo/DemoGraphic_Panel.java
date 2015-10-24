/**
 * 
 */
package Week4_GraphicDemo;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * @author HuynhThanh
 *
 */
public class DemoGraphic_Panel extends JPanel {
	int row = 20, col = 12;
	int x0 = 1, y0 = 1, d = 20;
	int i;

	// paint function
	public void paint(Graphics gi) {
		gi.setColor(Color.BLUE);

		for (i = 1; i < row; i++) {
			gi.drawLine(x0, y0 + i * d, x0 + col * d, y0 + i * d);
		}
		;

		for (i = 1; i < col; i++) {
			gi.drawLine(x0 + i * d, y0, x0 + i * d, y0 + row * d);
		}
		;

		gi.setColor(Color.RED);
		gi.fillRect(x0 + 5 * d, y0 + 3 * d, d + 1, 3 * d + 1);
		gi.fillRect(x0 + 6 * d, y0 + 4 * d, d + 1, d + 1);
	}
}
