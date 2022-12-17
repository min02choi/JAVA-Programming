package GeakPu.Ch7;

import java.awt.event.*;
import javax.swing.*;

public class ItemEventType1 implements ActionListener, ItemListener {
    JFrame f;
    JCheckBox one, two;
    JRadioButton male, female;
    ButtonGroup sex;
    JButton exit;
    JPanel n, s;

    public ItemEventType1(String msg) {
        f = new JFrame(msg);
        f.setSize(300, 200);
        f.setVisible(true);

        n = new JPanel(); // one, two 부착될 패널
        s = new JPanel(); // male, female 부착될 패널

        one = new JCheckBox("One");
        one.addItemListener(this);
        n.add(one);
        two = new JCheckBox("Two");
        two.addItemListener(this);
        n.add(two);

        exit = new JButton("Exit");
        exit.addActionListener(this);
        f.add("East", exit);

        male = new JRadioButton("Male");
        male.addItemListener(this);
        s.add(male);

        female = new JRadioButton("Female");
        female.addItemListener(this);
        s.add(female);

        f.add("North", n);
        f.add("South", s);

        sex = new ButtonGroup();
        sex.add(male);
        sex.add(female);

        f.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        Object o = e.getSource(); // 선택된 요소

        if (o == one) {
            System.out.println(e.getItem());
        } else if (o == two) {
            if (e.getStateChange() == ItemEvent.SELECTED) { // 선택된 경우
                System.out.println("two is selected");
            } else { // 선택 해제된 경우
                System.out.println("two is deselected");
            }
        }

        else if (o == male) {
            System.out.println("Male is selected");
        } else if (o == female) {
            System.out.println("Female is selected");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        f.setVisible(false); // 버튼이 눌리면 창을 숨김
        f.dispose();
        System.exit(0); // 종료
    }
}