package GeakPu.Ch6;

import javax.swing.*;

public class TextureRenderingMain extends JFrame {
    public TextureRenderingMain() {
        setSize(900, 900);
        setTitle("Texture Rendering : CMY");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new TextureRendering();
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextureRenderingMain();
    }
}
