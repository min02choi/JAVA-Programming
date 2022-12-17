package GeakPu.Ch6;

import java.awt.*;
import javax.swing.*;

public class HW_LastPagePanel extends JPanel {

    public HW_LastPagePanel() {
        setBackground(Color.GREEN);
        setLayout(new BorderLayout());

        // 텍스트 생성
        JLabel text;
        text = new JLabel("Thank You!");
        Font font = new Font("Serif", Font.BOLD, 30); // 글씨체, 스타일, 두께 설정
        text.setForeground(Color.BLACK);
        text.setFont(font);

        // text.setBounds(100, 100, 200, 50);
        // text.setAlignmentX(CENTER_ALIGNMENT);
        // text.setAlignmentY(CENTER_ALIGNMENT);

        text.setHorizontalAlignment((int) CENTER_ALIGNMENT); // 가운데 정렬

        add(text);
    }

    // 그래픽 그리기
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Shape s;

        // 주황색
        int x2[] = { 162, 340, 384, 384, 200 };
        int y2[] = { 180, 0, 0, 315, 315 };
        g2.setPaint(Color.ORANGE);
        s = new Polygon(x2, y2, 5);
        g2.fillPolygon((Polygon) s);

        // 빨간색
        int x1[] = { 0, 190, 230, 0 };
        int y1[] = { 0, 0, 170, 250 };
        g2.setPaint(Color.RED);
        s = new Polygon(x1, y1, 4);
        g2.fillPolygon((Polygon) s);

        // 파란색
        int x3[] = { 0, 0, 100, 340 };
        int y3[] = { 315, 200, 150, 315 };
        g2.setPaint(Color.BLUE);
        s = new Polygon(x3, y3, 4);
        g2.fillPolygon((Polygon) s);
    }

}
