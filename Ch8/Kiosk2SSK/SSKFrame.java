package GeakPu.Ch8.Kiosk2SSK;

import javax.swing.*;

public class SSKFrame extends JFrame {
    public SSKFrame() {
        setSize(1080, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new B2_CategoryPanel());

        setVisible(true);
    }

    public static void main(String[] args) {
        new SSKFrame();
    }
}
