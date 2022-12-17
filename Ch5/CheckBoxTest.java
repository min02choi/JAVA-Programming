package GeakPu.Ch5;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
// import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckBoxTest extends JPanel implements ItemListener {
    JCheckBox[] buttons = new JCheckBox[3];
    String[] fruits = { "apple", "grape", "pear" };
    JLabel[] pictureLabel = new JLabel[3]; // 공간을 잡은 것
    ImageIcon[] icon = new ImageIcon[3];

    public CheckBoxTest() {
        super(new GridLayout(0, 4));

        // 체크 박스 생성
        for (int i = 0; i < 3; i++) {
            buttons[i] = new JCheckBox(fruits[i]);
            buttons[i].addItemListener(this);
            pictureLabel[i] = new JLabel(fruits[i] + ".gif"); // 공간에 값을 집어넣는 것
            icon[i] = new ImageIcon("../java_image/" + fruits[i] + ".gif");
        }

        JPanel jp = new JPanel(new GridLayout(0, 1));
        for (int i = 0; i < 3; i++)
            jp.add(buttons[i]);

        add(jp);
        add(pictureLabel[0]);
        add(pictureLabel[1]);
        add(pictureLabel[2]);
    }

    // 체크 박스의 아이템 이벤트를 처리
    // ItemEvent : 아이템의 이벤트를 받아들임
    public void itemStateChanged(ItemEvent e) {
        // ImageIcon image = null;

        Object source = e.getItemSelectable(); // 셀렉한 것의 객체를 불러옴(누른 것이 무엇인지)

        for (int i = 0; i < 3; i++) {
            if (source == buttons[i]) {
                if (e.getStateChange() == ItemEvent.DESELECTED)
                    pictureLabel[i].setIcon(null);
                else
                    pictureLabel[i].setIcon(icon[i]);
            }
        }
    }

}
