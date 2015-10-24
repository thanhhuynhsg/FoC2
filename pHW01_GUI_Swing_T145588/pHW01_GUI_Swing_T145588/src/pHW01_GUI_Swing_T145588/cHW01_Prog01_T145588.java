/**
 * 
 */
package pHW01_GUI_Swing_T145588;
import java.awt.BorderLayout;
import java.awt.Checkbox;
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
public class cHW01_Prog01_T145588 extends JFrame {
	JLabel user = new JLabel ("Username"),
			pass = new JLabel ("Password");
	JTextField txt1 = new JTextField(),
			txt2 = new JTextField();
	JButton sub = new JButton("Submit");
	JCheckBox checkbox = new JCheckBox ("Remember");
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new window
		cHW01_Prog01_T145588 vmain = new cHW01_Prog01_T145588();
		// end program as closing window.
		vmain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// show the window
		vmain.setVisible(true);
		
		
		
	}
	public cHW01_Prog01_T145588(){
		//set title, size, layout
		setTitle("T145588 - Login Form");
		setSize(290, 300);
		setLayout(null);
		//add
		add(user);
		add(pass);
		add(txt1);
		add(txt2);
		add(sub);
		add(checkbox);
		//set label
		user.setBounds(30, 20, 100, 25);
		txt1.setBounds(30, 50, 180, 25);
		pass.setBounds(30, 80, 180, 25);
		txt2.setBounds(30, 110, 180, 25);
		sub.setBounds(30, 180, 100, 25);
		checkbox.setBounds(30, 150, 100, 25);
	}
}
