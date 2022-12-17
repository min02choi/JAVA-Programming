package GeakPu.Ch5;

import javax.swing.*;

public class JFrameTest {
    public JFrameTest(String msg) {
        JFrame jf = new JFrame(msg);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // '닫힘' 버튼을 눌렀을 때의 동작
        // jf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        jf.setSize(300, 200); // 창의 크기
        jf.setVisible(true); // 창의 가시성 여부
    }
}
