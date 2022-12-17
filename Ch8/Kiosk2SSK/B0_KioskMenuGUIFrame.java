package GeakPu.Ch8.Kiosk2SSK;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class B0_KioskMenuGUIFrame extends JFrame implements ActionListener {

    public B0_KioskMenuGUIFrame(String s) {

        setSize(480, 864);

        setLayout(null);

        // B1_HeadPanel.java
        JPanel B1 = new B1_HeadPanel();
        B1.setBounds(0, 0, 480, 120);
        add(B1);

        // B2_CategoryPanel.java
        JPanel B2 = new B2_CategoryPanel();
        B2.setBounds(0, 120, 480, 72);
        add(B2);

        // B3_MenuSelectPanel.java
        // 초기 화면은 B3a
        // JPanel B3a = new B3a_Cata1Menu();
        // JPanel B3a = new B3_MenuSelectPanel();

        JPanel B3a, B3b, B3c, B3d;

        // if 문 돌려서 null 이나 cata1이면 Jpanel B3 = new B3a_Cate1Menu
        if (s == null || s == "닭강정") { // null 없애줘도 되긴 함
            B3a = new B3a_Cata1Menu();
            B3a.setBounds(0, 192, 480, 456);
            add(B3a);
            System.out.println("cate1");
        } else if (s == "사이드") {
            B3b = new B3b_Cata2Menu();
            System.out.println("cate2");
            B3b.setBounds(0, 192, 480, 456);
            add(B3b);

        } else if (s == "소스") {
            B3c = new B3c_Cata3Menu();
        } else {
            B3d = new B3d_Cata4Menu();
        }

        // B4_BottomBarPanel.java
        JPanel B4 = new B4_BottomBarPanel();
        B4.setBounds(0, 648, 480, 48);
        add(B4);

        /*
         * // B5_MostBottomPanel.java
         * JPanel B5 = new B5_MostBottomPanel();
         * B3a.setBounds(0, 696, 480, 168);
         * add(B4);
         */

        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

    }
}
