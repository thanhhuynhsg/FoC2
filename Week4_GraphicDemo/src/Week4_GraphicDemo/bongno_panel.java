package Week4_GraphicDemo;

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
 * 
 */

/**
 * @author 
 *
 */
public class bongno_panel extends JPanel {
	Timer time1 = null;
	int x=0;
	int nPic = 16;
	BufferedImage imgs[] = new BufferedImage[nPic];
	 int tCount = 1;
	 private Timer tControl;
	 String[] aFileNames = {

		        "pics13/Frame0.png",
		        "pics13/Frame1.png",
		        "pics13/Frame2.png",
		        "pics13/Frame3.png",
		        "pics13/Frame4.png",
		        "pics13/Frame5.png",
		        "pics13/Frame6.png",
		        "pics13/Frame7.png",
		        "pics13/Frame8.png",
		        "pics13/Frame9.png",
		        "pics13/Frame10.png",
		        "pics13/Frame11.png",
		        "pics13/Frame12.png",
		        "pics13/Frame13.png",
		        "pics13/Frame14.png",
		        "pics13/Frame15.png",		        		      
		    };
	 public void start(){
		 if(time1.isRunning()==false){
		 time1.start();
	 }}
	 public void stop(){
		 if(time1.isRunning()){
		 time1.stop();
	 }}
		public bongno_panel(){				    							   				    
				        try {
				            for (int i = 0; i < nPic; i++) {

				                imgs[i] = ImageIO.read(new File(aFileNames[i]));

				            }
				        } catch (IOException ex) {
				            Logger.getLogger(bongno_panel.class.getName()).log(Level.SEVERE, null, ex);
				        }
			time1 = new Timer(50, new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					x++;
					repaint();
					if(x>=16){
						x=0;
					}
				}
				
			});
			
			time1.start();
		}
		public void paint(Graphics g){
			super.paint(g);
			g.drawImage(imgs[x], 10, 10,this);
		}
		
}
