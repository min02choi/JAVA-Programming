package GeakPu.Ch7;

import java.awt.*;
import java.awt.event.*;

public class ButtonEvent implements ActionListener {
    Frame f;
    Button test, exit;

    public ButtonEvent(String msg) {
        f = new Frame(msg); // 프레잉 생성

        test = new Button("Test"); // 버튼 생성
        test.addActionListener(this); // 버튼에 대한 이벤트 등록

        exit = new Button("Exit"); // 버튼 생성
        exit.addActionListener(this); // 버튼에 대한 이벤트 등록

        // 프레임에 부착
        f.add("North", test);
        f.add("South", exit);

        f.setSize(300, 200);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == test) { // test 선택 시
            System.out.println("Button Event Test Message"); // 메세지 출력
        } else if (e.getSource() == exit) { // exit 선택 시
            f.setVisible(false); // 창 감춤
            f.dispose(); // 창 종료
            System.exit(0); // 시스템 종료
        }
    }
}