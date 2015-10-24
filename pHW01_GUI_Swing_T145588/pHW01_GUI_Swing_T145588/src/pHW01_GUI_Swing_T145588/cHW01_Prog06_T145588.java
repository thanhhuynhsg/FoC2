/**
 * 
 */
package pHW01_GUI_Swing_T145588;

import java.util.Scanner;

import javax.swing.JFrame;

/**
 * @author Thanh Huynh (T145588)
 *
 */
public class cHW01_Prog06_T145588 extends JFrame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.print("nhap n = ");
		int n = reader.nextInt();
		
		if (n <= 00) {
			System.out.print("Invalid Input");
		} else {
			cHW01_Prog06B_T145588.printToConsole(n);
		}
	}

}
