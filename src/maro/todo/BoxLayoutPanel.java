package maro.todo;

import java.awt.Component;
import java.util.Iterator;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@Data
public class BoxLayoutPanel extends JPanel {

	private List<Component> panelComponents;
	private int axis;
	
	public void init() {
		setLayout(new BoxLayout(this, axis));
		for (Iterator<Component> iter = panelComponents.iterator(); iter.hasNext();) {
			Component comp = (Component) iter.next();
			System.out.println(comp + " \ndone");
			add(comp);
		}
		System.out.println("done");
	}
}
