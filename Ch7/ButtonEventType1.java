package GeakPu.Ch7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonEventType1 {
    JFrame jf;
    JPanel panel;
    JButton button1;
    JButton button2;

    MyListener listener = new MyListener();

    public ButtonEventType1(String msg) {
        jf = new JFrame(msg); // 프레임 생성
        jf.setSize(300, 200); // 창의 크기
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창의 닫힘 여부
        jf.setTitle(msg);
        panel = new JPanel();

        button1 = new JButton("노란색"); // 버튼 생성
        button1.addActionListener(listener); // 액션리스너 등록
        panel.add(button1);

        button2 = new JButton("분홍색");
        button2.addActionListener(listener);
        panel.add(button2);

        jf.add(panel);
        jf.setVisible(true);
    }

    class MyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button1) { // 첫 번째(노란색) 버튼이 눌린 경우
                panel.setBackground(Color.YELLOW);
            }

            else if (e.getSource() == button2) { // 두 번째(분홍색) 버튼이 눌린 경우
                panel.setBackground(Color.PINK);
            }

        }
    }
}
