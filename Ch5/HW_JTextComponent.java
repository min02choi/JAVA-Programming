package GeakPu.Ch5;

import javax.swing.*;
import java.awt.*;

public class HW_JTextComponent {
    JFrame jf;
    JTextField jtf;
    JPasswordField jpf;
    JTextArea jta;
    JButton jb;
    JPanel user, center, end;
    JLabel login, password, press;

    public HW_JTextComponent(String msg) {
        // 창 생성
        jf = new JFrame(msg);
        jf.setSize(300, 400);

        // id, password 칸/패널 생성(상단)
        user = new JPanel();
        user.setLayout(new GridLayout(2, 2)); // Layout --> GridLayout
        login = new JLabel("Login   ");
        password = new JLabel("Password");

        jtf = new JTextField(); // 아이디를 입력받는 공간
        jpf = new JPasswordField(); // 암호를 입력받는 공간

        /*
         * login.add(jtf);
         * password.add(jpf);
         * 
         * user.add(login, BorderLayout.NORTH);
         * user.add(password, BorderLayout.CENTER);
         */

        user.add(login); // Label형식이 GridLayout이므로 순차적으로 Panel에 추가
        user.add(jtf);
        user.add(password);
        user.add(jpf);

        // 의견 창 생성(중앙)
        center = new JPanel();
        center.setLayout(new BorderLayout());
        // center.setAlignmentX(10); // 창 크기 조절을 위한 시도(1)
        // center.setSize(100, 100); // 창 크기 조절을 위한 시도(2)

        jta = new JTextArea("Enter for your Opinion", 100, 200); // 초기 입력값 지정
        center.add(jta, BorderLayout.CENTER);

        // 버튼 생성(하단)
        end = new JPanel();
        press = new JLabel("Press");
        jb = new JButton("OK");

        end.add(press); // Layout --> Flowlayout이므로 그냥 추가
        end.add(jb);

        // 창에 패널 배치
        jf.add(user, BorderLayout.NORTH);
        jf.add(center, BorderLayout.CENTER);
        jf.add(end, BorderLayout.SOUTH);

        jf.setVisible(true);
    }
}
