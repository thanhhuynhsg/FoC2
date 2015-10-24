/**
 * 
 */
package pWE04_Drawing_Swing_T145588;

import javax.swing.JFrame;

/**
 * @author HuynhThanh
 *
 */
public class cPro02_Pattern_T145588 extends JFrame {
	
	cPro02_Pattern_Panel panel2 = new cPro02_Pattern_Panel();

	public  cPro02_Pattern_T145588(){
		setTitle(" Pattern – T145588");
		setSize(500, 500);
		setLayout(null);
		
		add(panel2);
		panel2.setBounds(10, 10, 500, 500);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cPro02_Pattern_T145588 mainwindow = new  cPro02_Pattern_T145588();
		mainwindow.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainwindow.setVisible(true);
	}

}
