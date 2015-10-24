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
public class cPro01_Circles_Panel extends JPanel {
	int i;
	int n=20;
	int x0=0, y0=0;

	public void paint(Graphics g){ 
		for (i=1; i<n; i++ ){
		g.drawOval( x0*i, y0*i, 20*i, 20*i); 
		}
	} 
}
