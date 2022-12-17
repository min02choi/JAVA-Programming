package GeakPu.Ch6;

import java.awt.*;
import javax.swing.*;

public class HW_TitlePanel extends JPanel {

    public HW_TitlePanel() {

        setLayout(new BorderLayout());

        // 사진 생성(크기 변환)
        ImageIcon img = new ImageIcon("../java_image/javalogo.png");
        Image n = img.getImage();
        Image changed = n.getScaledInstance(130, 150, Image.SCALE_DEFAULT);
        ImageIcon n_img = new ImageIcon(changed);

        JLabel jl = new JLabel(n_img); // 사진을 레이블에 추가

        // 글씨 생성
        JLabel des;
        des = new JLabel(
                "<html><center>ICT융합공학부 IT공학과 2116309 최민영입니다.<br>제가 2학년 1학기에 듣는 수업은 총 6과목입니다. 총 5개의 전공과, 1개의 교양을 수강하고 있습니다. 요일별 듣는 수업의 수를 원형차트, 막대차트, 선형차트로 나타내었습니다.<br>추가로, 제 취미는 운동인데 제가 관심있는 운동 5개를 선정하여 나이 10대 때의 관심도, 20대 때의 관심도를 방사선 차트로 나타내 보았습니다.</center></html>");

        des.setHorizontalAlignment(JLabel.CENTER);

        // 이미지와 텍스트를 패널에 추가
        add(jl, BorderLayout.CENTER);
        add(des, BorderLayout.SOUTH);
    }
}
