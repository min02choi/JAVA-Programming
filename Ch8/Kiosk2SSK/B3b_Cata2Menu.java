package GeakPu.Ch8.Kiosk2SSK;

import javax.swing.*;

public class B3b_Cata2Menu extends JPanel {

    public B3b_Cata2Menu() {
        setLayout(null);

        System.out.println("this is b3b");

        JButton trip, doub, sing, cup, sauce;

        trip = new B3_0_MenuMaker("트리플", "25000원", "../java_image/apple.gif");
        trip.setBounds(36, 24, 120, 192);
        add(trip);

        doub = new B3_0_MenuMaker("dho", "17000원", "../java_image/baldeagle.png");
        doub.setBounds(180, 24, 120, 192);
        add(doub);

        sing = new B3_0_MenuMaker("ㄴㅁㅁㄴ", "9500원", "../java_image/grape.gif");
        sing.setBounds(324, 24, 120, 192);
        add(sing);

        cup = new B3_0_MenuMaker("비상", "5000원", "../java_image/javalogo.png");
        cup.setBounds(36, 240, 120, 192);
        add(cup);

        sauce = new B3_0_MenuMaker("소스", "5000원", "");
        cup.setBounds(180, 240, 120, 192);
        add(cup);

        /*
         * cup = new B3_0_MenuMaker("컵", "5000원", "../java_image/javalogo.png");
         * cup.setBounds(324, 240, 120, 192);
         * add(cup);
         */

    }
}
