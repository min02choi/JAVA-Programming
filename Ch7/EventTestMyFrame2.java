package GeakPu.Ch7;

import java.awt.event.*;
import javax.swing.*;

public class EventTestMyFrame2 extends JFrame {

    JButton button;
    JLabel label;

    public EventTestMyFrame2(String msg) {
        super(msg); // 프레임 텍스트 설정
        setSize(400, 200); // 프레임 크기 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임의 닫힘 여부

        JPanel panel = new JPanel(); // 패널 생성
        button = new JButton("Button"); // 버튼 생성
        label = new JLabel("Please, Click the Button"); // 레이블 생성

        // 2번째 : 이벤트 리스너 등록
        button.addActionListener(new MyListener());
        panel.add(button);
        panel.add(label);

        add(panel);
        setVisible(true);
    }

    // MyListener라는 이름의 이너클래스
    private class MyListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button) {
                label.setText("Clicked the Button");
            }
        }
    }

}
