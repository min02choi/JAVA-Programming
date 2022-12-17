package GeakPu.Ch8.Kiosk2SSK;

import java.awt.*;
import javax.swing.*;

import GeakPu.Ch8.Kiosk.MenuCata1Panel;

import java.awt.event.*;
import java.util.ArrayList;

public class B2_CategoryPanel extends JPanel {

    JButton cate1, cate2, cate3, cate4;
    ArrayList<JButton> all_cate = new ArrayList<>();
    JPanel cateMenus = new JPanel();
    B3a_Cata1Menu b3a;
    B3b_Cata2Menu b3b;

    // 하 버튼 위치 어떻게 조정하냐 Panel-Panel이라서 안뜨는건가
    public B2_CategoryPanel() {

        setBackground(Color.DARK_GRAY);

        // setLayout할 떄의 주의사항 : '그 패널에 대해서' 좌표를 지정해야 함
        setLayout(null);

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
            jb.addActionListener(new ClickedCategoryButton());
            add(jb);
        }

        cateMenus.setLayout(null);

        b3a = new B3a_Cata1Menu();
        b3b = new B3b_Cata2Menu();

        b3a.setBounds(0, 192, 480, 456);
        b3a.setBackground(Color.RED);
        b3a.setVisible(true);
        add(b3a);

        b3b.setBounds(0, 192, 480, 456);
        b3b.setBackground(Color.BLUE);
        b3b.setVisible(false);
        add(b3b);

    }

    class ClickedCategoryButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Object s = e.getSource(); // 눌린 버튼의 객체를 반환
            JButton b = (JButton) e.getSource(); // 눌린 객체의 문자열을 반환
            String str = b.getText();
            System.out.println(b.getText());

            if (str.equals("닭강정")) {
                System.out.println("ㄷㄱㅈ");
                b3a.setVisible(true);
                b3b.setVisible(false);
                // new B3a_Cata1Menu();
                // B0_KioskMenuGUIPanel p = new B0_KioskMenuGUIPanel(s);

                // new B0_KioskMenuGUIFrame(s);
            } else if (str.equals("사이드")) {
                System.out.println("ㅅㅇㄷ");
                b3a.setVisible(false);
                b3b.setVisible(true);
                // new B0_KioskMenuGUIFrame(s);

            }
        }
    }

}
