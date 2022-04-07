package dam.jkutkut.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dam.jkutkut.view.View;

public class Controller implements ActionListener {
private View window;
	
	public Controller(View window) {
		this.window = window;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
//		if (e.getSource() == window.get())
//			handle();
	}
}
