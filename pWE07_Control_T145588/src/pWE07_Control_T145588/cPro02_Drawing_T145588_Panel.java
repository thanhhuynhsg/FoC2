/**
 * 
 */
package pWE07_Control_T145588;

import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * @author Thanh Huynh (T145588)
 *
 */
public class cPro02_Drawing_T145588_Panel extends JPanel {
	cPro02_Drawing_T145588 bcd = new cPro02_Drawing_T145588();
	int a, b, c,d;
	
	public void paint(Graphics g){
		g.drawRect(a, b,  c, d);	
	}

	
}
