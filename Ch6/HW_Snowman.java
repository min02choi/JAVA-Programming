package GeakPu.Ch6;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class HW_Snowman {

    public static void main(String[] args) {
        JFrame jf;

        jf = new JFrame("Snowman : CMY");
        jf.setSize(470, 670);

        DrawSnowman drawsnowman = new DrawSnowman();

        jf.add(drawsnowman);
        jf.setVisible(true);
    }

}

class DrawSnowman extends JPanel {

    public void paint(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;
        Shape s;

        // 눈사람 얼굴
        g2.setPaint(Color.WHITE);
        s = new Ellipse2D.Double(140, 160, 160, 160);
        g2.fill(s);
        g2.draw(s);

        // 하반신 벨트의 색
        g2.setPaint(Color.BLACK);
        s = new Ellipse2D.Double(100, 320, 240, 240);
        g2.fill(s);
        g2.draw(s);

        // 하반신 벨트 위
        g2.setPaint(Color.RED);
        s = new Arc2D.Float(100, 320, 240, 240, 350, 200, Arc2D.CHORD);
        g2.fill(s);
        g2.draw(s);

        // 하반신 벨트 아래
        g2.setPaint(Color.GRAY);
        s = new Arc2D.Float(100, 320, 240, 240, 200, 140, Arc2D.CHORD);
        g2.fill(s);
        g2.draw(s);

        // 하반신 단추(위)
        g2.setPaint(Color.BLACK);
        s = new Ellipse2D.Double(210, 360, 20, 20);
        g2.fill(s);
        g2.draw(s);

        // 하반신 단추(아래)
        s = new Ellipse2D.Double(210, 400, 20, 20);
        g2.fill(s);
        g2.draw(s);

        // 하반신 벨트
        g2.setPaint(Color.YELLOW);
        g2.setStroke(new BasicStroke(8)); // 선의 두께 설정
        s = new Rectangle2D.Double(200, 458, 40, 27);
        g2.draw(s);

        // 상반신
        // 모자(꼬깔 부분) - 1
        g2.setPaint(Color.RED);
        s = new Polygon(new int[] { 220, 170, 270 }, new int[] { 40, 170, 170 }, 3);
        g2.fill(s);
        g2.draw(s);

        // 모자(하단) - 2
        // 모자의 검은색 테두리(얼굴과의 경계 분리)
        g2.setPaint(Color.BLACK);
        s = new Rectangle(140, 170, 160, 30);
        g2.fill(s);
        g2.draw(s);

        // 모자의 흰색 부분
        g2.setPaint(Color.WHITE);
        s = new Rectangle(141, 171, 158, 28);
        g2.fill(s);
        g2.draw(s);

        // 모자(상단) - 3
        g2.setPaint(Color.WHITE);
        s = new Ellipse2D.Float(210, 30, 20, 20);
        g2.fill(s);
        g2.draw(s);

        // (사람 기준)왼쪽 눈
        g2.setPaint(Color.BLACK);
        g2.setStroke(new BasicStroke(2)); // 선의 두께 설정
        s = new Arc2D.Float(160, 220, 40, 40, 0, 180, Arc2D.OPEN);
        g2.draw(s);

        // 오른쪽 눈
        s = new Polygon(new int[] { 240, 280 }, new int[] { 230, 220 }, 2);
        g2.draw(s);
        s = new Polygon(new int[] { 240, 280 }, new int[] { 230, 240 }, 2);
        g2.draw(s);
        ;

        // 입
        s = new Arc2D.Float(180, 220, 80, 80, 180, 180, Arc2D.OPEN);
        g2.draw(s);

        // 당근(코) - 1
        g2.setPaint(Color.ORANGE);
        s = new Arc2D.Float(210, 250, 20, 20, 270, 180, Arc2D.CHORD);
        g2.fill(s);
        g2.draw(s);

        // 당근(코)-2
        s = new Polygon(new int[] { 220, 190, 220 }, new int[] { 250, 270, 270 }, 3);
        g2.fill(s);
        g2.draw(s);

        // (사람 기준)왼쪽 팔
        g2.setPaint(Color.BLACK);
        s = new Polygon(new int[] { 80, 140 }, new int[] { 280, 380 }, 2);
        g2.draw(s);
        s = new Polygon(new int[] { 80, 80 }, new int[] { 280, 250 }, 2);
        g2.draw(s);
        s = new Polygon(new int[] { 80, 60 }, new int[] { 280, 260 }, 2);
        g2.draw(s);

        // (사람 기준)오른쪽 팔
        s = new Polygon(new int[] { 360, 300 }, new int[] { 280, 380 }, 2);
        g2.draw(s);
        s = new Polygon(new int[] { 360, 380 }, new int[] { 280, 260 }, 2);
        g2.draw(s);
        s = new Polygon(new int[] { 360, 360 }, new int[] { 280, 250 }, 2);
        g2.draw(s);

    }
}
