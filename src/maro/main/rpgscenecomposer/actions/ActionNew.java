package maro.main.rpgscenecomposer.actions;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFileChooser;

import maro.main.rpgscenecomposer.RPGSceneComposer;

public class ActionNew extends AbstractAction {

	private RPGSceneComposer composer;
	
	public ActionNew(String title, RPGSceneComposer comp) {
		super(title);
		this.composer = comp;
		
		putValue(NAME, "Neu");
		putValue(SHORT_DESCRIPTION, "Neu...");
		putValue(DEFAULT, "Neu...");
		putValue(LONG_DESCRIPTION, "Neue Szene");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.composer.addNewSceneTab();
	}
	
}
