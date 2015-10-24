/**
 * 
 */
package pHW01_GUI_Swing_T145588;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;

/**
 * @author Thanh Huynh (T145588) 
 *
 */
public class cHW01_Prog05_T145588 extends JFrame {
	JLabel inp = new JLabel ("Input");
	JTextField txt = new JTextField();
	JTextArea txt1 = new JTextArea();
	JButton check = new JButton("Check"),
			clear = new JButton("Clear");
	JOptionPane pan = new JOptionPane();

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new window
		cHW01_Prog05_T145588 vmain = new cHW01_Prog05_T145588();
		// end program as closing window.
		vmain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// show the window
		vmain.setVisible(true);
	}
	public cHW01_Prog05_T145588 (){
		//set title, size, layout
		setTitle("Check Number - T145588");
		setSize(350, 250);
		setLayout(null);
		//add
		add(inp);
		add(txt1);
		add(txt);
		add(check);
		add(clear);
		add(pan);
		//set location
		inp.setBounds(10, 20, 50, 25);
		txt.setBounds(50, 20, 250, 25);
		check.setBounds(50, 60, 80, 25);
		clear.setBounds(160, 60, 80, 25);
		txt1.setBounds(50, 100, 250, 90);
		
		ActionListener checkclear = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String num = txt.getText();
				//Goi nut check
				if(arg0.getSource() == check) {
					int nun = 0;
					try { 
						nun = Integer.parseInt(num);
						if (nun>0) {
							Component frame = null;
							JOptionPane.showMessageDialog(frame,
								    "is positive integer",
								    "Massage",
								    JOptionPane.PLAIN_MESSAGE);
							txt1.append("is positive integer");
						}
						else{
							txt1.append("is not number");
							Component frame = null;
							JOptionPane.showMessageDialog(frame,
								    "is not number",
								    "Massage",
								    JOptionPane.PLAIN_MESSAGE);
						}
					} 
					catch (NumberFormatException e) {					
							txt1.append("Invalid input");
							Component frame = null;
							JOptionPane.showMessageDialog(frame,
								    "Invalid input",
								    "Massage",
								    JOptionPane.PLAIN_MESSAGE);
							}	
						}
				//Goi nut clear
				if(arg0.getSource() == clear) {
					txt.setText("");
					txt1.setText("");
				}
			}
		};
		check.addActionListener(checkclear);
		clear.addActionListener(checkclear);
	}
}
