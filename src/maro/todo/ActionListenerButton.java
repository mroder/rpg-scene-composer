package maro.todo;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import lombok.Setter;


public class ActionListenerButton extends JButton {

	@Setter
	private ActionListener actionListener;
	
	public void init() {
		this.addActionListener(actionListener);
	}

}
