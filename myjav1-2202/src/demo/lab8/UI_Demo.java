package demo.lab8;

import java.awt.HeadlessException;

import javax.swing.JFrame;

public class UI_Demo extends JFrame {

	private String title;

	public UI_Demo(String title) throws HeadlessException {
		super();
		this.title = title;
		this.setSize(200, 300);
	}
	
	public void show()
	{
		super.setVisible(true);
	}
}
