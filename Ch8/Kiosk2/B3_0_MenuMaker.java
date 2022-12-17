package GeakPu.Ch8.Kiosk2;

import java.awt.*;
import javax.swing.*;

public class B3_0_MenuMaker extends JButton {

    public B3_0_MenuMaker(String name, String price, String image) {

        // 이미지 크기 조절
        ImageIcon img = new ImageIcon(image);
        Image n = img.getImage();
        Image changed = n.getScaledInstance(120, 120, Image.SCALE_DEFAULT);
        ImageIcon menu_image = new ImageIcon(changed);

        JLabel imgpanel = new JLabel(menu_image);

        // 메뉴의 이름
        JLabel menu_name;
        menu_name = new JLabel(name);
        Font n_font = new Font("돋움", Font.BOLD, 16);
        menu_name.setFont(n_font);
        menu_name.setHorizontalAlignment(JLabel.CENTER);

        // 메뉴의 가격
        JLabel menu_price;
        menu_price = new JLabel(price);
        Font p_font = new Font("돋움", Font.PLAIN, 15);
        menu_price.setFont(p_font);
        menu_price.setHorizontalAlignment(JLabel.CENTER);

        setLayout(null);
        imgpanel.setBounds(0, 0, 120, 120);
        // setPreferredSize(new Dimension(120, 192));

        menu_name.setBounds(24, 120, 72, 36); // 먹힘. 즉 버튼에 대해서
        menu_price.setBounds(12, 160, 96, 24); // 먹힘. 즉 버튼에 대해서
        // jb.add(menu_image, BorderLayout.NORTH);
        add(imgpanel);
        add(menu_name); // 어칼꺼. 가리는데
        add(menu_price);

    }
}
