package maro.main.rpgscenecomposer;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

import lombok.EqualsAndHashCode;
import maro.main.rpgscenecomposer.actions.ActionNew;
import maro.main.rpgscenecomposer.components.ButtonTab;

@EqualsAndHashCode
public class RPGSceneComposer extends JFrame {


	
	private JTabbedPane tabPane;
	private JFileChooser chooser;
	
	public static void main(String[] args) {
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		    	System.out.println(info.getName());
		    }
		} catch (Exception e) {
		    // If Nimbus is not available, you can set the GUI to another look and feel.
		}

		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
//			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RPGSceneComposer composer = new RPGSceneComposer("RPG - Scene Composer");

	}
	
	public RPGSceneComposer(String title) {
		super (title);
		chooser = new JFileChooser();
		this.setMinimumSize(new Dimension(800, 600));;
		
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
