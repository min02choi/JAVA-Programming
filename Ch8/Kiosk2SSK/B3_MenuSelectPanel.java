package GeakPu.Ch8.Kiosk2SSK;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class B3_MenuSelectPanel extends JPanel implements ActionListener {

    // 기본 menu 페이지
    public B3_MenuSelectPanel() {
        setBounds(0, 192, 480, 456); // 패널의 크기 지정
        setBackground(Color.GREEN);

    }

    // 버튼을 눌렀을 때의 menu 페이지
    // 이벤트를 발생시킨 버튼의 문자열을 받아옴
    //
    public B3_MenuSelectPanel(String s) {
        setBounds(0, 192, 480, 456); // 패널의 크기 지정
        setBackground(Color.GREEN);

        // 눌린 버튼의 label을 비교하여 알맞은 CataMenu 생성
        if (s.equals("닭강정")) {
            new B3a_Cata1Menu();
        } else if (s.equals("사이드")) {

        } else if (s.equals("소스")) {

        } else if (s.equals("음료")) {

        }

    }

    public void actionPerformed(ActionEvent e) {

    }

}
