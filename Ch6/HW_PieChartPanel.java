package GeakPu.Ch6;

import javax.swing.JPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class HW_PieChartPanel extends JPanel implements ActionListener {

    JButton jb;

    // 초기 색상 지정
    Color c1 = new Color(255, 0, 0);
    Color c2 = new Color(255, 165, 0);
    Color c3 = new Color(0, 255, 0);
    Color c4 = new Color(0, 0, 255);
    Color c5 = new Color(106, 13, 173);

    public HW_PieChartPanel() {
        setLayout(null);

        // 표의 제목
        JLabel title;
        title = new JLabel("<요일 별 내가 듣는 강의 개수에 대한 원형차트>");
        title.setBounds(48, 16, 288, 32);
        add(title);

        // 색상 안내(레이블)
        JLabel mon, tue, wed, thur, fri;
        mon = new JLabel("월요일(수업 3개)");
        mon.setBounds(44, 72, 100, 16);
        tue = new JLabel("화요일(수업 2개)");
        tue.setBounds(44, 96, 100, 16);
        wed = new JLabel("수요일(수업 3개)");
        wed.setBounds(44, 120, 100, 16);
        thur = new JLabel("목요일(수업 2개)");
        thur.setBounds(44, 144, 100, 16);
        fri = new JLabel("금요일(수업 1개)");
        fri.setBounds(44, 168, 100, 16);

        add(mon);
        add(tue);
        add(wed);
        add(thur);
        add(fri);

        // 버튼 생성
        jb = new JButton("색상 변경");
        jb.setBounds(30, 224, 100, 32);
        jb.addActionListener(this); // event를 가다림
        add(jb);

    }

    // 그래픽 그리기(원형 그래프)
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Shape s;

        // 색상 안내 원
        g2.setPaint(c1);
        s = new Ellipse2D.Double(20, 72, 16, 16);
        g2.fill(s);
        g2.draw(s);

        g2.setPaint(c2);
        s = new Ellipse2D.Double(20, 96, 16, 16);
        g2.fill(s);
        g2.draw(s);

        g2.setPaint(c3);
        s = new Ellipse2D.Double(20, 120, 16, 16);
        g2.fill(s);
        g2.draw(s);

        g2.setPaint(c4);
        s = new Ellipse2D.Double(20, 144, 16, 16);
        g2.fill(s);
        g2.draw(s);

        g2.setPaint(c5);
        s = new Ellipse2D.Double(20, 168, 16, 16);
        g2.fill(s);
        g2.draw(s);

        // 원형 차트
        // 수업 하나 당 각(degrees) : 360 / 11 = 32.7272
        g2.setPaint(c1);
        s = new Arc2D.Double(160, 64, 192, 192, 0, 32.7272 * 3, Arc2D.PIE);
        g2.fill(s);
        g2.draw(s);

        g2.setPaint(c2);
        s = new Arc2D.Double(160, 64, 192, 192, 32.7272 * 3, 32.7272 * 2, Arc2D.PIE);
        g2.fill(s);
        g2.draw(s);

        g2.setPaint(c3);
        s = new Arc2D.Double(160, 64, 192, 192, 32.7272 * 5, 32.7272 * 3, Arc2D.PIE);
        g2.fill(s);
        g2.draw(s);

        g2.setPaint(c4);
        s = new Arc2D.Double(160, 64, 192, 192, 32.7272 * 8, 32.7272 * 2, Arc2D.PIE);
        g2.fill(s);
        g2.draw(s);

        g2.setPaint(c5);
        s = new Arc2D.Double(160, 64, 192, 192, 32.7272 * 10, 32.7272 * 1, Arc2D.PIE);
        g2.fill(s);
        g2.draw(s);

    }

    // 버튼의 event에 대한 action 지정
    public void actionPerformed(ActionEvent e) {
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
