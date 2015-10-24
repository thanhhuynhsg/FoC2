/**
 * 
 */
package pHW03_TrafficLight_T145588;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;


/**
 * @author Thanh Huynh (T145588)
 *
 */
public class cHW03_Prog01_TrafficLight_T145588 extends JFrame {
	
	cHW03_Prog01_TrafficLight_T145588_Panel a = new cHW03_Prog01_TrafficLight_T145588_Panel();
	
	//Khai bao
	private int i = 0, x = 1000;
	private int t = 0, c = 0;
	private int timeR = 1, timeG = 1, timeY = 1;

	public static void main(String[] args) {
		cHW03_Prog01_TrafficLight_T145588 wMain = new cHW03_Prog01_TrafficLight_T145588();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);
	}

	public cHW03_Prog01_TrafficLight_T145588() {
		setTitle("Traffic Light - T145588");
		setSize(1000, 1000);
		setLayout(null);
		
		//add
		add(a);

		a.setBounds(0, 0, 1000, 1000); //set location
		
		Timer L = null; //Timer
		L = new Timer(x, new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				i = i + x;
				if (c == 0) {
					if (i <= timeR * x) {
						a.red();
					} else {
						i = 0;
						c = 1;
					}
				}
				if (c == 2) {
					if (i <= timeY * 1000) {
						a.yellow();
					} else {
						i = 0;
						c = 0;
					}
				}
				if (c == 1) {
					if (i <= timeG * 1000) {
						a.green();
					} else {
						i = 0;
						c = 2;
					}
				}
				
			}
		});
		L.start();
	}
}
