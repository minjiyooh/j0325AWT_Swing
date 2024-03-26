package t7_WindowBuilder;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class T1_Basic extends JFrame {
	private JTextField txtName, txtKor, txtEng, txtMat;
	private JButton btnInput, btnReset, btnExit;

	public T1_Basic() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		getContentPane().setLayout(null);

		JLabel lblTitle = new JLabel("그린중학교 성적표");
		lblTitle.setFont(new Font("굴림", Font.BOLD, 26));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(120, 39, 549, 71);
		getContentPane().add(lblTitle);

		JLabel lblName = new JLabel("성 명");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("굴림", Font.PLAIN, 20));
		lblName.setBounds(83, 131, 117, 52);
		getContentPane().add(lblName);

		JLabel lblKor = new JLabel("국어점수");
		lblKor.setHorizontalAlignment(SwingConstants.CENTER);
		lblKor.setFont(new Font("굴림", Font.PLAIN, 20));
		lblKor.setBounds(83, 213, 117, 52);
		getContentPane().add(lblKor);

		JLabel lblEng = new JLabel("영어점수");
		lblEng.setHorizontalAlignment(SwingConstants.CENTER);
		lblEng.setFont(new Font("굴림", Font.PLAIN, 20));
		lblEng.setBounds(83, 292, 117, 52);
		getContentPane().add(lblEng);

		JLabel lblMat = new JLabel("수학점수");
		lblMat.setHorizontalAlignment(SwingConstants.CENTER);
		lblMat.setFont(new Font("굴림", Font.PLAIN, 20));
		lblMat.setBounds(83, 376, 117, 52);
		getContentPane().add(lblMat);

		txtName = new JTextField();
		txtName.setHorizontalAlignment(SwingConstants.CENTER);
		txtName.setFont(new Font("굴림", Font.PLAIN, 20));
		txtName.setBounds(269, 131, 297, 52);
		getContentPane().add(txtName);
		txtName.setColumns(10);

		txtKor = new JTextField();
		txtKor.setHorizontalAlignment(SwingConstants.CENTER);
		txtKor.setFont(new Font("굴림", Font.PLAIN, 20));
		txtKor.setColumns(10);
		txtKor.setBounds(269, 213, 297, 52);
		getContentPane().add(txtKor);

		txtEng = new JTextField();
		txtEng.setHorizontalAlignment(SwingConstants.CENTER);
		txtEng.setFont(new Font("굴림", Font.PLAIN, 20));
		txtEng.setColumns(10);
		txtEng.setBounds(269, 292, 297, 52);
		getContentPane().add(txtEng);

		txtMat = new JTextField();
		txtMat.setHorizontalAlignment(SwingConstants.CENTER);
		txtMat.setFont(new Font("굴림", Font.PLAIN, 20));
		txtMat.setColumns(10);
		txtMat.setBounds(269, 376, 297, 52);
		getContentPane().add(txtMat);

		btnInput = new JButton("입 력");
		btnInput.setFont(new Font("굴림", Font.PLAIN, 20));
		btnInput.setBounds(122, 464, 184, 41);
		getContentPane().add(btnInput);

		btnReset = new JButton("다시입력");
		btnReset.setFont(new Font("굴림", Font.PLAIN, 20));
		btnReset.setBounds(333, 464, 184, 41);
		getContentPane().add(btnReset);

		btnExit = new JButton("종  료");
		btnExit.setFont(new Font("굴림", Font.PLAIN, 20));
		btnExit.setBounds(537, 464, 184, 41);
		getContentPane().add(btnExit);

		// 위쪽은 디자인
		setVisible(true);
		// 아래쪽은 메소드

		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		// 다시입력 버튼
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText("");
				txtKor.setText("");
				txtEng.setText("");
				txtMat.setText("");
				txtName.requestFocus();
			}
		});

		// 종료버튼
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ans = JOptionPane.showConfirmDialog(null, "작업을 종료하시겠습니까?", "", JOptionPane.YES_NO_OPTION);
				if (ans == 0)
					System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new T1_Basic();
	}
}
