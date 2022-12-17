package GeakPu.Ch8.Kiosk2;

import javax.swing.JButton;
import javax.swing.JPanel;

public class B0_KioskMenuPanel extends JPanel {

    JPanel headpanel, categorypanel, menuselectpanel, bottombarpanel, mostbottompanel;

    public B0_KioskMenuPanel() {
        setSize(480, 864);
        setLayout(null);

        // 궁금증 : 근데 HeadPanel에서 setBounds로 크기 지정해줘도 여기서 또해?
        // 일단 다 써놔보고 하나씩 지워서 상태 확인
        headpanel = new B1_HeadPanel();
        headpanel.setBounds(0, 0, 480, 120);
        add(headpanel);
        /*
         * categorypanel = new B2_CategoryPanel();
         * categorypanel.setBounds(0, 120, 480, 72);
         * add(categorypanel);
         */

        /*
         * categorypanel = new B2_CategoryPanel();
         * categorypanel.setBounds(0, 120, 480, 72);
         * add(categorypanel);
         */
        menuselectpanel = new B3_MenuSelectPanel();
        menuselectpanel.setBounds(0, 192, 480, 456);
        add(menuselectpanel);

        bottombarpanel = new B4_BottomBarPanel();
        bottombarpanel.setBounds(0, 648, 480, 48);
        add(bottombarpanel);

        mostbottompanel = new B5_MostBottomPanel();
        mostbottompanel.setBounds(0, 696, 480, 168);
        add(mostbottompanel);

        JButton cate1 = new JButton("닭강정");
        cate1.setBounds(36, 132, 84, 48);
        add(cate1);

    }
}
