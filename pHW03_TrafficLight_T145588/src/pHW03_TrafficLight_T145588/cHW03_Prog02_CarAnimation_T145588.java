/**
 * 
 */
package pHW03_TrafficLight_T145588;

import javax.swing.JFrame;

/**
 * @author Thanh Huynh (T145588)
 *
 */
public class cHW03_Prog02_CarAnimation_T145588 extends JFrame {

	cHW03_Prog02_CarAnimation_T145588_Panel a = new cHW03_Prog02_CarAnimation_T145588_Panel();
	
	
	public static void main(String[] args) {
		cHW03_Prog02_CarAnimation_T145588 wMain = new cHW03_Prog02_CarAnimation_T145588();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);
		
	}
	public cHW03_Prog02_CarAnimation_T145588(){
		setTitle("CarAnimation - T145588");
		setSize(1000,150);
		setLayout(null);
		add(a);
		a.setBounds(0,0,1000,500);
	}
}
