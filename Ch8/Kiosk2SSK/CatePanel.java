package GeakPu.Ch8.Kiosk2SSK;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CatePanel extends JPanel {
    public CatePanel() {
        B3a_Cata1Menu b3a = new B3a_Cata1Menu();
        B3b_Cata2Menu b3b = new B3b_Cata2Menu();

        b3a.setBounds(0, 192, 480, 456);
        b3a.setVisible(true);
        add(b3a);

        b3b.setBounds(0, 192, 480, 456);
        b3b.setVisible(false);
        add(b3b);
    }
}
