package GeakPu.Ch6;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ColorChooser extends JFrame implements ChangeListener {
    public JColorChooser color;

    public ColorChooser() {
        setTitle("Color Chooser : CMY");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        color = new JColorChooser();
        color.getSelectionModel(); // 리스너 등록
        color.setBorder(BorderFactory.createTitledBorder("Color Select")); // 내부 타이틀 설정
        JPanel panel = new JPanel();
        panel.add(color);
        add(panel);
        pack(); // 창의 크기를 컴포넌트의 크기에 맞춤
        this.setVisible(true);
    }

    public void stateChanged(ChangeEvent e) {
        Color newColor = color.getColor();
    }
}
