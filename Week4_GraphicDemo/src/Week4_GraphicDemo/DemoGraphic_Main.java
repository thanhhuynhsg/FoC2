/**
 * 
 */
package Week4_GraphicDemo;

import javax.swing.JFrame;

/**
 * @author HuynhThanh
 *
 */
public class DemoGraphic_Main extends JFrame {

	DemoGraphic_Panel thu = new DemoGraphic_Panel();

	public DemoGraphic_Main() {
		setTitle("Graphic Demo");
		setSize(300, 500);
		setLayout(null);

		// add
		add(thu);
		thu.setBounds(10, 20, 400, 600);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoGraphic_Main mainwindow = new DemoGraphic_Main();
		mainwindow.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainwindow.setVisible(true);
	}

}
