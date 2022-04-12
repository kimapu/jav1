package demo.lab8;

import javax.swing.JFrame;

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
    	window1.setSize(300, 200);
    	window1.setVisible(true);
    }
    
    static void window2()
    {
    	UI_Demo window1 = new UI_Demo("Sample window");
    	window1.show();
    }
}

