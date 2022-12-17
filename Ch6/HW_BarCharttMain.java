package GeakPu.Ch6;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class HW_BarCharttMain {
    public static void main(String[] args) {
        JFrame jf = new JFrame();

        jf.add(new HW_BarChart()); // create My Draw class
        jf.setSize(300, 200);
        jf.setVisible(true);
    }
}
