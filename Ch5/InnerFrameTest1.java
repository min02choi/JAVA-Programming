package GeakPu.Ch5;

import java.awt.*;
import javax.swing.*;

public class InnerFrameTest1 {
    JDesktopPane desktop; // 모니터 역할을 하는 창
    JInternalFrame inframe; // 내부의 창
    JButton ok;

    public InnerFrameTest1(String msg) {
        JFrame jf = new JFrame(msg); // Frame 생성
        desktop = new JDesktopPane();
        inframe = new JInternalFrame("Inner Frame1", true, true, false, false);

        // 버튼 생성 후 내부 프레임에 배치
        ok = new JButton("OK");
        inframe.getContentPane().add(ok, BorderLayout.SOUTH);

        // 내부 프레임 설정
        inframe.setSize(200, 100);
        inframe.setVisible(true);
        desktop.add(inframe); // 내부프레임을 외부 프레임에 삽입
        jf.getContentPane().add(desktop, BorderLayout.CENTER);
        jf.setSize(300, 200);
        jf.setVisible(true);
    }
}
