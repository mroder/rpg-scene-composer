package maro.todo;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MainFrame extends JFrame {
	
	public void init() {
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setSize(new Dimension(800, 600));
		setVisible(true);
		setState(JFrame.NORMAL);
//		show();
	}

}
