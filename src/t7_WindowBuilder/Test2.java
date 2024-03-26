package t7_WindowBuilder;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class Test2 extends JFrame {

	public Test2() {
		super("회원가입");
		setSize(600, 480);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 102, 584, 142);
		panel_1.add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(28, 10, 441, 75);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("회원가입");
		lblNewLabel.setBounds(26, 27, 240, 26);
		panel_2.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(74, 300, 395, 87);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new Test2();
	}
}
