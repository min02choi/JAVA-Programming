package GeakPu.Ch5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JMenuTest2 implements ActionListener {
    JMenuBar bar;
    JMenu file, style; // MenuBar 밑의 메뉴
    JMenuItem fileNew;
    JCheckBoxMenuItem lineNum;
    JRadioButtonMenuItem windows, linux; // style 하위 버튼
    JFrame jf;

    public JMenuTest2(String msg) {
        jf = new JFrame(msg);
        makeMenu();
        jf.setSize(500, 500);
        jf.setVisible(true);
    }

    void makeMenu() {
        bar = new JMenuBar();
        file = new JMenu("File");
        file.setMnemonic('F');
        fileNew = new JMenuItem("New");
        file.add(fileNew);
        file.addSeparator();

        lineNum = new JCheckBoxMenuItem("Line Num");
        style = new JMenu("Style");

        file.add(lineNum);
        file.add(style);

        windows = new JRadioButtonMenuItem("Window Style", true);
        linux = new JRadioButtonMenuItem("Linux Style");

        file.addActionListener(this);
        style.addActionListener(this);
        lineNum.addActionListener(this);
        windows.addActionListener(this);
        linux.addActionListener(this);
        fileNew.addActionListener(this);

        ButtonGroup bg = new ButtonGroup();
        bg.add(windows);
        bg.add(linux);

        style.add(windows);
        style.add(linux);

        bar.add(file);

        jf.setJMenuBar(bar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o == file) {
            System.out.println("File");
        } else if (o == style) {
            System.out.println("Style");
        } else if (o == fileNew) {
            System.out.println("New");
        } else if (o == lineNum) {
            if (lineNum.isSelected())
                System.out.println("Line Number");
        } else if (o == windows) {
            System.out.println("Windows");
        } else if (o == linux) {
            System.out.println("Linux");
        }

    }
}
