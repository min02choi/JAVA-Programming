package GeakPu.Ch8.Kiosk2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class B5_MostBottomPanel extends JPanel implements ActionListener {

    JLabel cost, st_cost; // cost는 틀, ch_cost가 변하는 가격
    public JLabel ch_cost;
    JButton bag, pay;

    public B5_MostBottomPanel() {
        setLayout(null);

        // setBackground(Color.MAGENTA);

        // 가격 표시 레이블 만들기
        cost = new JLabel(); // 틀
        cost.setLayout(null);

        // 내부 레이블 1 - 고정된 텍스트
        st_cost = new JLabel("가격");
        cost.add(st_cost); // cost내에서의 위치 선정
        st_cost.setBounds(0, 0, 48, 36);

        // 내부 레이블 2 - 가격 변동
        ch_cost = new JLabel();
        cost.add(ch_cost); // cost내에서의 위치 선정
        ch_cost.setBounds(48, 0, 96, 36);

        // 패널에서의 위치
        cost.setBounds(312, 24, 72, 36);

        add(cost);

        // 장바구니 버튼 만들기
        bag = new JButton("장바구니");
        bag.setBounds(312, 72, 60, 72);
        bag.addActionListener(this);

        // 결제버튼 만들기
        pay = new JButton("결제");
        pay.setBounds(384, 72, 72, 72);
        pay.addActionListener(this);

        add(bag);
        add(pay);

    }

    // 타 클래스에서 데이터 받기 대작전!!
    public void sendData() {
        ch_cost.setText("hello");
        ch_cost.updateUI();
    }

    public void actionPerformed(ActionEvent e) {

    }

}
