package GeakPu.Ch6;

import javax.swing.*;

public class GradientTestMain extends JFrame {
    public GradientTestMain() {
        setSize(300, 330);
        setTitle("Gradient Test : CMY");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new GradientTest();
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GradientTestMain();
    }
}
