package GeakPu.Ch7;

import javax.swing.*;
import java.awt.event.*;

public class EventTestMyFrame1 extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    public EventTestMyFrame1(String msg) {

        setTitle(msg);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 버튼 누를 시 창 닫힘 여부

        JPanel panel = new JPanel(); // 패널 생성
        button = new JButton("Button"); // 버튼 생성
        label = new JLabel("Please, Click the Button"); // 레이블 생성

        // 1번째 : 가장 일반적인 경우
        button.addActionListener(this); // event에 대한 actionlistener 등록

        panel.add(button); // 패널에 컴포넌트 추가
        panel.add(label);

        this.add(panel);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) { // 받은 요소가 button과 동일한 경우
            label.setText("Clicked this Button"); // 레이블의 텍스트 변경
        }

    }
}
