package GeakPu.Ch5;

import java.awt.*;
import javax.swing.*;

public class JComboBoxTest {
    JComboBox fruits;

    public JComboBoxTest() {
        JFrame jf = new JFrame("JComboBox Test : CMY");
        jf.getContentPane().setLayout(new FlowLayout());
        String items[] = { "apple", "grape", "melon", "orange", "banana", "pear" };
        fruits = new JComboBox(items);
        /*
         * fruits.addItem("apple");
         * fruits.addItem("grape");
         * fruits.addItem("melon");
         * .....
         */
        jf.getContentPane().add(fruits);
        jf.setSize(200, 200);
        jf.setVisible(true);
    }
}