package GeakPu.Ch6;

import javax.swing.*;

public class BasicStrokeTestMain extends JFrame {
    public BasicStrokeTestMain() {
        setSize(300, 330);
        setTitle("Basic Stroke Test : CMY");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new BasicStrokeTest();
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BasicStrokeTestMain();
    }
}
