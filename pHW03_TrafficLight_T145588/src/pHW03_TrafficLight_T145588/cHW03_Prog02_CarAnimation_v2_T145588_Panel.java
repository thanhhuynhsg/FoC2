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

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * @author HuynhThanh
 *
 */
public class cHW03_Prog02_CarAnimation_v2_T145588_Panel extends JPanel {
		// khai bao bien boolean
		boolean flightdoc = false, flightngang = true;
		String sTmp, sTmp1; // chuoi
		// khai bao anh
		BufferedImage buffImage = null, 
				buffImage1 = null, 
				buffImage2 = null,
				buffImagexedoc = null, 
				buffImagexengang = null;

		int i = 4, demxedoc = 0, demxengang = 0;
		
		Timer cTimer = null, cTimerxe = null; // Khai bao Timer
		
		String[] imgs = { "./IMG/shingo2.png", 
				"./IMG/shingo1.png",
				"./imgs/shingo2.png", 
				"./imgs/shingo3.png" };
		String[] imgs2 = { "./IMG/shingo2ls.png", 
				"./IMG/shingo3ls.png",
				"./IMG/shingo2ls.png", 
				"./IMG/shingo1ls.png" }; //Lay anh

		public cHW03_Prog02_CarAnimation_v2_T145588_Panel() {
			
			try {
				buffImage2 = ImageIO.read(new File("./IMG/ngatu.jpg"));
				buffImage1 = ImageIO.read(new File("./IMG/shingo3ls.png"));
				buffImage = ImageIO.read(new File("./IMG/shingo1.png"));
				// anh xe
				buffImagexedoc = ImageIO.read(new File("./IMG/Car-08-down.gif"));
				buffImagexengang = ImageIO.read(new File("./IMG/Car-08.gif"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// Khai bao ctimer de den chay
			cTimer = new Timer(3000, new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					i--;
					// den doc
					try {
						buffImage = ImageIO.read(new File(imgs[i]));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					// den ngang
					try {
						buffImage1 = ImageIO.read(new File(imgs2[i]));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if (i == 1) {
						flightdoc = false;
					} else {
						flightdoc = true;
					}
					if (i == 3) {
						flightngang = false;
					} else {
						flightngang = true;
					}
					// light doc hoat dong khi i=0 thay vi chuyen
					// sang den vang thi light se chuyen sang mau xANH
					if (i == 0) {
						try {
							buffImage = ImageIO.read(new File(imgs[1]));
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					// light ngang hoat dong khi i=2 thay vi chuyen
					// sang den vang thi light se chuyen sang mau xanh
					if (i == 2) {
						try {
							buffImage1 = ImageIO.read(new File(imgs2[3]));
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					if (i == 0) {
						i = 4;
					}
					repaint();
				}
			});
			// timer cho hai xe chay duoc
			cTimerxe = new Timer(50, new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub

					if (demxedoc > 550) {
						demxedoc = -100;
					}
					// neu dung thi xe se chay binh thuong
					// neu sai thi neu bien dem chua bang 100 thi bien dem se cong
					// de duoc 100
					if (flightdoc == true) {
						demxedoc = demxedoc + 10;
					} else {
						if (demxedoc == 100) {

						} else {
							demxedoc = demxedoc + 10;
						}

					}
					repaint();
					if (demxengang > 550) {
						demxengang = -100;
					}
					// neu dung thi xe se chay binh thuong
					// neu sai thi neu bien dem chua bang 100 thi bien dem se cong
					if (flightngang == true) {
						demxengang = demxengang + 10;
					} else {
						if (demxengang == 100) {

						} else {
							demxengang = demxengang + 10;
						}

					}
				}
			});

			cTimerxe.start();
			cTimer.start();
		}

		// ham paint
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(buffImage2, 0, 0, 550, 550, this);
			g.drawImage(buffImage, 130, 85, 38, 100, this);
			g.drawImage(buffImage, 390, 385, 38, 100, this);
			g.drawImage(buffImage1, 390, 125, 100, 38, this);
			g.drawImage(buffImage1, 80, 385, 100, 38, this);
			g.drawImage(buffImagexedoc, 200, demxedoc, this);
			g.drawImage(buffImagexengang, demxengang, 200, this);
		}
	}
