package GeakPu.Ch7;

import javax.swing.*;

public class KeyTypeEventMain {
    public KeyTypeEventMain(String msg) {
        JFrame jf = new JFrame(msg);
        jf.setSize(800, 900);
        jf.add(new KeyTypeEvent());
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        KeyTypeEventMain kteM = new KeyTypeEventMain("Key Type Event : CMY");
    }
}
