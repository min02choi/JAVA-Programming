package GeakPu.Ch8.Kiosk;

import java.util.ArrayList;
import javax.swing.*;

public class MenuSelectPanel extends JPanel {

    JPanel jf;

    ArrayList<JButton> cata1 = new ArrayList<>();
    ArrayList<JButton> cata2 = new ArrayList<>();
    ArrayList<JButton> cata3 = new ArrayList<>();
    ArrayList<JButton> cata4 = new ArrayList<>();

    public MenuSelectPanel() {
        jf = new JPanel();
        jf.setSize(480, 864);

        JButton jb = new EachMenu();

        jf.add(jb);
        jb.setVisible(true);
    }
}
