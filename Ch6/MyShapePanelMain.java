package GeakPu.Ch6;

import javax.swing.*;

public class MyShapePanelMain {
    public static void main(String[] args) {
        JFrame jf = new JFrame("My Shape Panel : CMY");
        jf.setSize(320, 300);

        MyShapePanel msp = new MyShapePanel();
        jf.add(msp);
        jf.setVisible(true);
    }
}
