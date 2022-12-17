package GeakPu.Ch7;

import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.Graphics;
import java.io.*;

public class MouseMoveEvent extends JPanel {
    BufferedImage img = null;
    int imgX = 0, imgY = 0;

    public MouseMoveEvent() {
        try { // 사진 불러오기 시도
            img = ImageIO.read(new File("../java_image/apple.gif"));
        } catch (IOException e) { // 사진 불러오기를 실패했을 경우
            System.out.println("no image");
            System.exit(1);
        }

        addMouseListener(new MouseListener() {
            @Override
            public void mousePressed(MouseEvent e) { // 마우스의 위치를 받아 좌표에 저장
                imgX = e.getX(); // 좌표를 저장
                imgY = e.getY();
                repaint(); // 화면에 다시 칠함
            }

            // 다른 여러 메소드들
            @Override
            public void mouseReleased(MouseEvent e) {
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
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, imgX, imgY, null); // 이미지를 주어진 좌표로 그림
    }
}