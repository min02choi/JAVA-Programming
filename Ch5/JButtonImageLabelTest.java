package GeakPu.Ch5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JButtonImageLabelTest implements ActionListener {
    JFrame jf;
    JPanel jp;
    JLabel jl;
    JButton jb;

    public JButtonImageLabelTest(String msg) {
        // 창 생성
        jf = new JFrame(msg);
        jf.setTitle("JButton Event Test : CMY");
        jf.setSize(300, 250);

        // Panel, Label, Button생성 후 Label, Button을 Panel에 추가
        jp = new JPanel();
        jl = new JLabel("Click JButton to see Image");
        jb = new JButton("See Image!!");

        jp.add(jl);
        jp.add(jb);

        jb.addActionListener(this); // 버튼이 이벤트에 반응하도록 설정

        jp.add(jl); // 패널에 레이블 추가
        jp.add(jb); // 패널에 버튼 추가
        jf.add(jp); // 패널을 프레임에 추가
        jf.setVisible(true);
    }

    // 버튼을 클릭하는 이벤트에 대한 action 수행
    @Override
    public void actionPerformed(ActionEvent e) {
        ImageIcon eagle = new ImageIcon("../java_image/baldeagle.png");
        Image img = eagle.getImage();
        Image changeImg = img.getScaledInstance(250, 300, Image.SCALE_DEFAULT);
        ImageIcon n_eagle = new ImageIcon(changeImg);

        jl.setIcon(n_eagle); // 이미지를 레이블에 추가
        jl.setText("Bald Eagle"); // 레이블의 텍스트를 설정
        jb.setText("Good Luck"); // 버튼의 텍스트를 설정
    }
}