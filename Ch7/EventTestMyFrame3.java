package GeakPu.Ch7;

import java.awt.event.*;
import javax.swing.*;

public class EventTestMyFrame3 extends JFrame {

    JButton button;
    JLabel label;

    public EventTestMyFrame3(String msg) {
        super(msg);
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        button = new JButton("Button");
        label = new JLabel("Please, Click the Button");

        // 이벤트 리스너 등록
        // 3번째 : 익명 클래스
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button) {
                    label.setText("Clicked the Button");
                }
            }
        });

        panel.add(button);
        panel.add(label);

        add(panel);
        setVisible(true);
    }
}