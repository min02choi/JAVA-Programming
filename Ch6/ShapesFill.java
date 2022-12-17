package GeakPu.Ch6;

import javax.swing.*;

public class ShapesFill extends JFrame {
    public ShapesFill() {
        setSize(600, 130);
        setTitle("Shapes Fill : CMY");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new ShapesFillPanel();
        add(panel);
        setVisible(true);
    }
}