package GeakPu.Ch6;

import javax.swing.*;

public class PieChart1Frame extends JFrame {

    public PieChart1Frame() {
        setSize(384, 315);
        JPanel panel = new HW_PieChartPanel();
        add(panel);
        setVisible(true);
    }
}
