package maro.main.rpgscenecomposer;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class RPGScene extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1887620987957415303L;
	private JPanel mapPanel;
	
	public RPGScene() {
		this.setOpaque(false);
		mapPanel = new JPanel(true);
		mapPanel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
		mapPanel.setPreferredSize(new Dimension(600, 400));
		
		this.add(mapPanel, BorderLayout.NORTH);
	}
}
