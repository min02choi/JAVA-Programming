package GeakPu.Ch6;

import javax.swing.*;

public class MyPanelMain {
    MyPanelMain(String msg) {
        JFrame f = new JFrame(msg); // 그림이 그려질 창 생성
        f.add(new MyPanel()); // create My Draw class
        f.setSize(300, 200); // 창의 크기
        f.setVisible(true);
    }
}
