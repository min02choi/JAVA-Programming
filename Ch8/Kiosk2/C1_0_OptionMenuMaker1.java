package GeakPu.Ch8.Kiosk2;

import java.awt.*;
import javax.swing.*;

// 닭강정의 옵션
// 매개변수 이름, 이미지
public class C1_0_OptionMenuMaker1 extends JButton {
    // 일단은 매개변수로 이미지는 파일 경로 전달
    public C1_0_OptionMenuMaker1(String name, String image) {

        // 이미지 크기 조절
        ImageIcon img = new ImageIcon(image);
        Image n = img.getImage();
        Image changed = n.getScaledInstance(96, 96, Image.SCALE_DEFAULT);
        ImageIcon menu_image = new ImageIcon(changed);

        JLabel imgpanel = new JLabel(menu_image);

        // 메뉴의 이름
        JLabel menu_name;
        menu_name = new JLabel(name);
        Font n_font = new Font("Serif", Font.BOLD, 15);
        menu_name.setFont(n_font);
        menu_name.setHorizontalAlignment(JLabel.CENTER);

        setLayout(null);
        imgpanel.setBounds(0, 0, 96, 96);
        add(imgpanel);
        menu_name.setBounds(0, 96, 96, 24);
        add(menu_name);

    }
}
