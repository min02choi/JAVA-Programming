package GeakPu.Ch5;

import javax.swing.*;
import java.awt.*;

public class JLabelTest {
    JFrame jf;
    JLabel label1, label2;

    public JLabelTest(String msg) {
        jf = new JFrame(msg);
        // jf.setTitle("Image Label Test : CMY");
        jf.setSize(300, 250);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.getContentPane().setBackground(Color.YELLOW); // 창의 배경색 설정

        label1 = new JLabel("University Logo");
        // label1.setFont(new Font("굴림체", Font.PLAIN, 20));
        ImageIcon logo = new ImageIcon("..java_image/sm_logo.gif"); // 파일로부터 이미지를 가져옴

        label2 = new JLabel("SMU", logo, JLabel.CENTER); // 텍스트와 이미지를 label2에 추가

        // label을 창에 배치
        jf.getContentPane().add("North", label1);
        jf.getContentPane().add("Center", label2);
        jf.setVisible(true);
    }
}
