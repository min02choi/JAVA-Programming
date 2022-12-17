package GeakPu.Ch8.Kiosk2SSK;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class A1_KioskStartPanel1 extends JPanel implements ActionListener {

    JButton here, togo;

    public A1_KioskStartPanel1() {

        setSize(480, 864);
        setLayout(null);

        // 이미지의 크기 조정
        ImageIcon image = new ImageIcon("../kiosk/startpage.png");
        Image n = image.getImage();
        Image changed = n.getScaledInstance(480, 864, Image.SCALE_DEFAULT);
        ImageIcon start = new ImageIcon(changed);

        // here.setBounds(r); // 이미지나 텍스트
        here = new JButton("매장");
        here.setBounds(48, 552, 168, 192);
        here.addActionListener(this);
        add(here);

        togo = new JButton("포장");
        togo.setBounds(264, 552, 168, 192);
        togo.addActionListener(this);
        add(togo);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton s = (JButton) e.getSource();

        if (s == here) {
            new B0_KioskMenuGUIPanel(null);
        } else if (s == togo) {
            new B0_KioskMenuGUIPanel(null);
        }

    }

}
