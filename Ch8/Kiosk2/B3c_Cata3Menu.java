package GeakPu.Ch8.Kiosk2;

import javax.swing.*;

public class B3c_Cata3Menu extends JPanel {

    JButton s1, s2, s3, s4, s5, s6;

    public B3c_Cata3Menu() {
        setLayout(null);

        s1 = new B3_0_MenuMaker("", "700원", "../java_image/kiosk/sauce1.png");
        s1.setBounds(36, 24, 120, 192);
        add(s1);

        s2 = new B3_0_MenuMaker("BBQ 소스", "700원", "../java_image/kiosk/sauce2.png");
        s2.setBounds(180, 24, 120, 192);
        add(s2);

        s3 = new B3_0_MenuMaker("치즈갈릭 소스", "700원", "../java_image/kiosk/sauce3.png");
        s3.setBounds(324, 24, 120, 192);
        add(s3);

        s4 = new B3_0_MenuMaker("", "700원", "../java_image/kiosk/sauce4.png");
        s4.setBounds(36, 240, 120, 192);
        add(s4);

        s5 = new B3_0_MenuMaker("스위트 칠리 소스", "700원", "../java_image/kiosk/sauce5.png");
        s5.setBounds(180, 240, 120, 192);
        add(s5);

        s6 = new B3_0_MenuMaker("청양마요 소스", "700원", "../java_image/kiosk/sauce6.png");
        s6.setBounds(324, 240, 120, 192);
        add(s6);

    }
}
