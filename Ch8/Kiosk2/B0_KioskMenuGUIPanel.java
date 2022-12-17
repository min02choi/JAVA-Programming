package GeakPu.Ch8.Kiosk2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class B0_KioskMenuGUIPanel extends JPanel implements ActionListener {

    // JPanel 다 밖으로 빼? ooooooo
    B5_MostBottomPanel B5;

    public B0_KioskMenuGUIPanel(String s) {

        setLayout(null);
        // setPreferredSize(new Dimension(480, 864));

        // removeAll();

        B5 = new B5_MostBottomPanel();
        B5.setBounds(0, 696, 480, 168);
        add(B5);

        // B1_HeadPanel.java
        JPanel B1 = new B1_HeadPanel();
        B1.setBounds(0, 0, 480, 120);
        add(B1);

        // B2_CategoryPanel.java
        // JPanel B2 = new B2_CategoryPanel();
        // 이걸 함 만땅으로 바꿔볼래?
        JPanel B2 = new B2_CategoryPanel(B5);
        B2.setBounds(0, 120, 480, 528);
        add(B2);

        // B3_MenuSelectPanel.java
        // 초기 화면은 B3a
        // JPanel B3a = new B3a_Cata1Menu();
        // JPanel B3a = new B3_MenuSelectPanel();

        // JPanel B3 = new B3a_Cata1Menu();
        // min02choi : JPanel B3a, B3b, B3c, B3d;
        /*
         * B3a_Cata1Menu b3a = new B3a_Cata1Menu();
         * B3b_Cata2Menu b3b = new B3b_Cata2Menu();
         * 
         * b3a.setBounds(0, 192, 480, 456);
         * b3a.setVisible(true);
         * add(b3a);
         * 
         * b3b.setBounds(0, 192, 480, 456);
         * b3b.setVisible(false);
         * add(b3b);
         * 
         * // if 문 돌려서 null 이나 cata1이면 Jpanel B3 = new B3a_Cate1Menu
         * if (s.equals("닭강정")) { // null 없애줘도 되긴 함
         * b3a.setVisible(true);
         * b3b.setVisible(false);
         * System.out.println("cate1");
         * 
         * } else if (s == "사이드") {
         * b3a.setVisible(false);
         * b3b.setVisible(true);
         * System.out.println("cate2");
         * 
         * }
         */
        // B4_BottomBarPanel.java
        JPanel B4 = new B4_BottomBarPanel();
        B4.setBounds(0, 648, 480, 48);
        add(B4);

    }

    public void actionPerformed(ActionEvent e) {

    }
}
