package GeakPu.Ch8.Kiosk2;

import javax.swing.*;

public class B3b_Cata2Menu extends JPanel {

    JButton side1, side2, side3, side4, side5, side6;

    public B3b_Cata2Menu() {
        setLayout(null);

        System.out.println("this is b3b");

        side1 = new B3_0_MenuMaker("감자튀김", "3000원", "../java_image/kiosk/fries.png");
        side1.setBounds(36, 24, 120, 192);
        add(side1);

        side2 = new B3_0_MenuMaker("치즈볼", "5000원", "../java_image/kiosk/cheeseball.png");
        side2.setBounds(180, 24, 120, 192);
        add(side2);

        side3 = new B3_0_MenuMaker("근위튀김", "9000원", "../java_image/kiosk/gingko.png");
        side3.setBounds(324, 24, 120, 192);
        add(side3);

        side4 = new B3_0_MenuMaker("달고마", "5000원", "../java_image/kiosk/sweetpotato.png");
        side4.setBounds(36, 240, 120, 192);
        add(side4);

        side5 = new B3_0_MenuMaker("떡볶이", "4500원", "../java_image/kiosk/ttuckbokki.png");
        side5.setBounds(180, 240, 120, 192);
        add(side5);

        side6 = new B3_0_MenuMaker("짜장 떡볶이", "4500원", "../java_image/kiosk/ttuckbokki_black.png");
        side6.setBounds(324, 240, 120, 192);
        add(side6);

        /*
         * cup = new B3_0_MenuMaker("컵", "5000원", "../java_image/javalogo.png");
         * cup.setBounds(324, 240, 120, 192);
         * add(cup);
         */

    }
}
