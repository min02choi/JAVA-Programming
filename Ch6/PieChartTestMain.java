package GeakPu.Ch6;

import javax.swing.JFrame;

public class PieChartTestMain {
    public static void main(String[] args) {
        JFrame jf = new JFrame();

        jf.add(new PieChartTest()); // create My Draw class
        jf.setSize(384, 315);
        jf.setVisible(true);
    }
}
