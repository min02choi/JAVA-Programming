package GeakPu.Ch4;

import java.awt.*;

public class PanelTest {
    Frame f;
    Panel p;

    public PanelTest() {
        f = new Frame("PanelTest");
        f.setLayout(null);

        p = new Panel();
        p.setSize(200, 200);
        p.setBackground(Color.red);
        p.setLocation(100, 100);

        f.add(p);
        f.setSize(400, 400);
        f.setVisible(true);
    }
}


