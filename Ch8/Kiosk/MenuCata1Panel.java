package GeakPu.Ch8.Kiosk;

import javax.swing.*;

public class MenuCata1Panel extends JPanel {

    JFrame jf_cat1;
    JButton trip, doub, sing, cup;

    public MenuCata1Panel() {
        jf_cat1.setSize(480, 456);

        JButton jb = EachMenu.createMenu("트리플", "25000", "../kiosk");
        jf_cat1.add(jb);
    }

}
