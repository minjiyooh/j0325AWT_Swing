package t7_WindowBuilder;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Test1 extends JFrame {

    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;

    public Test1() {
        initialize();
    }

    private void initialize() {
        // 프레임 설정
        setTitle("회원가입");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 513, 643);
        getContentPane().setLayout(null);

        // 패널 설정
        JPanel panel = new JPanel();
        panel.setBounds(35, 69, 427, 525);
        getContentPane().add(panel);
        panel.setLayout(null);

        // 라벨들
        JLabel lbPassword = new JLabel("아이디");
        lbPassword.setFont(new Font("경기천년제목 Medium", Font.BOLD, 15));
        lbPassword.setHorizontalAlignment(SwingConstants.CENTER);
        lbPassword.setBounds(12, 10, 85, 31);
        panel.add(lbPassword);

        JLabel lblNewLabel_1 = new JLabel("비밀번호");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setFont(new Font("경기천년제목 Medium", Font.BOLD, 15));
        lblNewLabel_1.setBounds(12, 81, 85, 31);
        panel.add(lblNewLabel_1);

        JLabel lblNewLabel_1_1 = new JLabel("이름");
        lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_1.setFont(new Font("경기천년제목 Medium", Font.BOLD, 15));
        lblNewLabel_1_1.setBounds(12, 165, 85, 31);
        panel.add(lblNewLabel_1_1);

        JLabel lbBirth = new JLabel("생년월일");
        lbBirth.setHorizontalAlignment(SwingConstants.CENTER);
        lbBirth.setFont(new Font("경기천년제목 Medium", Font.BOLD, 15));
        lbBirth.setBounds(12, 252, 85, 31);
        panel.add(lbBirth);

        JLabel lbGender = new JLabel("성별");
        lbGender.setHorizontalAlignment(SwingConstants.CENTER);
        lbGender.setFont(new Font("경기천년제목 Medium", Font.BOLD, 15));
        lbGender.setBounds(12, 340, 85, 31);
        panel.add(lbGender);

        // 텍스트 필드들
        textField = new JTextField();
        textField.setForeground(Color.LIGHT_GRAY);
        textField.setBounds(47, 37, 350, 35);
        panel.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setForeground(Color.LIGHT_GRAY);
        textField_1.setColumns(10);
        textField_1.setBounds(47, 111, 350, 35);
        panel.add(textField_1);

        textField_2 = new JTextField();
        textField_2.setForeground(Color.LIGHT_GRAY);
        textField_2.setColumns(10);
        textField_2.setBounds(47, 195, 350, 35);
        panel.add(textField_2);

        textField_4 = new JTextField();
        textField_4.setBounds(47, 293, 100, 35);
        panel.add(textField_4);
        textField_4.setColumns(10);

        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(162, 293, 100, 35);
        panel.add(comboBox);

        textField_5 = new JTextField();
        textField_5.setBounds(281, 293, 100, 35);
        panel.add(textField_5);
        textField_5.setColumns(10);

        // 라디오 버튼들
        JRadioButton rdbtnNewRadioButton = new JRadioButton("여 자");
        rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
        rdbtnNewRadioButton.setFont(new Font("굴림", Font.PLAIN, 14));
        rdbtnNewRadioButton.setBounds(60, 377, 132, 41);
        panel.add(rdbtnNewRadioButton);

        JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("남자");
        rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
        rdbtnNewRadioButton_1.setFont(new Font("굴림", Font.PLAIN, 14));
        rdbtnNewRadioButton_1.setBounds(215, 377, 132, 41);
        panel.add(rdbtnNewRadioButton_1);

        // 버튼
        JButton btnNewButton = new JButton("가입하기");
        btnNewButton.setFont(new Font("문체부 제목 돋음체", Font.PLAIN, 17));
        btnNewButton.setBounds(47, 430, 338, 50);
        panel.add(btnNewButton);

        // 라벨
        JLabel lb1 = new JLabel("NAVER");
        lb1.setHorizontalAlignment(SwingConstants.CENTER);
        lb1.setFont(new Font("굴림", Font.BOLD, 24));
        lb1.setBounds(157, 0, 143, 80);
        getContentPane().add(lb1);

        // 가입하기 버튼에 대한 액션 리스너
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 아이디 유효성 검사 수행
                String id = textField.getText();
                if (isValidID(id)) {
                    // 유효한 아이디일 경우 가입 처리를 수행할 수 있음
                    System.out.println("유효한 아이디입니다: " + id);
                } else {
                    // 유효하지 않은 아이디일 경우 메시지 표시
                    System.out.println("유효하지 않은 아이디입니다.");
                }
            }
        });
    }

    // 아이디 유효성 검사 메소드
    private boolean isValidID(String id) {
        // 소문자 영어, 숫자, 밑줄(_)로만 이루어진 문자열인지 확인하는 정규표현식
        String regex = "^[a-z0-9_]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }

    public static void main(String[] args) {
    	new Test1();
    	
       
    }
    


}