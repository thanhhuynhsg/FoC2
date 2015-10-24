/**
 * 
 */
package pWE05_Control_T145588;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author HuynhThanh
 *
 */
public class cPro02_SNT_T145588 extends JFrame {
	JLabel in = new JLabel("Input"),
			ou = new JLabel("Output");
	JTextField inp = new JTextField("");
	JTextArea out = new JTextArea();
	JButton bnt1 = new JButton("Calculate"),
			bnt2 = new JButton("Clear"),
			bnt3 = new JButton("Clear All");
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new window
		cPro02_SNT_T145588 vmain = new cPro02_SNT_T145588();
		// end program as closing window.
		vmain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// show the window
		vmain.setVisible(true);
	}

	public cPro02_SNT_T145588(){
		// set window title
		setTitle("SNT- T145588");
		// set size
		setSize(330, 250);
		// reset null layout
		setLayout(null);
		// add component to windows
		add(in);
		add(ou);
		add(inp);
		add(out);
		add(bnt1);
		add(bnt2);
		add(bnt3);
		//set location
		in.setBounds(10, 20, 50, 25);
		inp.setBounds(80, 20, 220, 25);
		bnt1.setBounds(140, 50, 100, 25);
		bnt2.setBounds(80, 80, 100, 25);
		bnt3.setBounds(190, 80, 100, 25);
		ou.setBounds(10, 120, 50, 25);
		out.setBounds(80, 120, 220, 75);
		
		
		bnt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String iNum = inp.getText();
				int num = 0, num1=0, num2=0;
				try {
					num = Integer.parseInt(iNum);
					num1= num+1;
					num2= num+2;
					
					if (num % 1 == 0 && num % num == 0 ){
						out.append("N la SNT");
					}
						else{
							out.append("N khong la SNT");
						}
					System.out.println("");
					if (num1 % 1 == 0 && num1 % num1 == 0){
						out.append("N+1 la SNT");
					}
						else{
							out.append("N+1 khong la SNT");
						}
					System.out.println("");
					if (num2 % 1 == 0 && num2 % num2 == 0 ){
						out.append("N+2 khong la SNT");
					}else{
						out.append("N+2 la SNT");
					}
					
				} catch (NumberFormatException e1) {
					out.setText("Invalid Input");
				}
				
			}
		});
		
		bnt2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				inp.setText("");
			}
		});
		
		bnt3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				out.setText("");
				inp.setText("");
			}
		});
		
		
	}
}
