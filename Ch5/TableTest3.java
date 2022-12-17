package GeakPu.Ch5;

//import javax.swing.*;
import javax.swing.table.*;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.*;

public class TableTest3 {
    JTable table;
    JFrame jf;
    TableModel tm;

    public TableTest3(String msg) {
        jf = new JFrame(msg);
        // tm = new TableModel(); // 테이블 모델 생성
        table = new JTable(tm);

        // tm = table.getModel(); // ???

        setUpDeptColumn(table.getColumnModel().getColumn(2));
        jf.getContentPane().add(new JScrollPane(table), "Center");
        jf.setSize(300, 300);
        jf.setVisible(true);
    }

    public void setUpDeptColumn(TableColumn deptColumn) {
        JComboBox comboBox = new JComboBox();
        comboBox.addItem("Dev.");
        comboBox.addItem("Research");
        comboBox.addItem("Finance");
        deptColumn.setCellEditor(new DefaultCellEditor(comboBox));

        DefaultTableCellRenderer render = new DefaultTableCellRenderer();
        render.setToolTipText("Click for combo box");
        deptColumn.setCellRenderer(render);

        TableCellRenderer headerRenderer = deptColumn.getHeaderRenderer();
        if (headerRenderer instanceof DefaultTableCellRenderer) {
            ((DefaultTableCellRenderer) headerRenderer).setToolTipText("Click the Dept to see a list.");
        }
    }

}
