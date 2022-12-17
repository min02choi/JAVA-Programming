package GeakPu.Ch6;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.awt.*;

public class HW_ChartFrame extends JFrame {
    public HW_ChartFrame(String title) {
        setSize(1152, 630);
        setLayout(new GridLayout(2, 3, 5, 5));

        setTitle(title);

        JPanel p1, p2, p3, p4, p5, p6;

        Border border = new LineBorder(Color.darkGray, 2);

        p1 = new HW_TitlePanel();
        p1.setBorder(border);
        add(p1);

        p2 = new HW_PieChartPanel();
        p2.setBorder(border);
        add(p2);

        p3 = new HW_BarChartPanel();
        p3.setBorder(border);
        add(p3);

        p4 = new HW_LinerChartPanel();
        p4.setBorder(border);
        add(p4);

        p5 = new HW_RadarChartPanel();
        p5.setBorder(border);
        add(p5);

        p6 = new HW_LastPagePanel();
        p6.setBorder(border);
        add(p6);

        setVisible(true);
    }
}
