package GeakPu.Ch5;

import javax.swing.*;

class JMenuInt {

    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setSize(350, 250);
        f.setLayout(null);
        f.setVisible(true);

        JMenuBar m = new JMenuBar();
        f.setJMenuBar(m);

        JMenu m_file = new JMenu("파일");
        JMenu m_edit = new JMenu("편집");

        m.add(m_file);
        m.add(m_edit);
    }
}