package GeakPu.Ch6;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
//import java.util.*;
//import java.io.*;

public class HW_BarChart extends JPanel {

    JLabel label;
    BarChartPanel graph = new BarChartPanel();

    public HW_BarChart() {
        setVisible(true);
        setLayout(new BorderLayout());

        label = new JLabel("<요일별 내가 듣는 강의 개수에 대한 막대차트>", SwingConstants.CENTER);
        add(label, BorderLayout.NORTH);
        add(graph, BorderLayout.CENTER);

    }

    class BarChartPanel extends JPanel implements ActionListener {

        JButton btn;
        Color c1 = new Color(255, 0, 0);
        Color c2 = new Color(255, 165, 0);
        Color c3 = new Color(0, 255, 0);
        Color c4 = new Color(0, 0, 255);
        Color c5 = new Color(106, 13, 173);

        public BarChartPanel() {
            setLayout(null);
            setVisible(true);

            btn = new JButton("색상 변경");
            btn.setBounds(160, 10, 100, 20);

            btn.addActionListener(this);

            add(btn);

        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            int x = getWidth();
            int y = getHeight();

            // x,y�� �׸���
            g.drawLine(50, 250, 350, 250); // x��
            g.drawLine(50, 0, 50, 250); // y��

            g.drawLine(45, 64, 55, 64);
            g.drawLine(45, 126, 55, 126);
            g.drawLine(45, 188, 55, 188);

            // x�� ���� ����
            g.drawString("월(3개)", 60, 280);
            g.drawString("화(2개)", 120, 280);
            g.drawString("수(3개)", 180, 280);
            g.drawString("목(2개)", 240, 280);
            g.drawString("금(1개)", 300, 280);

            // ���� �׸���
            g.setColor(c1);
            g.fillRect(60, 64, 40, 186); // ��

            g.setColor(c2);
            g.fillRect(120, 126, 40, 124); // ȭ

            g.setColor(c3);
            g.fillRect(180, 64, 40, 186); // ��

            g.setColor(c4);
            g.fillRect(240, 126, 40, 124); // ��

            g.setColor(c5);
            g.fillRect(300, 188, 40, 62); // ��

        }

        public void actionPerformed(ActionEvent e) {
            /*
             * for (int i = 0; i < 5; i++) {
             * color[i] = new Color((int) (Math.random() * 255.0),
             * (int) (Math.random() * 255.0), (int) (Math.random() * 255.0));
             * repaint();
             * }
             */
            c1 = new Color((int) (Math.random() * 255.0), (int) (Math.random() * 255.0), (int) (Math.random() * 255.0));
            repaint();
            c2 = new Color((int) (Math.random() * 255.0), (int) (Math.random() * 255.0), (int) (Math.random() * 255.0));
            repaint();
            c3 = new Color((int) (Math.random() * 255.0), (int) (Math.random() * 255.0), (int) (Math.random() * 255.0));
            repaint();
            c4 = new Color((int) (Math.random() * 255.0), (int) (Math.random() * 255.0), (int) (Math.random() * 255.0));
            repaint();
            c5 = new Color((int) (Math.random() * 255.0), (int) (Math.random() * 255.0), (int) (Math.random() * 255.0));
            repaint();
        }
    }
}
