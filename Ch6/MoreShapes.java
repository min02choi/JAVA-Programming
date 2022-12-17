package GeakPu.Ch6;

import javax.swing.*;

public class MoreShapes extends JFrame {
    public MoreShapes(String msg) {
        super(msg);
        setSize(700, 200);

        JPanel panel = new MoreShapesPanel();
        add(panel);
        setVisible(true);
    }
}
