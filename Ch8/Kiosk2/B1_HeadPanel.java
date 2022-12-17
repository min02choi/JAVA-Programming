package GeakPu.Ch8.Kiosk2;

import java.awt.*;
import java.awt.Color;

import javax.swing.*;

public class B1_HeadPanel extends JPanel {

    public B1_HeadPanel() {
        setLayout(null);

        // setBackground(Color.RED);

        ImageIcon logo = new ImageIcon("../java_image/kiosk/logo_brown2.png");

        Image n = logo.getImage();
        Image changed = n.getScaledInstance(288, 120, Image.SCALE_DEFAULT);
        ImageIcon n_logo = new ImageIcon(changed);

        JLabel picLabel = new JLabel(n_logo);
        picLabel.setBounds(96, 0, 288, 120);
        add(picLabel);

    }
}
