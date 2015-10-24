package Week4_GraphicDemo;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 
 */

/**
 * @author 
 *
 */
public class bongno_main extends JFrame {
	bongno_panel a = new bongno_panel();
	JButton stop = new JButton("Stop"),
			start = new JButton("Start");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bongno_main wMain = new bongno_main();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);
	}
	public bongno_main(){
		setTitle("Bong No");
		setSize(500,300);
		setLayout(null);
		add(a);
		a.setBounds(10,10,200,500);
		Insets insButton = new Insets(1, 1, 1, 1);
		add(start);
		start.setMargin(insButton);
		add(stop);
		stop.setMargin(insButton);
		//start.setBounds(250,50,40,30);
		stop.setBounds(250,90,40,30);
		stop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(stop.getText().equals("Stop")){
					a.stop();
					stop.setText("Start");
				}else{
					a.start();
					stop.setText("Stop");
				}
			}
		});
		
	}
}
