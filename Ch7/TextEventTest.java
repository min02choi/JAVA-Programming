package GeakPu.Ch7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextEventTest implements TextListener, ActionListener {
    TextArea edit;
    Button exit;
    Frame f;

    public TextEventTest(String msg) {
        f = new JFrame(msg); // 프레임 생성
        f.setSize(300, 250);
        f.setVisible(true);

        edit = new TextArea(); // TextArea생성
        edit.addTextListener(this);

        exit = new Button("Exit"); // Button 생성
        exit.addActionListener(this);

        f.add("Center", edit);
        f.add("South", exit);
    }

    @Override
    public void textValueChanged(TextEvent e) { // text가 입력되었을 때
        System.out.println("Text Value 내용이 변경되었습니다.");
    }

    @Override
    public void actionPerformed(ActionEvent e) { // 버튼 등이 눌렸을 때
        f.setVisible(false);
        f.dispose();
        System.exit(0);
    }

}
