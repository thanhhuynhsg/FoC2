/**
 * 
 */
package pHW03_TrafficLight_T145588;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;
/**
 * @author HuynhThanh
 *
 */
public class cHW03_Prog02_CarAnimation_T145588_Panel extends JPanel {
	 Timer Cou = null;
	 int k = 10, y = 10;
	
	BufferedImage Img[] = new BufferedImage[1];
	String[] a = { "IMG/Car-08.gif"};//Chuoi

	public cHW03_Prog02_CarAnimation_T145588_Panel() {

		try {
			Img[0] = ImageIO.read(new File(a[0]));

		} catch (IOException e) {
			Logger.getLogger(
					cHW03_Prog02_CarAnimation_T145588_Panel.class.getName())
					.log(Level.SEVERE, null, e);
		}
		//Timer
		Cou = new Timer(200, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				repaint();
				k=k+20;
				if(k>=1000){
					k=10;
				}
			}
		});
		Cou.start();
	}
	//Ve hinh
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(Img[0], k, y, this);
	}
}
