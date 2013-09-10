package maro.main.rpgscenecomposer;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.xml.ws.soap.Addressing;

@A
public class RPGScene extends JPanel implements PropertyChangeListener {

	
	private boolean saved = true;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1887620987957415303L;
	private JPanel mapPanel;
	
	public RPGScene() {
		this.setOpaque(false);
		this.addPropertyChangeListener(this);
		mapPanel = new JPanel(true);
		mapPanel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
		mapPanel.setPreferredSize(new Dimension(600, 400));
		
		JPanel leftMenu = new JPanel();
		
//		leftMenu
		this.add(leftMenu,BorderLayout.WEST); 
		this.add(mapPanel, BorderLayout.NORTH);
	}

	@Override
	public void propertyChange(PropertyChangeEvent arg0) {
		this.saved = false;
		System.out.println(this.getParent());
		
	}
}
