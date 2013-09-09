package maro.main.rpgscenecomposer;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;

import maro.main.rpgscenecomposer.actions.ActionNew;
import maro.main.rpgscenecomposer.components.ButtonTab;

public class RPGSceneComposer extends JFrame {


	/**
	 * 
	 */
	private static final long serialVersionUID = 4413662672602334850L;
	
	private JTabbedPane tabPane;
	private JFileChooser chooser;
	
	public static void main(String[] args) {
		RPGSceneComposer composer = new RPGSceneComposer("RPG - Scene Composer");

	}
	
	public RPGSceneComposer(String title) {
		super (title);
		chooser = new JFileChooser();
		this.setMinimumSize(new Dimension(800, 600));;
		
		tabPane = new JTabbedPane(JTabbedPane.TOP);
		this.getContentPane().add(tabPane);
		
		JMenuBar mb = new JMenuBar();
		JMenu menuFile = new JMenu("Datei");
		menuFile.add(new JMenuItem(new ActionNew("Neu", this)));
		menuFile.add(new JMenuItem(new AbstractAction("Exit") {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		}));
		mb.add(menuFile);
		this.setJMenuBar(mb);
		this.setVisible(true);
	}

	public void addNewSceneTab() {
		chooser.showOpenDialog(this);
//		chooser.
//		this.tabPane.get
		this.tabPane.addTab("Example", new RPGScene());
		this.tabPane.setTabComponentAt(0, new ButtonTab(tabPane));
	}

}
