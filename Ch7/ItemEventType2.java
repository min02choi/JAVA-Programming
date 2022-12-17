package GeakPu.Ch7;

import java.awt.*;
import java.awt.event.*;

public class ItemEventType2 implements ActionListener, ItemListener {

    Frame f;
    Choice fruits;
    List color;
    Button exit;

    public ItemEventType2(String msg) {
        f = new Frame(msg);
        f.setSize(300, 200);

        // Choice 생성
        fruits = new Choice();
        fruits.addItemListener(this);
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");

        // List 생성
        color = new List(3, true);
        color.addItemListener(this);
        color.addActionListener(this);
        color.add("blue");
        color.add("red");
        color.add("green");
        color.add("yellow");

        // Button 생성
        exit = new Button("Exit");
        exit.addActionListener(this);

        f.add("North", fruits);
        f.add("South", color);
        f.add("East", exit);

        f.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        Object o = e.getSource(); // 객체를 불러옴

        if (o == fruits) {
            System.out.println(fruits.getSelectedItem());
        } else if (o == color) {
            Object si[] = color.getSelectedItems(); // 리턴 값을 배열로 불러들임

            System.out.println("이벤트가 발생한 아이템");
            for (int i = 0; i < si.length; i++) { // 배열을 출력
                System.out.println(si[i] + " ");
            }

            // 선택한 요소의 인덱스를 불러오고, 해당 인덱스로 선택된 요소를 출력
            System.out.println("\n----------------------------");
            System.out.println("Items event occurred");

            int index = ((Integer) e.getSource()).intValue();

            System.out.println(color.getItem(index));
            System.out.println("\n----------------------------\n");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource(); // 클릭된 객체를 불러옴
        if (o == color) { // List일 때
            System.out.println("이중 클릭된 아이템");
            System.out.println(e.getActionCommand());
        } else if (o == exit) { // Exit버튼 일 때
            f.setVisible(false);
            f.dispose();
            System.exit(0);
        }
    }
}