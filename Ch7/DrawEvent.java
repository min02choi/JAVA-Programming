package GeakPu.Ch7;

import java.awt.event.*;
import javax.swing.*;
import java.awt.Graphics;

public class DrawEvent extends JPanel {
    int startX, startY, w, h;
    JPanel jp;

    // DrawEvent 생성자
    public DrawEvent() {

    }

    void drawPanel() {
        addMouseListener(new MouseListener() {

            @Override
            public void mouseReleased(MouseEvent e) {
                w = Math.abs(startX - e.getX()); // 클릭했다가 땟을때의 좌표를 구해 가로, 세로 길이를 구함
                h = Math.abs(startY - e.getY());
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) { // 클릭했을 경우
                startX = e.getX(); // 좌표를 구함
                startY = e.getY();
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseClicked(MouseEvent e) {
            }
        });

        addMouseMotionListener(new MouseMotionListener() {

            @Override
            public void mouseDragged(MouseEvent e) {
                w = Math.abs(startX - e.getX());
                h = Math.abs(startY - e.getY());
                repaint();
            }

            @Override
            public void mouseMoved(MouseEvent e) {
            }
        });
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(startX, startY, w, h); // 원을 그림
        drawPanel();
    }
}