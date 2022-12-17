package GeakPu.Ch6;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HW_BarChartPanel extends JPanel implements ActionListener {

    JButton jb;

    // 초기 색상 지정
    Color c1 = new Color(255, 0, 0);
    Color c2 = new Color(255, 165, 0);
    Color c3 = new Color(0, 255, 0);
    Color c4 = new Color(0, 0, 255);
    Color c5 = new Color(106, 13, 173);

    public HW_BarChartPanel() {
        setLayout(null);

        // 표의 제목
        JLabel title;
        title = new JLabel("<요일 별 내가 듣는 강의 개수에 대한 막대차트>");
        title.setBounds(48, 16, 288, 32); // title의 위치
        add(title);

        // x축 레이블 생성(요일)
        JLabel mon, tue, wed, thur, fri;
        mon = new JLabel("월(3개)");
        mon.setBounds(60, 265, 50, 10);
        tue = new JLabel("화(2개)");
        tue.setBounds(120, 265, 50, 10);
        wed = new JLabel("수(3개)");
        wed.setBounds(180, 265, 50, 10);
        thur = new JLabel("목(2개)");
        thur.setBounds(240, 265, 50, 10);
        fri = new JLabel("금(1개)");
        fri.setBounds(300, 265, 50, 10);

        add(mon);
        add(tue);
        add(wed);
        add(thur);
        add(fri);

        // y축 레이블 생성(수업 수)
        JLabel one, two, three;
        one = new JLabel("3");
        one.setBounds(30, 60, 10, 10);
        two = new JLabel("2");
        two.setBounds(30, 122, 10, 10);
        three = new JLabel("1");
        three.setBounds(30, 184, 10, 10);

        add(one);
        add(two);
        add(three);

        // 버튼 생성
        jb = new JButton("색상 변경");
        jb.setBounds(250, 60, 100, 32);
        jb.addActionListener(this); // event를 가다림
        add(jb);

    }

    // 그래픽 그리기(막대 그래프)
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // 막대그래프 그리기
        g.setColor(c1);
        g.fillRect(60, 64, 40, 186);

        g.setColor(c2);
        g.fillRect(120, 126, 40, 124);

        g.setColor(c3);
        g.fillRect(180, 64, 40, 186);

        g.setColor(c4);
        g.fillRect(240, 126, 40, 124);

        g.setColor(c5);
        g.fillRect(300, 188, 40, 62);

        // 좌표축 그리기
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(3));
        g2.drawLine(50, 250, 345, 250); // x축
        g2.drawLine(50, 250, 50, 60); // y축

        // y축의 눈금선
        g2.setStroke(new BasicStroke(2));
        g2.drawLine(45, 64, 55, 64);
        g2.drawLine(45, 126, 55, 126);
        g2.drawLine(45, 188, 55, 188);
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
