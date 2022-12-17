package GeakPu.Ch7;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
// import java.util.Queue;

public class HW_RealCalculatorGUI_copy2 implements ActionListener {
    Frame f;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, badd, bsub, bdiv, bmul, bc, bps, bper, bp, bres;
    TextField tf;

    String v1 = "", v2 = "", op = "";

    Stack<String> op_stack = new Stack<>();
    ArrayList<String> bef_array = new ArrayList();
    int idx_array = 0;

    Queue<String> aft_queue = new LinkedList<>();

    public HW_RealCalculatorGUI_copy2() {
        f = new Frame("Calculator : CMY");
        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints constraint = new GridBagConstraints();
        f.setLayout(gridbag);

        constraint.fill = GridBagConstraints.BOTH;
        constraint.weightx = 0.0;

        constraint.gridwidth = GridBagConstraints.REMAINDER;
        // constraint.gridwidth = 4;
        // constraint.gridheight = 1;
        tf = new TextField();

        // Font f = setFont(new Font("Serif", Font.BOLD, 15));

        gridbag.setConstraints(tf, constraint);
        f.add(tf);

        constraint.weightx = 1.0;
        constraint.weighty = 1.0;

        constraint.gridwidth = 1;
        constraint.gridheight = 1;
        bc = new Button("AC");
        bc.setBackground(Color.lightGray);
        gridbag.setConstraints(bc, constraint);
        f.add(bc);

        bps = new Button("+/-");
        bps.setBackground(Color.lightGray);
        gridbag.setConstraints(bps, constraint);
        f.add(bps);

        bper = new Button("%");
        bper.setBackground(Color.lightGray);
        gridbag.setConstraints(bper, constraint);
        f.add(bper);

        constraint.gridwidth = GridBagConstraints.REMAINDER;
        bdiv = new Button("/");
        bdiv.setBackground(Color.orange);
        gridbag.setConstraints(bdiv, constraint);
        f.add(bdiv);

        b7 = new Button("7");
        constraint.gridwidth = 1;
        constraint.gridheight = 1;
        gridbag.setConstraints(b7, constraint);
        f.add(b7);

        b8 = new Button("8");
        gridbag.setConstraints(b8, constraint);
        f.add(b8);

        b9 = new Button("9");
        gridbag.setConstraints(b9, constraint);
        f.add(b9);

        constraint.gridwidth = GridBagConstraints.REMAINDER;
        bmul = new Button("*");
        bmul.setBackground(Color.orange);
        gridbag.setConstraints(bmul, constraint);
        f.add(bmul);

        constraint.gridwidth = 1;
        constraint.gridheight = 1;
        b4 = new Button("4");
        gridbag.setConstraints(b4, constraint);
        f.add(b4);

        b5 = new Button("5");
        gridbag.setConstraints(b5, constraint);
        f.add(b5);

        b6 = new Button("6");
        gridbag.setConstraints(b6, constraint);
        f.add(b6);

        constraint.gridwidth = GridBagConstraints.REMAINDER;
        bsub = new Button("-");
        bsub.setBackground(Color.orange);
        gridbag.setConstraints(bsub, constraint);
        f.add(bsub);

        constraint.gridwidth = 1;
        constraint.gridheight = 1;
        b1 = new Button("1");
        gridbag.setConstraints(b1, constraint);
        f.add(b1);

        b2 = new Button("2");
        gridbag.setConstraints(b2, constraint);
        f.add(b2);

        b3 = new Button("3");
        gridbag.setConstraints(b3, constraint);
        f.add(b3);

        constraint.gridwidth = GridBagConstraints.REMAINDER;
        badd = new Button("+");
        badd.setBackground(Color.orange);
        gridbag.setConstraints(badd, constraint);
        f.add(badd);

        constraint.gridwidth = 1;
        constraint.gridheight = 1;
        bp = new Button(".");
        gridbag.setConstraints(bp, constraint);
        f.add(bp);

        b0 = new Button("0");
        gridbag.setConstraints(b0, constraint);
        f.add(b0);

        constraint.gridwidth = GridBagConstraints.REMAINDER;
        constraint.gridwidth = 2;
        constraint.gridheight = 1;
        bres = new Button("=");
        bres.setBackground(Color.orange);
        gridbag.setConstraints(bres, constraint);
        f.add(bres);

        f.pack();
        f.setVisible(true);

        // 각 버튼에 대해 ActionListener 설정
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bdiv.addActionListener(this);
        bmul.addActionListener(this);
        bc.addActionListener(this);
        bps.addActionListener(this);
        bper.addActionListener(this);
        bp.addActionListener(this);
        bres.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand(); // 이벤트를 발생시킨 문자열을 가져옴
        String expr = ""; // 출력용 문자열

        // 문자열의 첫 번째 값(무조건 첫 번째 값일 수밖에 없음)을 불러와 수 처리 / 연산 수행

        // 값이 숫자 혹은 소숫점(".")일 때 --> 이전 숫자의 연장인지, 두 번째 피연산자의 입력인지 판단
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {

            bc.setLabel("C");

            // 수의 한자릿수 이상의 여부
            String recent = bef_array.get(idx_array);

            if (recent.equals("+") || recent.equals("-") || recent.equals("*") || recent.equals("/")) { // 연산자가 존재하는 경우
                                                                                                        // --> 새로운 수
                v2 = v2 + s;
                bef_array.add(v2);
                idx_array += 1; // 삭제할 경우를 대비한 인덱스 저장

                // 일단 저장되어있는 것을 textarea 출력(전체 수식)
                for (String i : bef_array) {
                    expr = expr + i;
                }
            } else { // 연산자가 없는 경우 --> 첫 번째 피연산자 값에 추가
                v1 = v1 + s;
                bef_array.add(v1);
                idx_array += 1;

                // 일단 저장되어있는 것을 textarea 출력
                for (String i : bef_array) {
                    expr = expr + i;
                }
            }

            tf.setText(expr); // 현재 상태 출력
        }

        // 계산 버튼("=") 일 때 --> 연산 부호에 따른 연산 수행
        else if (s.charAt(0) == '=') {

            double res; // 계산 결과 값을 저장

            // 사칙연산 부호에 따른 연산 수행 후 값 저장
            if (op.equals("+")) // 더하기
                res = (Double.parseDouble(v1) + Double.parseDouble(v2));
            else if (op.equals("-")) // 빼기
                res = (Double.parseDouble(v1) - Double.parseDouble(v2));
            else if (op.equals("*")) // 곱하기
                res = (Double.parseDouble(v1) * Double.parseDouble(v2));
            else // 나누기
                res = (Double.parseDouble(v1) / Double.parseDouble(v2));

            // 결과 값 출력
            // setText는 String만 출력하므로 res를 형변환
            tf.setText(Double.toString(res));

            // 이후 다음 연산의 첫 번째 피연산자
            // 한자리수 or 두 자리 이상의 수 판단을 다시 반복해야하므로 형변환
            v1 = Double.toString(res);

            op = v2 = ""; // 연산자와 두 번째 피연산자 초기화
        }

        // 삭제 버튼 C 일때
        else if (s.charAt(0) == 'C') {
            if (!op.equals("")) { // 연산자가 존재하는 경우 --> 두 번째 피연산자를 삭제
                v2 = "";
                tf.setText(v1 + " " + op); // 현재 상태 출력
            }

            else { // 연산자가 없는 경우 --> 첫 번째 피연산자를 삭제
                v1 = "";
                tf.setText(""); // 현재 상태 출력
            }
            bc.setLabel("AC");
        }

        // 초기화 버튼 AC 일때 --> 모든 저장된 값, 연산자 삭제
        else if (s.charAt(0) == 'A') {
            v1 = op = v2 = "";
            tf.setText("");
        }

        /*
         * // +/- 버튼일 때
         * // +/- 버튼은 해당 숫자의 부호를 바꿔줌
         * else if (s.charAt(1) == '/') {
         * if (!op.equals("")) { // 연산자가 존재하는 경우 --> 두 번째 피연산자에 대해 변환
         * if (v2.charAt(0) == '-') {
         * v2 = v2.substring(1);
         * tf.setText(v1 + " " + op + " " + v2); // 현재 상태 출력
         * } else {
         * v2 = "-" + v2;
         * tf.setText(v1 + " " + op + " " + v2); // 현재 상태 출력
         * }
         * }
         * 
         * else { // 연산자가 없는 경우 --> 첫 번째 피연산자에 대해 변환
         * if (v1.charAt(0) == '-') {
         * v1 = v1.substring(1);
         * tf.setText(v1); // 현재 상태 출력
         * } else {
         * v1 = "-" + v1;
         * tf.setText(v1); // 현재 상태 출력
         * }
         * }
         * }
         */

        // 퍼센테이지를 구하는 "%"일 때
        else if (s.charAt(0) == '%') {
            Double temp = 0.0;

            if (!op.equals("")) { // 연산자가 존재하는 경우 --> v1, v2 에 대해서
                if (op.equals("+") || op.equals("-")) {
                    temp = (Double.parseDouble(v1) * Double.parseDouble(v2)) / 100;
                } else {
                    temp = Double.parseDouble(v2) / 100;
                }
                v1 = Double.toString(temp);
                op = v2 = "";
                tf.setText(v1);

            }

            else { // 연산자가 존재하지 않는 경우 --> v1에 대해서
                temp = Double.parseDouble(v1) / 100;
                v1 = Double.toString(temp);
                tf.setText(v1);

            }
        }

        // 연산자("+", "-", "*", "/")일 때 --> 최종 연산을 위한 연산자 저장
        else {
            op = s; // 연산자 저장
            bef_array.add(op);
            idx_array += 1;

            // 일단 저장되어있는 것을 textarea 출력(전체 수식)
            for (String i : bef_array) {
                expr = expr + i;
            }

            tf.setText(expr); // 현재 상태 화면에 출력
        }

    }

}
