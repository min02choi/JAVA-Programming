package GeakPu.Ch5;

import javax.swing.*;

public class TableTest2 {

    // Using array
    public TableTest2(String msg) {
        JFrame jf = new JFrame(msg);

        String columnName[] = { "Name", "Age", "E-mail" };
        Object data[][] = {
                { "Choi", new Integer(21), "Choi@sm.ac.kr" },
                { "Kim", "27", "Kim@sm.ac.kr" },
                { "Park", "25", "Park@sm.ac.kr" },
                { "Min", "39", "Min@sm.ac.kr" }
        };

        JTable table = new JTable(data, columnName);
        jf.getContentPane().add(new JScrollPane(table), "Center");

        jf.setSize(300, 200);
        ;
        jf.setVisible(true);
    }

}
