package GeakPu.Ch5;

import javax.swing.JFrame;

public class CheckBoxTestMain {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Check Box Test : CMY");
        CheckBoxTest cb = new CheckBoxTest();

        cb.setOpaque(true);

        frame.add(cb);
        frame.setSize(500, 200);
        frame.setVisible(true);
    }
}
