package GeakPu.Ch5;

import javax.swing.*;

public class JMenuTest1 {
    JMenuBar bar;
    JMenu file, style;
    JMenuItem fileNew;
    JCheckBoxMenuItem num;
    JRadioButtonMenuItem dos, linux;
    JFrame jf;

    public JMenuTest1(String msg) {
        jf = new JFrame(msg);
        makeMenu();

        jf.setSize(400, 400);
        jf.setLayout(null);

        jf.setVisible(true);

    }

    void makeMenu() {
        bar = new JMenuBar();
        file = new JMenu("File");
        file.setMnemonic('F');
        fileNew = new JMenuItem("New");
        file.add(fileNew);
        file.addSeparator();

        num = new JCheckBoxMenuItem("Line Num");
        style = new JMenu("Style");

        file.add(num);
        file.add(style);

        dos = new JRadioButtonMenuItem("Window Style", true);
        linux = new JRadioButtonMenuItem("Linux Style");

        ButtonGroup bg = new ButtonGroup();
        bg.add(dos);
        bg.add(linux);

        style.add(dos);
        style.add(linux);

        bar.add(file);

        jf.setJMenuBar(bar);
    }

}
