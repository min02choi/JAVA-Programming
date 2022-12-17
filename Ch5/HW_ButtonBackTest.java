package GeakPu.Ch5;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class HW_ButtonBackTest implements ActionListener {
    JFrame jf;
    JPanel jp1, jp2;
    JLabel jl1, jl2, jl22;
    JButton jb1, jb2;
    ImageIcon ii2;

    public HW_ButtonBackTest(String msg) {
        jf = new JFrame(msg);
        jf.setLayout(new BorderLayout());

        // jp1 설계
        jp1 = new JPanel();
        jl1 = new JLabel("<html>흰머리수리 사진을 보고 싶으면 아래 버튼을 누르세요<br/>(만약 움직이지 않는다면 창의 크기를 조절해보세요.)</html>");
        jb1 = new JButton("See Image");

        // jp1.add(jl1, BorderLayout.CENTER);
        // jp1.add(jb1, BorderLayout.SOUTH);

        jp1.add(jl1);
        jp1.add(jb1);

        // jp2 설계
        jp2 = new JPanel();
        jl2 = new JLabel("<html>초기화면으로 거려면 버튼을 누르세요.<br/>(만약 움직이지 않는다면 창의 크기를 조절해보세요.)</html>");
        jb2 = new JButton("Go Back");
        ii2 = new ImageIcon("../java_image/baldeagle.png");
        Image img = ii2.getImage();
        Image changeImg = img.getScaledInstance(250, 300, Image.SCALE_DEFAULT);
        ImageIcon n_ii2 = new ImageIcon(changeImg);
        jl22 = new JLabel(n_ii2);

        jp2.add(jl22, "CENTER");
        jp2.add(jl2, "SOUTH");
        jp2.add(jb2, "SOUTH");

        jb1.addActionListener(this);
        jb2.addActionListener(this);

        jf.add(jp1);
        jf.setVisible(true);
        jf.setSize(450, 500);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == jb1) {
            jf.remove(jp1);
            jf.add(jp2);
            jf.setVisible(true);

        }

        else if (e.getSource() == jb2) {
            jf.remove(jp2);
            jf.add(jp1);
            jf.setVisible(true);
        }

        jf.setVisible(true);
        // jf.setSize(450, 500);

    }

}