package dam.jkutkut.view;

import javax.swing.JFrame;

import dam.jkutkut.control.Controller;

public class View extends JFrame {
	
	private static final String TITLE = "";
	private static final int WIDTH = 500;
	private static final int HEIGHT = 500;
	
	public View() {
		init();
	}
	
	private void init() {
		setTitle(TITLE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		// TODO
		
		setSize(WIDTH, HEIGHT);
		setLocationRelativeTo(null);
	}
	
	public void showWindow() {
		setVisible(true);
	}
	
	public void setController(Controller controller) {
		// TODO
	}
}
