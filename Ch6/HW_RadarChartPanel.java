package GeakPu.Ch6;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.geom.*;

public class HW_RadarChartPanel extends JPanel implements ActionListener {

    JButton jb;

    // 초기 색상 지정
    Color c1 = new Color(255, 0, 0);
    Color c2 = new Color(255, 165, 0);

    public HW_RadarChartPanel() {
        setLayout(null);

        // 표의 제목
        JLabel title;
        title = new JLabel("<나이 별 내가 흥미 있는 운동에 대한 방사형차트>");
        title.setBounds(48, 16, 288, 32);
        // Font font = new Font("", Font.BOLD, 13);
        // title.setFont(font);
        add(title);

        // 색상 안내(레이블)
        JLabel one, two;
        one = new JLabel("10대의 나");
        one.setBounds(44, 72, 100, 16);
        two = new JLabel("20대의 나");
        two.setBounds(44, 96, 100, 16);

        add(one);
        add(two);

        // 버튼 생성
        jb = new JButton("색상 변경");
        jb.setBounds(30, 224, 100, 32);
        jb.addActionListener(this); // event를 가다림
        add(jb);

    }

    // 그래픽 그리기(선형 그래프)
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Shape s;

        // 색상 안내
        g2.setPaint(c1);
        s = new Ellipse2D.Double(20, 72, 16, 16);
        g2.fill(s);
        g2.draw(s);

        g2.setPaint(c2);
        s = new Ellipse2D.Double(20, 96, 16, 16);
        g2.fill(s);
        g2.draw(s);

        // 방사선 그래프 그리기
        int x[] = { 240, 145, 181, 299, 335 }; // 초기 오각형 좌표
        int y[] = { 70, 139, 250, 250, 139 };

        int addx[] = { 0, 19, 12, -12, -19 }; // 증감 값
        int addy[] = { 20, 6, -16, -16, 6 };

        // 내부 선 그리기
        g2.setPaint(Color.BLACK);
        for (int i = 0; i < 5; i++) {
            g.drawLine(x[i], y[i], 240, 169);
        }

        // 오각형 그리기
        g2.setStroke(new BasicStroke((float) 1.6)); // 두께 설정
        s = new Polygon(x, y, 5); // 가장 큰 (처음) 오각형
        g2.draw(s);

        // for문으로 오각형 그리기(4번 반복)
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                x[j] += addx[j]; // 좌표 설정
                y[j] += addy[j];
            }

            // 오각형 출력
            s = new Polygon(x, y, 5);
            g2.draw(s);
        }

        // 그래프의 레이블 설정
        g2.drawString("축구", 228, 60);
        g2.drawString("야구", 125, 130);
        g2.drawString("배드민턴", 150, 270);
        g2.drawString("락클라이밍", 280, 270);
        g2.drawString("탁구", 335, 130);

        g2.setStroke(new BasicStroke(2)); // 두께 설정

        // 그래프 그리기 : 10대의 나 그래프
        int me10_x[] = { 240, 145, 217, 287, 297 };
        int me10_y[] = { 110, 139, 202, 234, 151 };
        g2.setPaint(c1);
        s = new Polygon(me10_x, me10_y, 5);
        g2.draw(s);

        // 그래프 그리기 : 20대의 나 그래프
        int me20_x[] = { 240, 183, 229, 299, 278 };
        int me20_y[] = { 150, 151, 186, 250, 157 };
        g2.setPaint(c2);
        s = new Polygon(me20_x, me20_y, 5);
        g2.draw(s);

    }

    // 버튼의 event에 대한 action 지정
    public void actionPerformed(ActionEvent e) {
        c1 = new Color((int) (Math.random() * 255.0), (int) (Math.random() * 255.0), (int) (Math.random() * 255.0));
        repaint();
        c2 = new Color((int) (Math.random() * 255.0), (int) (Math.random() * 255.0), (int) (Math.random() * 255.0));
        repaint();
    }

}
