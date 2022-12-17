package GeakPu.Ch8.Kiosk2;

import java.awt.*;
import javax.swing.*;

public class B4_BottomBarPanel extends JPanel {

    JLabel menu_list;

    public B4_BottomBarPanel() {
        setLayout(null);

        setBackground(Color.LIGHT_GRAY);

        menu_list = new JLabel("주문 내역");
        Font font = new Font("Serif", Font.BOLD, 20);
        menu_list.setFont(font);
        menu_list.setBounds(24, 12, 120, 24);
        add(menu_list);

    }
}
