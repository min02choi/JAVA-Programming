package GeakPu.Ch6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.ArrayList;

public class HW_ChartCircleGraph {
    // jf;

    JPanel all, dc, data, chart;
    public static JButton jb;
    // public static Color c1, c2, c3, c4, c5;

    public static void main(String[] args) {
        JFrame jf;
        JLabel title, mon, tue, wed, thur, fri;
        // JButton jb;

        jf = new JFrame("[HW] Chart Circle Graph : CMY");
        jf.setSize(384, 315);

        // 차트의 제목
        title = new JLabel("<요일 별 내가 듣는 강의 개수에 대한 원형차트>");
        title.setBounds(48, 16, 288, 32);
        jf.add(title);

        // 색상 안내(레이블)
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

        jf.add(mon);
        jf.add(tue);
        jf.add(wed);
        jf.add(thur);
        jf.add(fri);

        // 버튼 생성
        jb = new JButton("색상 변경");
        jb.addActionListener(new DrawChartCirleGraph());
        jb.setBounds(30, 224, 100, 32);
        jf.add(jb);

        // 그래픽 출력
        DrawChartCirleGraph dccg = new DrawChartCirleGraph();
        jf.add(dccg);
        jf.setVisible(true);
    }

    public HW_ChartCircleGraph() {

    }
}

class DrawChartCirleGraph extends JPanel implements ActionListener {

    // JButton jbb = new JButton();

    Color c1 = new Color(255, 0, 0);
    Color c2 = new Color(255, 165, 0);
    Color c3 = new Color(0, 255, 0);
    Color c4 = new Color(0, 0, 255);
    Color c5 = new Color(106, 13, 173);

    Shape s;

    public void paintComponent(Graphics g) {

        // jbb = new JButton();

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        // Shape s;

        // 색상 안내 원
        // g2.setPaint(Color.RED);
        // g2.setColor(c1);
        g2.setPaint(c1);

        // g2.fillOval(20, 72, 16, 16);
        s = new Ellipse2D.Double(20, 72, 16, 16);
        g2.fill(s);
        g2.draw(s);

        g2.setPaint(Color.ORANGE);
        s = new Ellipse2D.Double(20, 96, 16, 16);
        g2.fill(s);
        g2.draw(s);

        g2.setPaint(Color.GREEN);
        s = new Ellipse2D.Double(20, 120, 16, 16);
        g2.fill(s);
        g2.draw(s);

        g2.setPaint(Color.BLUE);
        s = new Ellipse2D.Double(20, 144, 16, 16);
        g2.fill(s);
        g2.draw(s);

        g2.setPaint(Color.MAGENTA);
        s = new Ellipse2D.Double(20, 168, 16, 16);
        g2.fill(s);
        g2.draw(s);

        // 원형 차트
        g2.setPaint(Color.RED);
        s = new Arc2D.Double(160, 64, 192, 192, 0, 32.7272 * 3, Arc2D.PIE);
        g2.fill(s);
        g2.draw(s);

        g2.setPaint(Color.ORANGE);
        s = new Arc2D.Double(160, 64, 192, 192, 32.7272 * 3, 32.7272 * 2, Arc2D.PIE);
        g2.fill(s);
        g2.draw(s);

        g2.setPaint(Color.GREEN);
        s = new Arc2D.Double(160, 64, 192, 192, 32.7272 * 5, 32.7272 * 3, Arc2D.PIE);
        g2.fill(s);
        g2.draw(s);

        g2.setPaint(Color.BLUE);
        s = new Arc2D.Double(160, 64, 192, 192, 32.7272 * 8, 32.7272 * 2, Arc2D.PIE);
        g2.fill(s);
        g2.draw(s);

        g2.setPaint(Color.MAGENTA);
        s = new Arc2D.Double(160, 64, 192, 192, 32.7272 * 10, 32.7272 * 1, Arc2D.PIE);
        g2.fill(s);
        g2.draw(s);
    }

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
