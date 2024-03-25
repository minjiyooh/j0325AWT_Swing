package t6_Swing;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Test1 extends JFrame {

	public Test1() {
		super("스윙연습1");

		setBounds(300, 250, 300, 250);
		
		setVisible(true);

	}

	public static void main(String[] args) {
		new Test1();
	}
}
