package GeakPu.Ch8.Kiosk2SSK;

import javax.swing.*;

public class KioskAllPanelFrame extends JFrame {

    // public JFrame jf; // 씹

    public KioskAllPanelFrame() {

        setSize(480, 864);
        // JPanel B0 = new B0_KioskMenuPanel();
        // add(B0);

        // setVisible(true);

        JPanel B0_GUI = new B0_KioskMenuGUIPanel(new String("닭강정"));
        add(B0_GUI);

        // JPanel A1 = new A1_KioskStartPanel1();
        // jf.add(A1);

        setVisible(true);
    }
}
