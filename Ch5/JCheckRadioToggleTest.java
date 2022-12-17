package GeakPu.Ch5;

import java.awt.*;
import javax.swing.*;

public class JCheckRadioToggleTest {
    JFrame jf;
    JCheckBox major, submajor, interdis;
    JRadioButton single, married, divorced;
    JToggleButton onoff;

    public JCheckRadioToggleTest() {
        jf = new JFrame("Check, Radio, Toggle Test : CMY");
        jf.getContentPane().setLayout(new GridLayout(3, 3)); // JFrame의 Layout 형식을 GridLayout로 정함

        // 체크박스 생성(다중선택 가능)
        major = new JCheckBox("Major", true); // 프로그램 실행 시 초기 선택된 값
        submajor = new JCheckBox("Sub Major", false);
        interdis = new JCheckBox("Inter Disciplinary", false);

        // 라디오버튼 생성(단일선택 허용)
        ButtonGroup bg = new ButtonGroup();
        single = new JRadioButton("Single", true); // 프로그램 실행 시 초기 선택된 값
        married = new JRadioButton("Married", false);
        divorced = new JRadioButton("Divorced", false);

        // 라디오버튼들을 버튼그룹에 추가
        bg.add(single);
        bg.add(married);
        bg.add(divorced);

        // 토글버튼 생성
        onoff = new JToggleButton("On/Off");

        jf.getContentPane().add(major);
        jf.getContentPane().add(submajor);
        jf.getContentPane().add(interdis);
        jf.getContentPane().add(single);
        jf.getContentPane().add(married);
        jf.getContentPane().add(divorced);
        // jf.getContentPane().add(bg);
        jf.getContentPane().add(onoff);
        jf.setSize(300, 200);
        jf.setVisible(true);
    }
}