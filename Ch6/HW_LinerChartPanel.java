package GeakPu.Ch6;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HW_LinerChartPanel extends JPanel implements ActionListener {

    JButton jb;

    // 초기 색상 지정
    Color c1 = new Color(255, 0, 0);
    Color c2 = new Color(0, 0, 255);

    public HW_LinerChartPanel() {
        setLayout(null);

        // 표의 제목
        JLabel title;
        title = new JLabel("<요일 별 내가 듣는 강의 개수에 대한 막대차트>");
        title.setBounds(48, 16, 288, 32); // title의 위치
        add(title);

        // x축 레이블 생성(요알)
        JLabel mon, tue, wed, thur, fri;
        mon = new JLabel("월요일");
        mon.setBounds(60, 265, 50, 10);
        tue = new JLabel("화요일");
        tue.setBounds(120, 265, 50, 10);
        wed = new JLabel("수요일");
        wed.setBounds(180, 265, 50, 10);
        thur = new JLabel("목요일");
        thur.setBounds(240, 265, 50, 10);
        fri = new JLabel("금요일");
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

        // 색상 안내(레이블)
        JLabel all, dept;
        all = new JLabel("모든 수업");
        all.setBounds(84, 196, 100, 16);
        dept = new JLabel("전공 수업");
        dept.setBounds(84, 220, 100, 16);

        add(all);
        add(dept);

        // 버튼 생성
        jb = new JButton("색상 변경");
        jb.setBounds(250, 60, 100, 32);
        jb.addActionListener(this); // event를 가다림
        add(jb);

    }

    // 그래픽 그리기(선형 그래프)
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        // 좌표축 그리기
        g2.setColor(Color.BLACK); // 색 설정
        g2.setStroke(new BasicStroke(3)); // 굵기 설정
        g2.drawLine(50, 250, 345, 250);
        g2.drawLine(50, 250, 50, 60);

        // y축의 눈금선
        g2.setStroke(new BasicStroke(2));
        g2.drawLine(45, 64, 55, 64);
        g2.drawLine(45, 126, 55, 126);
        g2.drawLine(45, 188, 55, 188);

        // 색상 안내
        g2.setPaint(c1);
        g2.fillOval(60, 196, 16, 16);
        g2.setPaint(c2);
        g2.fillOval(60, 220, 16, 16);

        g2.setStroke(new BasicStroke(3)); // 그래프 두께 설정

        // 그래프 그리기 : 요일 별 듣는 전공 수
        g2.setColor(c2);
        g2.drawLine(80, 64, 140, 126);
        g2.drawLine(140, 126, 200, 64);
        g2.drawLine(200, 64, 260, 126);
        g2.drawLine(260, 126, 320, 190);

        // 그래프 그리기 : 요일 별 듣는 강의 수
        g2.setColor(c1);
        g2.drawLine(80, 64, 140, 126);
        g2.drawLine(140, 126, 200, 64);
        g2.drawLine(200, 64, 260, 126);
        g2.drawLine(260, 126, 320, 250);

        // 좌표의 점과 레이블 출력 : 요일 별 듣는 강의 수
        g2.setColor(c2);
        g2.drawString("수업 3개", 80, 84);
        g2.fillOval(75, 59, 10, 10);
        g2.drawString("수업 2개", 140, 146);
        g2.fillOval(135, 121, 10, 10);
        g2.drawString("수업 3개", 200, 84);
        g2.fillOval(195, 59, 10, 10);
        g2.drawString("수업 2개", 260, 146);
        g2.fillOval(255, 121, 10, 10);
        g2.drawString("수업 1개", 320, 210);
        g2.fillOval(315, 185, 10, 10);

        // 좌표의 점과 레이블 출력 : 요일 별 듣는 전공 수
        g2.setColor(c1);
        g2.drawString("전공 3개", 80, 54);
        g2.fillOval(75, 59, 10, 10);
        g2.drawString("전공 2개", 140, 116);
        g2.fillOval(135, 121, 10, 10);
        g2.drawString("전공 3개", 200, 54);
        g2.fillOval(195, 59, 10, 10);
        g2.drawString("전공 2개", 260, 116);
        g2.fillOval(255, 121, 10, 10);
        g2.drawString("전공 0개", 320, 240);
        g2.fillOval(315, 245, 10, 10);

    }

    // 버튼의 event에 대한 action 지정
    public void actionPerformed(ActionEvent e) {
        c1 = new Color((int) (Math.random() * 255.0), (int) (Math.random() * 255.0), (int) (Math.random() * 255.0));
        repaint();
        c2 = new Color((int) (Math.random() * 255.0), (int) (Math.random() * 255.0), (int) (Math.random() * 255.0));
        repaint();
    }

}
