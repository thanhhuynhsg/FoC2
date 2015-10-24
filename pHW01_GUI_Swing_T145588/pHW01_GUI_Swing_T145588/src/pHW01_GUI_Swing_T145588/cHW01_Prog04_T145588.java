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
public class cHW01_Prog04_T145588 extends JFrame {
	JLabel sec = new JLabel ("Select your workspace"),
			wor = new JLabel ("Working Space");
	JTextField txt = new JTextField();
	JButton bro = new JButton("Browse"),
			ok = new JButton("Ok"), 
			cal = new JButton("Cancel");
	JCheckBox use = new JCheckBox("Use this as default and do not ask again");
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new window
		cHW01_Prog04_T145588 vmain = new cHW01_Prog04_T145588();
		// end program as closing window.
		vmain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// show the window
		vmain.setVisible(true);
	}
	public cHW01_Prog04_T145588(){
		//set title, size, layout
		setTitle("T145588 - VLU eclipse");
		setSize(510, 230);
		setLayout(null);
		//add
		add(sec);
		add(wor);
		add(bro);
		add(ok);
		add(cal);
		add(txt);
		add(use);
		//location
		sec.setBounds(10, 20, 200, 25);
		wor.setBounds(10, 50, 100, 25);
		txt.setBounds(120, 50, 250, 25);
		bro.setBounds(380, 50, 100, 25);
		ok.setBounds(200, 130, 100, 25);
		cal.setBounds(330, 130, 100, 25);
		use.setBounds(10, 90, 250, 25);
	}
}
