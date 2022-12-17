package GeakPu.Ch8.Kiosk2SSK;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class B23_AllCataMenu extends JPanel implements ActionListener {

    JButton cate1, cate2, cate3, cate4;
    ArrayList<JButton> all_cate = new ArrayList<>();

    // B2와 B3 합친거 레츠고
    // Cate 메뉴와 아래 패널들을 함침
    public B23_AllCataMenu() {
        setBackground(Color.DARK_GRAY);

        // setLayout할 떄의 주의사항 : '그 패널에 대해서' 좌표를 지정해야 함
        setLayout(null);

        cate1 = new JButton("닭강정");
        cate1.setBounds(36, 12, 84, 48);
        JPanel B3a = new B3a_Cata1Menu();
        B3a.setVisible(true);
        add(B3a);

        cate2 = new JButton("사이드");
        cate2.setBounds(144, 12, 84, 48);
        JPanel B3b = new B3b_Cata2Menu();
        B3a.setVisible(false);
        add(B3b);

        cate3 = new JButton("소스");
        cate3.setBounds(252, 12, 84, 48);
        JPanel B3c = new B3c_Cata3Menu();
        B3a.setVisible(false);
        add(B3c);

        cate4 = new JButton("음료");
        cate4.setBounds(360, 12, 84, 48);
        JPanel B3d = new B3d_Cata4Menu();
        B3a.setVisible(false);
        add(B3d);

        all_cate.add(cate1);
        all_cate.add(cate2);
        all_cate.add(cate3);
        all_cate.add(cate4);

        for (JButton jb : all_cate) {
            jb.setPreferredSize(new Dimension(84, 48));
            jb.addActionListener(this);
            add(jb);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton s = (JButton) e.getSource(); // 눌린 객체의 문자열을 반환

        String ss = s.getText();

        System.out.println("asdfasdf");

        if (ss.equals("닭강정")) {
            System.out.println("닭강정-");
            new B0_KioskMenuGUIPanel(ss);
        } else if (ss.equals("사이드")) {
            System.out.println("사이드-");
            new B0_KioskMenuGUIPanel(ss);

        } else if (s == cate3) {

        } else if (s == cate4) {

        }
    }

}
