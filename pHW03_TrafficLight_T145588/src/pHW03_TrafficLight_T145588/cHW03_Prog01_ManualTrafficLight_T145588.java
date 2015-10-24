/**
 * 
 */
package pHW03_TrafficLight_T145588;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author Thanh Huynh (T145588)
 *
 */
public class cHW03_Prog01_ManualTrafficLight_T145588 extends JFrame {
	JButton btn1 = new JButton("RED"), 
			btn2 = new JButton("YELLOW"),
			btn3 = new JButton("GREEN"); //JButton
	ImageIcon icon1 = new ImageIcon("IMG/Untitled.png"), 
			icon2 = new ImageIcon("IMG/Untitled2.png"), 
			icon3 = new ImageIcon("IMG/Untitled1.png");//Image
	JLabel lbl1 = new JLabel(icon1), 
			lbl2 = new JLabel(icon2),
			lbl3 = new JLabel(icon3); //JLabel
	int i = 0, t = 0; //Khai bao

	public static void main(String[] args) {
		cHW03_Prog01_ManualTrafficLight_T145588 wMain = new cHW03_Prog01_ManualTrafficLight_T145588();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);
	}

	public cHW03_Prog01_ManualTrafficLight_T145588() {
		//set
		setTitle("Traffic Light - T145588");
		setSize(250, 350);
		setLayout(null);
		
		//add
		add(btn1);
	    add(btn2);
		add(btn3);
		add(lbl1);
		add(lbl2);
		add(lbl3);

		//set location
		btn1.setMargin(new Insets(1, 1, 1, 1));
		btn2.setMargin(new Insets(1, 1, 1, 1));
		btn3.setMargin(new Insets(1, 1, 1, 1));
		btn1.setBounds(10, 10, 60, 30);
		btn2.setBounds(75, 10, 60, 30);
		btn3.setBounds(140, 10, 60, 30);
		
		
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method s
				lbl1.setBounds(10, 10, 200, 300);
				lbl2.setBounds(0, 00, 00, 00);
				lbl3.setBounds(0, 00,00, 00);
			}
		});
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lbl2.setBounds(10, 10, 200, 300);
				lbl1.setBounds(0, 00, 00, 00);
				lbl3.setBounds(0, 00, 00, 00);
			}
		});
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lbl3.setBounds(10, 10, 200, 300);
				lbl1.setBounds(0, 00, 00, 00);
				lbl2.setBounds(0, 00, 00, 00);
			}
		});

	}

}
