package GeakPu.Ch7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonEventType3 extends JPanel implements ActionListener {
    // double A, B, C;

    JButton[][] buttons = new JButton[3][3];
    char[][] board = new char[3][3];
    private char turn = 'X'; // 초기 버튼 값. 이추 O와 번갈아짐

    public ButtonEventType3() {
        setLayout(new GridLayout(3, 3, 5, 5));
        Font f = new Font("Dialog", Font.ITALIC, 50);

        // 각 셀에 버튼 추가, 폰트 설정, 액션리스너 설정, 패널에 추가
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton(" ");
                buttons[i][j].setFont(f);
                buttons[i][j].addActionListener(this);
                add(buttons[i][j]);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // 눌려진 버튼이 해당 위치의 버튼인지 판단과 동시에 버튼에 text가 없을 때
                if (e.getSource() == buttons[i][j] && buttons[i][j].getText().equals(" ") == true) {
                    if (turn == 'X') { // 'X'인 경우 --> 'O'로 변경
                        buttons[i][j].setText("X");
                        turn = 'O';
                    } else { // 'O'인 경우 --> 'X'로 변경
                        buttons[i][j].setText("O");
                        turn = 'X';
                    }
                }
            }
        }
    }
}
