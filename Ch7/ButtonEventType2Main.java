package GeakPu.Ch7;

import javax.swing.JFrame;

public class ButtonEventType2Main {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Button Event Type2 : CMY");
        jf.setSize(300, 500);
        jf.setVisible(true);

        ButtonEventType2 bet2 = new ButtonEventType2();

        jf.add(bet2);
    }

}
