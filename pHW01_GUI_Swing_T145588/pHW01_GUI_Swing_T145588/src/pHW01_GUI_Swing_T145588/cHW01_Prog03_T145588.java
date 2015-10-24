/**
 * 
 */
package pHW01_GUI_Swing_T145588;

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
public class cHW01_Prog03_T145588 extends JFrame {
	JLabel title = new JLabel ("Your Contact Information"),
			email = new JLabel ("Email"),
			address = new JLabel ("Address"),
			phone = new JLabel ("Phone"),
			name = new JLabel ("Name");
	JTextField txt1 = new JTextField(),
			txt2 = new JTextField(),
			txt3 = new JTextField(),
			txt4 = new JTextField();
	JButton sub = new JButton("Submit"),
			cal = new JButton("Cancel");
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new window
		cHW01_Prog03_T145588 vmain = new cHW01_Prog03_T145588();
		// end program as closing window.
		vmain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// show the window
		vmain.setVisible(true);
	}
	public cHW01_Prog03_T145588(){
		//set title, size, layout
		setTitle("T145588 - Contact Information");
		setSize(300, 250);
		setLayout(null);
		//add
		add(name);
		add(email);
		add(address);
		add(phone);
		add(title);
		add(sub);
		add(cal);
		add(txt1);
		add(txt2);
		add(txt3);
		add(txt4);
		//set location
		title.setBounds(10, 10, 200, 25);
		name.setBounds(10, 40, 50, 25);
		txt1.setBounds(80, 40, 200, 25);
		email.setBounds(10, 70, 50, 25);
		txt2.setBounds(80, 70, 200, 25);
		address.setBounds(10, 100, 50, 25);
		txt3.setBounds(80, 100, 200, 25);
		phone.setBounds(10, 130, 50, 25);
		txt4.setBounds(80, 130, 200, 25);
		sub.setBounds(80, 160, 80, 25);
		cal.setBounds(180, 160, 80, 25);
	}
}
