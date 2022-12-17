package GeakPu.Ch5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TabTest implements ItemListener {
    JFrame jf;
    JTabbedPane tabpane;

    // Tab4의 액션리스너를 위해
    JCheckBox[] buttons = new JCheckBox[3];
    String[] fruits = { "apple", "grape", "pear" };
    JLabel[] pictureLabel = new JLabel[3];
    ImageIcon[] icon = new ImageIcon[3];

    public TabTest(String msg) {
        jf = new JFrame(msg);
        tabpane = new JTabbedPane();

        // Tab1
        JPanel one = new JPanel();
        one.setBackground(Color.red); // 배경 색 설정

        ImageIcon logo = new ImageIcon("../java_image/" + "sm_logo.gif");
        JLabel label = new JLabel("SMU Logo", logo, JLabel.RIGHT);
        label.setFont(new Font(" 굴림", Font.BOLD, 30));
        one.add(label);

        // Tab2 : JComboBox.java 차용
        JPanel two = new JPanel();
        two.setBackground(Color.orange);

        JComboBox fruitlist;
        String items[] = { "apple", "grape", "melon", "orange", "banana", "pear" };
        fruitlist = new JComboBox(items); // JComboBox 객체에 리스트 추가
        two.add(fruitlist); // 패널에 JComboBox 객체 추가

        // Tab3 : JCheckRadioToggleTest.java 차용
        JPanel three = new JPanel();
        three.setLayout(new GridLayout(3, 3));
        three.setBackground(Color.green);

        JCheckBox major, submajor, interdis;
        major = new JCheckBox("Major", true); // CheckBox 생성
        submajor = new JCheckBox("Sub Major", false);
        interdis = new JCheckBox("Inter Disciplinary", false);

        JRadioButton single, married, divorced;
        single = new JRadioButton("Single", true); // RadioButton 생성
        married = new JRadioButton("Married", false);
        divorced = new JRadioButton("Divorced", false);

        ButtonGroup bg = new ButtonGroup(); // RadioButton이 단일선택을 하게 함
        bg.add(single);
        bg.add(married);
        bg.add(divorced);

        JToggleButton onoff;
        onoff = new JToggleButton("On/Off"); // ToggleButton 생성

        three.add(major); // 패널에 요소들 추가
        three.add(submajor);
        three.add(interdis);
        three.add(single);
        three.add(married);
        three.add(divorced);
        three.add(onoff);

        // Tab4 : CheckBoxTest.java 차용
        JPanel four = new JPanel();
        four.setLayout(new GridLayout(0, 4));
        four.setBackground(Color.blue);

        JPanel four2 = new JPanel(); // CheckBox들을 포함하기 위함
        four2.setLayout(new GridLayout(3, 0));
        four2.setBackground(Color.blue);

        for (int i = 0; i < 3; i++) {
            buttons[i] = new JCheckBox(fruits[i]);
            buttons[i].setBackground(Color.blue);
            buttons[i].addItemListener(this);
            pictureLabel[i] = new JLabel(fruits[i] + ".gif"); // 공간에 값을 집어넣는 것
            icon[i] = new ImageIcon("../java_image/" + fruits[i] + ".gif");
        }

        for (int i = 0; i < 3; i++)
            four2.add(buttons[i]);

        four.add(four2); // 패널에 요소를 추가
        four.add(pictureLabel[0]);
        four.add(pictureLabel[1]);
        four.add(pictureLabel[2]);

        // Tab5 : HW_JTextComponent.java 차용
        JPanel five = new JPanel();
        five.setLayout(new BorderLayout());
        five.setBackground(Color.magenta); // 색 적용. 하지만 요소들에 가려 보이지 않음

        JPanel user, center, end;
        JPasswordField jpf;
        JTextField jtf;
        JTextArea jta;
        JButton jb;
        JLabel id, password, press;

        id = new JLabel("ID");
        password = new JLabel("PW");
        jtf = new JTextField();
        jpf = new JPasswordField();

        user = new JPanel();
        user.setBackground(Color.magenta); // 패널의 색 설정
        user.setLayout(new GridLayout(2, 2));

        user.add(id);
        user.add(jtf);
        user.add(password);
        user.add(jpf);

        center = new JPanel();
        center.setLayout(new BorderLayout());
        center.setBackground(Color.magenta);

        center.setSize(100, 200);
        jta = new JTextArea(100, 150);
        center.add(jta, BorderLayout.CENTER);

        press = new JLabel("Press");
        jb = new JButton("OK");

        end = new JPanel();
        end.setBackground(Color.magenta);

        end.add(press);
        end.add(jb);

        five.add(user, BorderLayout.NORTH);
        five.add(center, BorderLayout.CENTER);
        five.add(end, BorderLayout.SOUTH);

        // 각각의 탭을 TabPane에 추가
        tabpane.addTab("Tab1_SMU", one);
        tabpane.addTab("Tab2", two);
        tabpane.addTab("Tab3", three);
        tabpane.addTab("Tab4", four);
        tabpane.addTab("Tab5", five);

        jf.getContentPane().add(tabpane, BorderLayout.CENTER);
        jf.setSize(400, 400);
        jf.setVisible(true);
    }

    // Tab4를 위한 이벤트 처리 메소드
    public void itemStateChanged(ItemEvent e) {
        // ImageIcon image = null;

        Object source = e.getItemSelectable(); // 셀렉한 것의 객체를 불러옴(누른 것이 무엇인지)

        for (int i = 0; i < 3; i++) {
            if (source == buttons[i]) {
                if (e.getStateChange() == ItemEvent.DESELECTED)
                    pictureLabel[i].setIcon(null);
                else
                    pictureLabel[i].setIcon(icon[i]);
            }
        }
    }

}