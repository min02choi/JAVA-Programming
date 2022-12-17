package GeakPu.Ch8.Kiosk2SSK;

import java.awt.*;
import javax.swing.*;

public class B3_0_MenuMaker extends JButton {

    public B3_0_MenuMaker(String name, String price, String image) {

        // 이미지 크기 조절
        ImageIcon img = new ImageIcon(image);
        Image n = img.getImage();
        Image changed = n.getScaledInstance(120, 132, Image.SCALE_DEFAULT);
        ImageIcon menu_image = new ImageIcon(changed);

        // 메뉴의 이름
        JLabel menu_name;
        menu_name = new JLabel(name);
        Font n_font = new Font("Serif", Font.BOLD, 20);
        menu_name.setFont(n_font);
        menu_name.setHorizontalAlignment(JLabel.CENTER);

        // 메뉴의 가격
        JLabel menu_price;
        menu_price = new JLabel(price);
        Font p_font = new Font("Serif", Font.BOLD, 20);
        menu_price.setFont(p_font);
        menu_price.setHorizontalAlignment(JLabel.CENTER);

        setLayout(null);
        setIcon(menu_image);
        setPreferredSize(new Dimension(120, 192));

        menu_name.setBounds(24, 108, 72, 36); // 먹힘. 즉 버튼에 대해서
        menu_price.setBounds(12, 156, 96, 24); // 먹힘. 즉 버튼에 대해서
        // jb.add(menu_image, BorderLayout.NORTH);
        add(menu_name);
        add(menu_price);

    }
}
