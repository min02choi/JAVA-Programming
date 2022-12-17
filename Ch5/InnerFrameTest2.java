package GeakPu.Ch5;

import javax.swing.*;
import java.awt.*;

public class InnerFrameTest2 {
    JFrame jf;
    JDesktopPane desktop; // Inner Frame을 붙히기 위한 상위 Panel
    JInternalFrame inframe1, inframe2, inframe3, inframe4;
    JButton ok;

    public InnerFrameTest2(String msg) {
        jf = new JFrame(msg);

        desktop = new JDesktopPane();
        desktop.setLayout(new GridLayout(2, 2));
        inframe1 = new JInternalFrame("Inner Frame 1");
        inframe2 = new JInternalFrame("Inner Frame 2");
        inframe3 = new JInternalFrame("JListTest");
        inframe4 = new JInternalFrame("Check, Radio Test");

        inframe1.setSize(200, 200);
        inframe1.setVisible(true);
        inframe2.setSize(400, 400);
        inframe2.setVisible(true);

        // inframe2 --> button
        ok = new JButton("OK");
        inframe2.getContentPane().add(ok, BorderLayout.SOUTH);

        // inframe3 --> JListTest.java 차용
        inframe3.getContentPane().setLayout(new FlowLayout());
        String items[] = { "apple", "grape", "melon", "orange", "banana", "pear" };
        JList fruits = new JList(items);
        // fruits.setVisibleRowCount(items.length);
        fruits.setVisibleRowCount(4);
        JScrollPane sp = new JScrollPane(fruits);
        inframe3.getContentPane().add(sp);
        inframe3.setSize(200, 200);
        inframe3.setVisible(true);

        // inframe4 --> JCheckRadioToggleTest.java 차용
        inframe4.getContentPane().setLayout(new GridLayout(3, 3)); // JFrame의 Layout 형식을 GridLayout로 정함

        // 체크박스 생성(다중선택 가능)
        JCheckBox major = new JCheckBox("Major", true); // 프로그램 실행 시 초기 선택된 값
        JCheckBox submajor = new JCheckBox("Sub Major", false);
        JCheckBox interdis = new JCheckBox("Inter Disciplinary", false);

        // 라디오버튼 생성(단일선택 허용)
        ButtonGroup bg = new ButtonGroup();
        JRadioButton single = new JRadioButton("Single", true); // 프로그램 실행 시 초기 선택된 값
        JRadioButton married = new JRadioButton("Married", false);
        JRadioButton divorced = new JRadioButton("Divorced", false);

        // 라디오버튼들을 버튼그룹에 추가
        bg.add(single);
        bg.add(married);
        bg.add(divorced);

        inframe4.getContentPane().add(major);
        inframe4.getContentPane().add(submajor);
        inframe4.getContentPane().add(interdis);
        inframe4.getContentPane().add(single);
        inframe4.getContentPane().add(married);
        inframe4.getContentPane().add(divorced);

        inframe4.setVisible(true);

        // Inner Frame을 Desktop에 붙히기
        desktop.add(inframe1);
        desktop.add(inframe2);
        desktop.add(inframe3);
        desktop.add(inframe4);

        // JFrame setting
        jf.getContentPane().add(desktop);

        jf.setSize(800, 600);
        jf.setVisible(true);

    }
}
