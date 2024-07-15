package p2024_07_15;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTestEx extends Frame{

	public FrameTestEx() {
		super("Frame Test"); //부모 클래스의 생성자 호출
		
		setSize(400, 300);
		setLocation(100, 300);
		setBackground(Color.GRAY);
		setVisible(true);
		setResizable(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameTestEx ft = new FrameTestEx();
	}

}
