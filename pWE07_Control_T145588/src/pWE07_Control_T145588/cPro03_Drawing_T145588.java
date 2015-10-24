/**
 * 
 */
package pWE07_Control_T145588;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author HuynhThanh
 *
 */
public class cPro03_Drawing_T145588 extends JFrame {
	JTextField x1 = new JTextField(),
			 x2 = new JTextField(),
			 y1 = new JTextField(),
			y2 = new JTextField();
	JLabel note = new JLabel("Nhap toa do hinh chu nhat"),
			a = new JLabel("a = "),
			b = new JLabel("b = "),
			c = new JLabel("c = "),
			d = new JLabel("d = ");
	JButton ve = new JButton("Ve");	
		/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cPro03_Drawing_T145588 wMain = new cPro03_Drawing_T145588();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);
	}

	
	public cPro03_Drawing_T145588() {

		//set window
		setTitle("Draw Rect - T145588");
		setSize(500, 500);
		setLayout(null);
		//add
		add(note);
		add(x1);
		add(x2);
		add(y1);
		add(y2);
		add(a);
		add(b);
		add(c);
		add(d);
		add(ve);
		//set location
		note.setBounds(10, 10, 200, 25);
		a.setBounds(10, 40, 50, 25);
		x1.setBounds(30, 40, 50, 25);
		b.setBounds(100, 40, 50, 25);
		y1.setBounds(120, 40, 50, 25);
		c.setBounds(10, 70, 50, 25);
		x2.setBounds(30, 70, 50, 25);
		d.setBounds(100, 70, 50, 25);
		y2.setBounds(120, 70, 50, 25);
		ve.setBounds(200, 50, 50, 25);
		
		
	}
	
}

