package GeakPu.Ch4;

import java.awt.*;
import java.awt.event.*;

// event 처리 interface 상속
public class PopupTest extends Frame implements ActionListener {
    PopupMenu popup;
    Frame f;
    Button b;

    public PopupTest() {
        f = new Frame("Popup Test");
        b = new Button("POPUPTEST");

        
        b.addActionListener(this);      // event를 받을 준비
        
        popup = new PopupMenu ("POP UP");
        popup.add(new MenuItem ("copy"));
        popup.add(new MenuItem ("paste"));

        Menu col = new Menu("color");
        col.add(new MenuItem ("white"));
        col.add(new MenuItem ("blue"));
        
        popup.add(col);
        b.add(popup);
        f.add("Center", b);
        f.setSize(300, 200);
        f.setVisible(true);
    }

        // implementation for ActionListener
        // overriding for methods that efined in ActionListener interface
        // event에 대한 구현
        public void actionPerformed (ActionEvent e) {
        popup.show(b, 10, 10);
    }
}