package t6_Swing;

import javax.swing.JFrame;

// 스윙의 종료를 인터페이스를 이용.
@SuppressWarnings("serial")
public class Test4_windowClose extends JFrame {

	public Test4_windowClose() {
		super("스윙연습4");

		setBounds(300, 250, 300, 250);

		setVisible(true);

		// 윈도우 창 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Test4_windowClose();
	}

}
