package GeakPu.Ch5;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class JFileChooserTest {
    JFrame jf;

    public JFileChooserTest(String msg) {
        JFrame jf = new JFrame();
        jf.setTitle(msg);
        // window.setVisible(true);
        JFileChooser fileChooser = new JFileChooser();

        // 파일오픈 다이얼로그를 띄움
        int result = fileChooser.showOpenDialog(jf);

        /*
         * if (result == JFileChooser.APPROVE_OPTION) {
         * // 선택한 파일의 경로 반환
         * File selectedFile = fileChooser.getSelectedFile();
         * // 선택한 파일의 경로 출력
         * System.out.println(selectedFile);
         * }
         */
    }
}
