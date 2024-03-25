package t6_Swing;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

// 스윙의 종료를 인터페이스를 이용.
@SuppressWarnings("serial")
public class Test3_adaptor extends JFrame {
	
	public Test3_adaptor() {
		super("스윙연습3");
		
		setBounds(300, 250, 300, 250);
		
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
			}
		});
	}
	
	public static void main(String[] args) {
		new Test3_adaptor();
	}


}
