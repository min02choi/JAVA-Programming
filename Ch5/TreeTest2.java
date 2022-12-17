package GeakPu.Ch5;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

public class TreeTest2 {
    JFrame jf;
    JTree tree;

    public TreeTest2(String msg) {

        // Frame 생성
        jf = new JFrame(msg);

        // tree node 생성
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("ROOT");
        DefaultMutableTreeNode parent = new DefaultMutableTreeNode("PARENT");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("CHILD1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("CHILD2");

        // 노드 간의 계층 생성
        parent.add(child1);
        parent.add(child2);
        root.add(parent);

        // Tree 생성
        tree = new JTree(root);

        JScrollPane sp = new JScrollPane(tree);

        // 노드의 아이콘을 변경
        DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
        renderer.setLeafIcon(new ImageIcon("../java_image/d.png"));
        renderer.setClosedIcon(new ImageIcon("../java_image/f.png"));
        renderer.setOpenIcon(new ImageIcon("../java_image/f.png"));
        tree.setCellRenderer(renderer);
        tree.setEditable(true);

        jf.getContentPane().add(sp, "Center");
        jf.setSize(300, 200);
        jf.setVisible(true);

    }
}
