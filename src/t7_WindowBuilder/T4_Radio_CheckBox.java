package t7_WindowBuilder;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

@SuppressWarnings("serial")
public class T4_Radio_CheckBox extends JFrame {
	JRadioButton rdMale, rdFemale;
	JCheckBox ckHobby1, ckHobby2, ckHobby3, ckHobby4;
	JButton btnGender, btnHobby, btnExit;
	JLabel lblMessage;
	private final ButtonGroup btnGroupGender = new ButtonGroup();

	public T4_Radio_CheckBox() {
		super("라디오/체크박스 연습");
		setSize(600, 400);
		
		getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBackground(Color.PINK);
		pn1.setBounds(0, 0, 584, 56);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("라디오버튼/체크박스 연습");
		lblNewLabel.setBackground(Color.PINK);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 584, 56);
		pn1.add(lblNewLabel);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(0, 56, 584, 249);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("성 별");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(59, 33, 114, 33);
		pn2.add(lblNewLabel_1);
		
		rdMale = new JRadioButton("남 자");
		btnGroupGender.add(rdMale);
		rdMale.setFont(new Font("굴림", Font.PLAIN, 16));
		rdMale.setBounds(201, 33, 91, 33);
		pn2.add(rdMale);
		
		rdFemale = new JRadioButton("여 자");
		btnGroupGender.add(rdFemale);
		rdFemale.setFont(new Font("굴림", Font.PLAIN, 16));
		rdFemale.setBounds(322, 33, 91, 33);
		pn2.add(rdFemale);
		
		JLabel lblNewLabel_1_1 = new JLabel("취  미");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(59, 90, 114, 33);
		pn2.add(lblNewLabel_1_1);
		
		ckHobby1 = new JCheckBox("등산");
		ckHobby1.setFont(new Font("굴림", Font.PLAIN, 16));
		ckHobby1.setBounds(166, 95, 70, 23);
		pn2.add(ckHobby1);
		
		ckHobby2 = new JCheckBox("낚시");
		ckHobby2.setFont(new Font("굴림", Font.PLAIN, 16));
		ckHobby2.setBounds(264, 95, 70, 23);
		pn2.add(ckHobby2);
		
		ckHobby3 = new JCheckBox("수 영");
		ckHobby3.setFont(new Font("굴림", Font.PLAIN, 16));
		ckHobby3.setBounds(355, 96, 70, 23);
		pn2.add(ckHobby3);
		
		ckHobby4 = new JCheckBox("바 둑");
		ckHobby4.setFont(new Font("굴림", Font.PLAIN, 16));
		ckHobby4.setBounds(457, 96, 70, 23);
		pn2.add(ckHobby4);
		
		lblMessage = new JLabel("메세지출력");
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setFont(new Font("굴림", Font.PLAIN, 16));
		lblMessage.setBounds(81, 167, 439, 47);
		pn2.add(lblMessage);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(0, 305, 584, 56);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		btnGender = new JButton("성별출력");
		btnGender.setFont(new Font("굴림", Font.PLAIN, 16));
		btnGender.setBounds(72, 10, 98, 36);
		pn3.add(btnGender);
		
		btnExit = new JButton("종  료");
		btnExit.setFont(new Font("굴림", Font.PLAIN, 16));
		btnExit.setBounds(412, 10, 98, 36);
		pn3.add(btnExit);
		
		btnHobby = new JButton("취미출력");
		btnHobby.setFont(new Font("굴림", Font.PLAIN, 16));
		btnHobby.setBounds(242, 10, 98, 36);
		pn3.add(btnHobby);
		
	// --------------------- 위쪽은 UI ----------------------------------------
		setLocationRelativeTo(null);	// 윈도우창을 가운데 정렬
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 윈도우 종료버튼 활성화
		setVisible(true);
	// --------------------- 아래쪽은 메소드 ----------------------------------------
		
		// 성별출력버튼
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gender = "선택하신 성별은 : ";
				if(rdMale.isSelected()) gender += rdMale.getText();
				else gender += rdFemale.getText();
				
				lblMessage.setText(gender);
			}
		});
		
		// 취미출력버튼
		btnHobby.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hobby = "";
				if(ckHobby1.isSelected()) hobby += ckHobby1.getText() + "/";
				if(ckHobby2.isSelected()) hobby += ckHobby2.getText() + "/";
				if(ckHobby3.isSelected()) hobby += ckHobby3.getText() + "/";
				if(ckHobby4.isSelected()) hobby += ckHobby4.getText() + "/";
				
				hobby = hobby.substring(0, hobby.length()-1);
				
				lblMessage.setText("선택하신 취미는 ? " + hobby);
				JOptionPane.showMessageDialog(null, "선택된 취미는 " + hobby);
			}
		});
		
		// 종료버튼
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new T4_Radio_CheckBox();
	}
}
