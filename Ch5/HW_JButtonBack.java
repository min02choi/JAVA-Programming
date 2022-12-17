package GeakPu.Ch5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HW_JButtonBack implements ActionListener {
    JFrame jf;
    JPanel jp;
    JLabel jl;
    JButton jb1, jb2;

    public HW_JButtonBack(String msg) {
        jf = new JFrame(msg);
        jf.setLayout(new BorderLayout());
        jf.setTitle("JButton Event Test : CMY");
        jf.setSize(300, 250);

        jp = new JPanel();
        jl = new JLabel("Click JButton to see Image");
        jb1 = new JButton("See Image!!");

        jp.add(jl);
        jp.add(jb1);

        // jp2 = new JPanel();

        jb2 = new JButton("go back");

        /*
         * ImageIcon icon = new ImageIcon("../java_image/baldeagle.png");
         * Image img = icon.getImage();
         * Image changeImg = img.getScaledInstance(250, 300, Image.SCALE_DEFAULT);
         * ImageIcon n_icon = new ImageIcon(changeImg);
         * 
         * // jl.setIcon(n_icon);
         */

        jb1.addActionListener(this);
        jb2.addActionListener(this);

        jp.add(jl);
        jp.add(jb1);
        jf.add(jp, BorderLayout.SOUTH);
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ImageIcon eagle = new ImageIcon("../java_image/baldeagle.png");
        Image img = eagle.getImage();
        Image changeImg = img.getScaledInstance(250, 300, Image.SCALE_DEFAULT);
        ImageIcon n_eagle = new ImageIcon(changeImg);

        if (e.getSource() == jb1) {
            jl.remove(jb1);
            jl.add(jb2);
            jl.setIcon(n_eagle);
            // jl.setText("Bald Eagle");
            jb2.setText("Good Luck");
            jl.setText("초기화면으로 돌아가려면 버튼을 누르세요.");

        }

        else if (e.getSource() == jb2) {
            jl.remove(jb2);
            jl.add(jb1);
            // jl.remove(n_eagle);
        }

    }
}