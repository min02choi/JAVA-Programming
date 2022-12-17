package GeakPu.Ch8.Kiosk;

import java.awt.*;
import javax.swing.*;

public class EachMenu extends JButton {

    static JButton jb;

    public EachMenu() {

    }

    public static JButton createMenu(String name, String price, String image) {

        // 이미지 크기 조절
        ImageIcon img = new ImageIcon(image);
        Image n = img.getImage();
        Image changed = n.getScaledInstance(120, 132, Image.SCALE_DEFAULT);
        ImageIcon menu_image = new ImageIcon(changed);

        // 메뉴의 이름
        JLabel menu_name;
        menu_name = new JLabel(name);
        Font n_font = new Font("Serif", Font.BOLD, 24);
        menu_name.setFont(n_font);

        // 메뉴의 가격
        JLabel menu_price;
        menu_price = new JLabel(price);
        Font p_font = new Font("Serif", Font.BOLD, 24);
        menu_price.setFont(p_font);

        jb = new JButton(); // 버튼에 이미지 설정
        jb.setPreferredSize(new Dimension(120, 192));
        jb.setLayout(new BorderLayout());

        jb.setIcon(menu_image);
        // jb.add(menu_image, BorderLayout.NORTH);
        jb.add(menu_name, BorderLayout.CENTER);
        jb.add(menu_price, BorderLayout.SOUTH);

        return jb;
    }
}
