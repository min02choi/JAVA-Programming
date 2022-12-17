package GeakPu.Ch7;

import javax.swing.JFrame;

public class ButtonEventType3Main {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Button Event Type3 : CMY");
        jf.setSize(500, 500);

        ButtonEventType3 bet3 = new ButtonEventType3();
        jf.add(bet3);
        jf.setVisible(true);

    }
}
