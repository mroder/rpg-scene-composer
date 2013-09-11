package maro.main.rpgscenecomposer;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;

import lombok.EqualsAndHashCode;
import lombok.Setter;
import maro.main.rpgscenecomposer.actions.ActionNew;
import maro.main.rpgscenecomposer.components.ButtonTab;

@EqualsAndHashCode
public class RPGSceneComposer extends JFrame {

	@Setter
	private JTabbedPane tabPane;
	private JFileChooser chooser;
	
	public RPGSceneComposer() {
		chooser = new JFileChooser();
		
		ImageIcon img = new ImageIcon(Toolkit.getDefaultToolkit().getImage(
				ClassLoader.getSystemResource("resources/img/logo.png")));
		this.setIconImage(img.getImage());
		
		AbstractAction actionNew = new ActionNew("Neu", this);
		AbstractAction actionLoad = new AbstractAction("Öffnen...") {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Test");
				
			}
		};
		
		JToolBar toolbar = new JToolBar();
		this.add(toolbar,BorderLayout.NORTH);
		toolbar.add(new JButton(actionNew));
		toolbar.add(new JButton(actionLoad));
		
		tabPane = new JTabbedPane(JTabbedPane.TOP);
		tabPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

		this.getContentPane().add(tabPane);
		
		JMenuBar mb = new JMenuBar();
		JMenu menuFile = new JMenu("Datei");
		menuFile.add(new JMenuItem(actionNew));
		menuFile.add(new JMenuItem(actionLoad));
		menuFile.add(new JMenuItem(new AbstractAction("Exit") {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		}));
		mb.add(menuFile);
		this.setJMenuBar(mb);
	}
	
	public void init() {
		pack();
		this.setVisible(true);
	}

	public void addNewSceneTab() {
//		chooser.showOpenDialog(this);

		int tabCount = tabPane.getTabCount();
		this.tabPane.addTab("Example", new RPGScene());
		tabPane.setSelectedIndex(tabCount);
		for (int i = 0; i < tabPane.getTabCount(); i++) {
			this.tabPane.setTabComponentAt(i, new ButtonTab(tabPane));
//			tabPane.getSelectedComponent().set
		}
	}

}
