package demo.lab8;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Demo {

	public static void show() {

    	window1();
    	
    	System.out.println("\nDone...");
		System.out.println("====================================");
    }
   
    static void window1()
    {
    	JFrame window1 = new JFrame();
    	window1.setTitle("Window 1");
    	window1.setSize(400, 200);
    	window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	window1.setLocationRelativeTo(null);
    	window1.setLayout(new FlowLayout());
    	
    	/**
    	 * Add input controls
    	 */
    	JTextField tf1 = new JTextField(10);
    	JTextField tf2 = new JTextField(10);
    	window1.add(tf1); window1.add(tf2);
    	JButton btEnter = new JButton("Enter");
    	window1.add(btEnter);
    	btEnter.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Entering...");
			}
    		
    	} );
    	
    	
    	
    	window1.setVisible(true);
    	
    }
    
    static void window2()
    {
    	UI_Demo window1 = new UI_Demo("Sample window");
    	window1.show();
    }
}

