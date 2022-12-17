package GeakPu.Ch8.Kiosk2SSK;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class A1_KioskStartPanel extends JPanel implements MouseListener, ActionListener {

    public A1_KioskStartPanel() {
        setSize(480, 864);
        setLayout(null);

        // 이미지의 크기 조정
        ImageIcon image = new ImageIcon("../kiosk/startpage.png");
        Image n = image.getImage();
        Image changed = n.getScaledInstance(480, 864, Image.SCALE_DEFAULT);
        ImageIcon start = new ImageIcon(changed);

        JLabel picLabel = new JLabel(start);
        picLabel.setBounds(0, 0, 480, 864);
        picLabel.addMouseListener(this);

        add(picLabel);

    }

    // 패널을 클릭한 경우 버튼 생성
    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        JButton here, togo;

        // here.setBounds(r); // 이미지나 텍스트
        here = new JButton("매장");
        here.setBounds(48, 288, 168, 192);
        here.addActionListener(this);
        add(here);

        togo = new JButton("포장");
        togo.setBounds(264, 288, 168, 192);
        add(togo);

    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub

    }

    // 버튼이 눌렸을 때의 액션
    @Override
    public void actionPerformed(ActionEvent e) {
        new B0_KioskMenuGUIPanel(null);
    }
}
