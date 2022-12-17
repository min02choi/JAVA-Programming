package GeakPu.Ch8.Kiosk;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class KioskFrame extends JFrame {

    public KioskFrame(String title) {
        setSize(480, 864);
        setTitle(title);

        JPanel jp;
        jp = new MenuCata1Panel();

    }

}
