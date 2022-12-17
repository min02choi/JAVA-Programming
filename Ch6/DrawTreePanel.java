package GeakPu.Ch6;

import java.awt.*;
import javax.swing.*;

public class DrawTreePanel extends JPanel {
    public DrawTreePanel() {

    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        drawTree(g, 400, 600, -90, 8);
    }

    private void drawTree(Graphics g, int x1, int y1, double angle, int depth) {
        if (depth == 0) {
            return; // 함수 재호출 중단
        }
        int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * depth * 10.0); // 선의 좌표 설정
        int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * depth * 10.0);
        g.drawLine(x1, y1, x2, y2); // 선(가지)를 그림
        drawTree(g, x2, y2, angle - 20, depth - 1); // 재귀호출
        drawTree(g, x2, y2, angle + 20, depth - 1);
    }
}
