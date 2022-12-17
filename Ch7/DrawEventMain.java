package GeakPu.Ch7;

import javax.swing.JFrame;

public class DrawEventMain {
    public DrawEventMain(String msg) {
        JFrame jf = new JFrame(msg);
        jf.setSize(900, 1000);
        jf.add(new DrawEvent());
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new DrawEventMain("Draw Event : CMY");
    }
}