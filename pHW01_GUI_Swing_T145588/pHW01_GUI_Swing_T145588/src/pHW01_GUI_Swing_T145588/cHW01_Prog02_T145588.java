/**
 * 
 */
package pHW01_GUI_Swing_T145588;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
/**
 * @author Thanh Huynh (T145588)
 *
 */
public class cHW01_Prog02_T145588 extends JFrame {
	JLabel name = new JLabel ("Name"),
			email = new JLabel ("Email"),
			remail = new JLabel ("Re-email");
	JTextField txt1 = new JTextField(),
			txt2 = new JTextField(),
			txt3 = new JTextField();
	JButton sub = new JButton("Register");
	JCheckBox check1 = new JCheckBox ("Daily"),
			check2 = new JCheckBox ("Mothly"),
			check3 = new JCheckBox ("Weekly");
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new window
		cHW01_Prog02_T145588 vmain = new cHW01_Prog02_T145588();
		// end program as closing window.
		vmain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// show the window
		vmain.setVisible(true);
				
	}
	public cHW01_Prog02_T145588(){
		//set title, size, layout
		setTitle("T145588 - VLU News Letter");
		setSize(280, 250);
		setLayout(null);
		//add
		add(name);
		add(email);
		add(remail);
		add(txt1);
		add(txt2);
		add(txt3);
		add(sub);
		add(check1);
		add(check2);
		add(check3);
		//set label
		name.setBounds(10, 20, 100, 25);
		txt1.setBounds(80, 20, 150, 25);
		email.setBounds(10, 50, 100, 25);
		txt2.setBounds(80, 50, 150, 25);
		remail.setBounds(10, 80, 100, 25);
		txt3.setBounds(80, 80, 150, 25);
		sub.setBounds(10, 160, 220, 25);
		check1.setBounds(10, 120, 70, 25);
		check2.setBounds(80, 120, 70, 25);
		check3.setBounds(150, 120, 70, 25);
	}
}
