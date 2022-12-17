package GeakPu.Ch7;

import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;

public class ButtonEventType2 extends JPanel implements ActionListener {
    boolean flag = false;
    private int light = 0;

    public ButtonEventType2() {
        setLayout(new BorderLayout());
        setVisible(true);
        setSize(getPreferredSize());

        JButton b = new JButton("traffic light");
        b.addActionListener(this); // 액션리스너 추가
        add(b, BorderLayout.SOUTH);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // 원을 그림
        g.setColor(Color.BLACK);
        g.drawOval(100, 100, 100, 100);
        g.drawOval(100, 200, 100, 100);
        g.drawOval(100, 300, 100, 100);

        // light값에 따라 내부 색을 칠함
        if (light == 0) {
            g.setColor(Color.RED);
            g.fillOval(100, 100, 100, 100);
        }

        else if (light == 1) {
            g.setColor(Color.GREEN);
            g.fillOval(100, 200, 100, 100);
        }

        else {
            g.setColor(Color.ORANGE);
            g.fillOval(100, 300, 100, 100);
        }
    }

    public void actionPerformed(ActionEvent arg0) {
        if (++light >= 3) // light값을 증가시키고, 이 값이 만약 3이상이면
            light = 0; // 다시 0으로 설정
        repaint(); // 다시 색을 칠함
    }
}
