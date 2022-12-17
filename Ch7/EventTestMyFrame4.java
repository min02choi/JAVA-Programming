package GeakPu.Ch7;

import java.awt.event.*;
import javax.swing.*;

public class EventTestMyFrame4 extends JFrame {

    JButton button;
    JLabel label;

    public EventTestMyFrame4(String msg) {
        super(msg);
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        button = new JButton("Button");
        label = new JLabel("Please, Click the Button");

        // 이벤트 리스너 등록
        // 4번째 : 독립적인 클래스
        button.addActionListener(new MyListener(label));
        panel.add(button);
        panel.add(label);

        add(panel);
        setVisible(true);
    }
}

// 액션리스너를 구현한 독립 클래스
class MyListener implements ActionListener {

    JLabel label;

    MyListener(JLabel l) {
        label = l;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        if (e.getSource() == button) {
            label.setText("Clicked the Button");
        }

    }
}