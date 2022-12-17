package GeakPu.Ch4;

import java.awt.*;

public class FlowTestTwo {
    Frame f;

    public FlowTestTwo() {
        f = new Frame("FlowTestTwo");

        f.setLayout(new FlowLayout());
        f.add(new Button("1"));
        f.add(new Button("2"));
        f.add(new TextField("3", 3));
        f.add(new Button("4"));
        f.add(new List(5, true));
        f.add(new Button("6"));
        f.add(new Button("7")).setVisible(false);
        f.add(new Label("8"));
        f.add(new Button("9"));
        f.add(new TextArea("10", 3, 4));
        f.add(new Button("11"));
        f.setSize(500, 200);
        f.setVisible(true);
    }
}