package GeakPu.Ch5;

import java.awt.event.*;
import javax.swing.*;

public class DialogCall extends JFrame {
    MyDialog dialog; // JDialog
    JButton btn;

    // DialogCall 생성자 생성
    public DialogCall() {
        super("Dialog Call : CMY");
        btn = new JButton("Show Dialog");
        dialog = new MyDialog(this, "Test Dialog");

        // 버튼을 누른 경우 action --> MyDialog 생성
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(true); // MyDialog 창이 보이게 됨
            }
        });

        getContentPane().add(btn);
        setSize(300, 300);
        setVisible(true);
    }

}
