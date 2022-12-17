package GeakPu.Ch7;

import javax.swing.*;

public class EventTestMyFrame5 extends JFrame {
    JButton button;
    JLabel label;

    public EventTestMyFrame5(String msg) {
        super(msg);
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        button = new JButton("Button");
        label = new JLabel("Please, Click the Button");

        // 이벤트 리스너 등록
        // 5번째 : Lambda Expression
        button.addActionListener(e -> {
            if (e.getSource() == button) {
                label.setText("Clicked the Button");
            }
        });

        panel.add(button);
        panel.add(label);

        add(panel);
        setVisible(true);
    }
}
