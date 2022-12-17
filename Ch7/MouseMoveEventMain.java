package GeakPu.Ch7;

import javax.swing.*;

public class MouseMoveEventMain {
    JFrame jf;

    public MouseMoveEventMain(String msg) {
        jf = new JFrame(msg);
        jf.add(new MouseMoveEvent());
        jf.setSize(900, 1000);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new MouseMoveEventMain("Mouse Move Event : CMY");
    }
}
