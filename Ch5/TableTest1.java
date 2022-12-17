package GeakPu.Ch5;

import javax.swing.*;

public class TableTest1 {

    public TableTest1(String msg) {
        JFrame jf = new JFrame(msg);

        String columnName[] = { "Name", "Phone", "E-mail" };
        String data[][] = {
                { "최민영", "010-1234-5678", "min02choi@naver.com" },
                { "최민영2", "010-1221-0710", "min02choi@sookmyung.ac.kr" },
                { "김지원", "010-2020-0208", "Kim@gmail.com" }
        };

        JTable table = new JTable(data, columnName);
        JScrollPane sp = new JScrollPane(table);

        jf.getContentPane().add(sp);
        jf.setSize(500, 500);
        ;
        jf.setVisible(true);
    }
}
