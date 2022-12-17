package GeakPu.Ch8.Kiosk2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class B2_CategoryPanel extends JPanel implements ActionListener {

    JButton cate1, cate2, cate3, cate4;
    ArrayList<JButton> all_cate = new ArrayList<>();

    JPanel cateMenus = new JPanel();
    B3a_Cata1Menu b3a;
    B3b_Cata2Menu b3b;
    B3c_Cata3Menu b3c;
    B3d_Cata4Menu b3d;
    B5_MostBottomPanel m_b5;

    // 하 버튼 위치 어떻게 조정하냐 Panel-Panel이라서 안뜨는건가
    public B2_CategoryPanel(B5_MostBottomPanel b5) {

        m_b5 = b5;

        setBackground(Color.DARK_GRAY);

        // setLayout할 떄의 주의사항 : '그 패널에 대해서' 좌표를 지정해야 함
        setLayout(null);

        Font font = new Font("Serif", Font.BOLD, 30);

        cate1 = new JButton("닭강정");
        cate1.setBounds(36, 12, 84, 48);

        cate2 = new JButton("사이드");
        cate2.setBounds(144, 12, 84, 48);

        cate3 = new JButton("소스");
        cate3.setBounds(252, 12, 84, 48);

        cate4 = new JButton("음료");
        cate4.setBounds(360, 12, 84, 48);

        all_cate.add(cate1);
        all_cate.add(cate2);
        all_cate.add(cate3);
        all_cate.add(cate4);

        for (JButton jb : all_cate) {
            jb.setPreferredSize(new Dimension(84, 48));
            jb.addActionListener(this);
            add(jb);
        }

        cateMenus.setLayout(null);

        // 페이지를 미리 만들어 놓고 setVisible로 조정
        b3a = new B3a_Cata1Menu(m_b5);
        b3b = new B3b_Cata2Menu();
        b3c = new B3c_Cata3Menu();
        b3d = new B3d_Cata4Menu();

        b3a.setBounds(0, 72, 480, 456);
        // b3a.setBackground(Color.RED);
        b3a.setVisible(true);
        add(b3a);

        b3b.setBounds(0, 72, 480, 456);
        // b3b.setBackground(Color.BLUE);
        b3b.setVisible(false);
        add(b3b);

        b3c.setBounds(0, 72, 480, 456);
        // b3c.setBackground(Color.BLUE);
        b3c.setVisible(false);
        add(b3c);

        b3d.setBounds(0, 72, 480, 456);
        // b3dd.setBackground(Color.BLUE);
        b3d.setVisible(false);
        add(b3d);

    }

    public void actionPerformed(ActionEvent e) {
        // Object s = e.getSource(); // 눌린 버튼의 객체를 반환
        JButton s = (JButton) e.getSource(); // 눌린 객체를 반환
        String str = s.getText();
        System.out.println(str);

        if (str.equals("닭강정")) {
            b3a.setVisible(true);
            b3b.setVisible(false);
            b3c.setVisible(false);
            b3d.setVisible(false);
        } else if (str.equals("사이드")) {
            b3a.setVisible(false);
            b3b.setVisible(true);
            b3c.setVisible(false);
            b3d.setVisible(false);
        } else if (str.equals("소스")) {
            b3a.setVisible(false);
            b3b.setVisible(false);
            b3c.setVisible(true);
            b3d.setVisible(false);
        } else if (str.equals("음료")) {
            b3a.setVisible(false);
            b3b.setVisible(false);
            b3c.setVisible(false);
            b3d.setVisible(true);
        }
    }

}
