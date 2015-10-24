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
public class cPro03_Squares_Panel extends JPanel {
	int i;
	int n=10;
	int x0=10, y0=20;

	public void paint(Graphics g){ 
		for (i=1; i<=n; i++ ){
		g.drawRect( 140 - (x0*i), 140- (x0*i), y0*i, y0*i); 
		}
	} 
	

}
