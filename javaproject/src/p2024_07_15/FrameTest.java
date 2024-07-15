package p2024_07_15;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTest {

	private Frame f;
	
	public FrameTest(){
		f = new Frame("Frame Test");
		
		f.setSize(400, 500);
		f.setLocation(100, 200);
		f.setResizable(true);
		f.setBackground(Color.CYAN);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(1);
			}
		});
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameTest ft = new FrameTest();
	}

}
