package GeakPu.Ch6;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorTest extends JFrame {
    public ColorTest(String msg) {
        super(msg);
        setSize(400, 480);

        JPanel panel = new ColorPanel();
        add(panel);
        setVisible(true);
    }

}
