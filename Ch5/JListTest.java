package GeakPu.Ch5;

import java.awt.*;
import javax.swing.*;

public class JListTest {
    JList fruits;

    public JListTest() {
        JFrame jf = new JFrame("JList Test : CMY");
        jf.getContentPane().setLayout(new FlowLayout());
        String items[] = { "apple", "grape", "melon", "orange", "banana", "pear" };
        fruits = new JList(items);
        // fruits.setVisibleRowCount(items.length);
        fruits.setVisibleRowCount(4);
        JScrollPane sp = new JScrollPane(fruits);
        jf.getContentPane().add(sp);
        jf.setSize(200, 200);
        jf.setVisible(true);
    }
}