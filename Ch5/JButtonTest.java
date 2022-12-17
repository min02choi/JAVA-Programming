package GeakPu.Ch5;

import javax.swing.*;
import java.awt.*;

public class JButtonTest {
    JButton plus, minus, mux, divide;
    JFrame jf;

    public JButtonTest(String msg) {
        jf = new JFrame(msg);
        jf.getContentPane().setLayout(new GridLayout(2, 2));

        // 사진을 화면에 출력
        // '+' 이미지 --> 사이즈 조정
        ImageIcon iplus = new ImageIcon("../java_image/plus.png");
        Image img = iplus.getImage();
        Image changeImg = img.getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon n_iplus = new ImageIcon(changeImg);

        // '-' 이미지
        ImageIcon iminus = new ImageIcon("../java_image/minus.png");

        // 'x' 이미지 --> 사이즈 조정
        ImageIcon imux = new ImageIcon("../java_image/multiply.png");
        img = imux.getImage();
        changeImg = img.getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon n_imux = new ImageIcon(changeImg);

        // '/' 이미지
        ImageIcon idivide = new ImageIcon("../java_image/division.png");

        plus = new JButton(n_iplus); // 사이즈 조정한 이미지
        minus = new JButton(iminus);
        mux = new JButton(n_imux); // 사이즈 조정한 이미지
        divide = new JButton(idivide);

        jf.getContentPane().add(plus);
        jf.getContentPane().add(minus);
        jf.getContentPane().add(mux);
        jf.getContentPane().add(divide);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(500, 500);
        jf.setVisible(true);
    }
}