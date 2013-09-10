package maro.todo;

import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JTable;

import lombok.EqualsAndHashCode;
import lombok.Setter;

@EqualsAndHashCode
public abstract class ListTableActionListener implements ActionListener {

	@Setter
	protected JTable table;
	@Setter
	protected List list;

}
