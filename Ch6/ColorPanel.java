package GeakPu.Ch6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorPanel extends JPanel implements ActionListener {
    JButton button;
    Color color = new Color(0, 0, 0);

    public ColorPanel() {
        setLayout(new BorderLayout());
        button = new JButton("Color Change");
        button.addActionListener(this); // event에 대한 action을 기다림
        add(button, BorderLayout.SOUTH);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        g.fillRect(50, 50, 300, 300);
    }

    public void actionPerformed(ActionEvent e) {
        // 랜덤 수 생성하여 색 지정
        color = new Color((int) (Math.random() * 255.0),
                (int) (Math.random() * 255.0),
                (int) (Math.random() * 255.0));
        repaint(); // event에 대한 paint 함수를 다시 호출
    }
}
