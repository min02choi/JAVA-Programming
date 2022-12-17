package GeakPu.Ch8.Kiosk2;

import javax.swing.*;

public class KioskAllPanelFrame extends JFrame {

    // public JFrame jf; // 씹

    public KioskAllPanelFrame() {

        // 원래 예정한 사이즈는 864인데 항상 짧음 -> 890 언저리로 설정
        setSize(480, 890);
        // JPanel B0 = new B0_KioskMenuPanel();
        // add(B0);
        setTitle("Gamaro Kiosk : CMY");

        // setVisible(true);

        // 이거 지워라
        JPanel a11 = new A1_KioskStartPanel1();
        add(a11);

        JPanel B0_GUI = new B0_KioskMenuGUIPanel(new String("닭강정"));
        add(B0_GUI);

        // JPanel A1 = new A1_KioskStartPanel1();
        // jf.add(A1);

        setVisible(true);
    }
}
