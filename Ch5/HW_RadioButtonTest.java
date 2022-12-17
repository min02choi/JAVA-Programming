package GeakPu.Ch5;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class HW_RadioButtonTest implements ActionListener {
    JFrame jf;
    JPanel select; // 라디오버튼 배치
    JLabel text, res; // 상단 문구, 하단 문구
    JRadioButton jb1, jb2, jb3; // 라디오버튼
    ButtonGroup bg;

    public HW_RadioButtonTest(String msg) {

        // 화면에 출력할 창 생성
        jf = new JFrame(msg);
        jf.setSize(400, 250);
        jf.setLayout(new BorderLayout());

        // 창 상단 --> 메뉴 선택 질문
        text = new JLabel("What size of coffee do you like to order?");
        text.setHorizontalAlignment(JLabel.CENTER); // 가운데 정렬

        // 창 중심부 --> 라디오 버튼
        select = new JPanel(new GridLayout(0, 3));
        bg = new ButtonGroup(); // 버튼들을 묶어줄 ButtonGroup
        jb1 = new JRadioButton("Small Size");
        jb2 = new JRadioButton("Medium Size");
        jb3 = new JRadioButton("Large Size");

        bg.add(jb1); // ButtonGroup에 각각의 버튼 추가
        bg.add(jb2);
        bg.add(jb3);

        select.add(jb1); // 패널에 각각의 버튼 추가
        select.add(jb2);
        select.add(jb3);

        jb1.addActionListener(this); // 각각의 버튼에 대해서 반응하게 함
        jb2.addActionListener(this);
        jb3.addActionListener(this);

        // 창 하단 --> 메뉴 결과
        res = new JLabel("Did not select the size"); // 초기 문구
        res.setHorizontalAlignment(JLabel.CENTER); // 창 중앙에 문구 배치
        res.setForeground(Color.BLUE); // 문구의 색 설정

        // 요소들을 Frame에 배치
        jf.add(text, "North");
        jf.add(select, "Center");
        jf.add(res, "South");

        jf.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jb1)
            res.setText("Ordered Small Size");

        else if (e.getSource() == jb2)
            res.setText("Ordered Medium Size");

        else if (e.getSource() == jb3)
            res.setText("Ordered Large Size");
    }
}
