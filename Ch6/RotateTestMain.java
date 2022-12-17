package GeakPu.Ch6;

import javax.swing.*;

public class RotateTestMain extends JFrame {
    public RotateTestMain() {
        setSize(300, 330);
        setTitle("Rotate Test : CMY");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new RotateTest();
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RotateTestMain();
    }
}
