package GeakPu.Ch8.Kiosk2SSK;

import java.awt.Color;

import javax.swing.*;

public class B1_HeadPanel extends JPanel {

    public B1_HeadPanel() {
        setLayout(null);

        setBackground(Color.RED);

        ImageIcon logo = new ImageIcon("../java_image/logo.png");
        JLabel picLabel = new JLabel(logo);
        picLabel.setBounds(0, 0, 480, 120);
        add(picLabel);

    }
}
