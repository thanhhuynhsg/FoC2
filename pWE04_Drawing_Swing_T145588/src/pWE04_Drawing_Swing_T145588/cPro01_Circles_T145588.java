/**
 * 
 */
package pWE04_Drawing_Swing_T145588;

import javax.swing.JFrame;

/**
 * @author HuynhThanh
 *
 */
public class cPro01_Circles_T145588 extends JFrame {

	cPro01_Circles_Panel panel = new cPro01_Circles_Panel();

	public  cPro01_Circles_T145588(){
		setTitle("10Circles – T145588");
		setSize(500, 500);
		setLayout(null);
		
		add(panel);
		panel.setBounds(10, 10, 500, 500);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cPro01_Circles_T145588 mainwindow = new cPro01_Circles_T145588();
		mainwindow.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainwindow.setVisible(true);
	}

}