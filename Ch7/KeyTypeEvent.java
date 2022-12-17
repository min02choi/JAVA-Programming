package GeakPu.Ch7;

import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.*;

public class KeyTypeEvent extends JPanel {

    BufferedImage img = null;
    int imgX = 1, imgY = 1;

    public KeyTypeEvent() {
        // Car image 갖고 오기 try-catch 필수
        try { // image 가져오기 성공
            img = ImageIO.read(new File("../java_image/apple.gif"));
        }

        catch (IOException e) { // image가져오기 실패한 경우
            System.out.println("no image");
            System.exit(1);
        }

        // JPanel에 대한 keyEvent 등록
        addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keycode = e.getKeyCode(); // 키 방향

                // 키 방향에 대한 좌표 이동
                switch (keycode) {
                    case KeyEvent.VK_UP:
                        imgY -= 10;
                        break;
                    case KeyEvent.VK_DOWN:
                        imgY += 10;
                        break;
                    case KeyEvent.VK_LEFT:
                        imgX -= 10;
                        break;
                    case KeyEvent.VK_RIGHT:
                        imgX += 10;
                        break;
                }
                repaint();
            }

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

        });

        this.requestFocus(); // key event 받을 컴포넌트를 강제로 설정
        setFocusable(true); // key event의 focus를 받을 수 있도록 설정
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, imgX, imgY, null);
    }
}
