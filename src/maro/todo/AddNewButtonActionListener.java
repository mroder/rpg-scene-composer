package maro.todo;

import java.awt.event.ActionEvent;

public class AddNewButtonActionListener extends ListTableActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		list.add("New Item");
		table.revalidate();
	}

}
