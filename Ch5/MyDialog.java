package GeakPu.Ch5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// JDialog 생성
public class MyDialog extends JDialog {
    JTextField tf;
    JButton ok;

    public MyDialog(JFrame frame, String title) {
        super(frame, title);
        setLayout(new FlowLayout());
        tf = new JTextField(20);
        add(tf);

        ok = new JButton("OK");
        add(ok);

        setSize(200, 200);

        // 버튼을 누르는 경우 action --> 창이 사라짐
        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false); // 창이 사라짐
            }
        });
    }
}
