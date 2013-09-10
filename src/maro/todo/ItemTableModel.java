package maro.todo;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import lombok.Data;

@Data
public class ItemTableModel extends AbstractTableModel {

	private List itemList;

	
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return true;
	}

	@Override
	public int getColumnCount() {
		return 1;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return itemList.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int colIndex) {
		// TODO Auto-generated method stub
		return itemList.get(rowIndex);
	}

	@Override
	public String getColumnName(int column) {
		return "Items";
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		itemList.set(rowIndex, aValue);
	}

}
