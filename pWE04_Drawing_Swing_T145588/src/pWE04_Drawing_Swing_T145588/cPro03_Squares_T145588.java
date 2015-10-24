/**
 * 
 */
package pWE04_Drawing_Swing_T145588;

import javax.swing.JFrame;


/**
 * @author HuynhThanh
 *
 */
public class cPro03_Squares_T145588 extends JFrame {
	
	cPro03_Squares_Panel panel1 = new cPro03_Squares_Panel();

	public  cPro03_Squares_T145588(){
		setTitle("10Squares – T145588");
		setSize(350, 350);
		setLayout(null);
		
		add(panel1);
		panel1.setBounds(10, 10, 300, 300);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cPro03_Squares_T145588 mainwindow = new  cPro03_Squares_T145588();
		mainwindow.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainwindow.setVisible(true);
	}

}
