package GeakPu.Ch7;

import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Queue;

public class HW_RealCalculatorGUI_copy5 implements ActionListener {
    Frame f;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, badd, bsub, bdiv, bmul, bc, bps, bper, bp, bres;
    TextField tf;

    String v1 = "", v2 = "", op = "";

    ArrayList<String> bef_array = new ArrayList<>(); // 수식을 저장
    int idx_array = -1; // 가장 높은 원소의 idx값

    ArrayList<Button> button = new ArrayList<>();

    Stack<String> op_stack = new Stack<>(); // 연산자를 저장하는 stack
    Queue<String> postfix = new LinkedList<>(); // 후위표기식을 저장하는 queue
    Stack<String> val_stack = new Stack<>();

    int flag = 0; // "AC"와 "C"의 상태를 결정. 0일 경우 현재 "AC", 1일 경우 현재 "C"

    public HW_RealCalculatorGUI_copy5() {
        f = new Frame("Calculator : CMY");
        f.setSize(200, 300);

        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints constraint = new GridBagConstraints();
        f.setLayout(gridbag);

        Font font = new Font("Serif", Font.PLAIN, 30);

        constraint.fill = GridBagConstraints.BOTH;
        constraint.weightx = 0.0;

        constraint.gridwidth = GridBagConstraints.REMAINDER;
        // constraint.gridwidth = 4;
        // constraint.gridheight = 1;
        tf = new TextField();
        tf.setFont(font);

        // Font f = setFont(new Font("Serif", Font.BOLD, 15));

        gridbag.setConstraints(tf, constraint);
        f.add(tf);

        Dimension buttonsize = new Dimension(60, 50);

        button.add(b0);
        button.add(b1);
        button.add(b2);
        button.add(b3);
        button.add(b4);
        button.add(b5);
        button.add(b6);
        button.add(b7);
        button.add(b8);
        button.add(b9);
        button.add(badd);
        button.add(bsub);
        button.add(bdiv);
        button.add(bmul);
        button.add(bc);
        button.add(bps);
        button.add(bper);
        button.add(bp);
        button.add(bres);

        for (Button btn : button) {
            btn.addActionListener(this); // 각 버튼에 대해 ActionListener 설정
            btn.setPreferredSize(buttonsize);
            btn.setFont(font);

        }

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
        b1.setFont(font);
        gridbag.setConstraints(b1, constraint);
        f.add(b1);

        b2 = new Button("2");
        b2.setFont(font);
        gridbag.setConstraints(b2, constraint);
        f.add(b2);

        b3 = new Button("3");
        b3.setFont(font);
        gridbag.setConstraints(b3, constraint);
        f.add(b3);

        constraint.gridwidth = GridBagConstraints.REMAINDER;
        badd = new Button("+");
        badd.setBackground(Color.orange);
        badd.setFont(font);
        gridbag.setConstraints(badd, constraint);
        f.add(badd);

        constraint.gridwidth = 1;
        constraint.gridheight = 1;
        bp = new Button(".");
        bp.setFont(font);
        gridbag.setConstraints(bp, constraint);
        f.add(bp);

        b0 = new Button("0");
        b0.setFont(font);
        gridbag.setConstraints(b0, constraint);
        f.add(b0);

        constraint.gridwidth = GridBagConstraints.REMAINDER;
        constraint.gridwidth = 2;
        constraint.gridheight = 1;
        bres = new Button("=");
        bres.setBackground(Color.orange);
        bres.setFont(font);
        gridbag.setConstraints(bres, constraint);
        f.add(bres);

        f.pack();
        f.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand(); // 이벤트를 발생시킨 문자열을 가져옴
        String expr = ""; // 출력용 문자열

        // 숫자나 .을 입력한 경우
        // 이전 숫자의 연장인지, 새로운 수의 입력인지 판단
        // 판단은 arraylist의 가장 최근 요소가 숫자인지의 여부로 판단
        // (1) 숫자인 경우 --> 이전 수의 연장
        // (2) 숫자가 아닌 경우(연산자인 경우) --> 새 수의 입력
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
            bc.setLabel("C");

            if (idx_array == -1) {
                bef_array.add(s);
                idx_array += 1;
            }

            else {
                String last = bef_array.get(idx_array); // 마지막 요소를 불러옴

                // 숫자이거나 .인 경우 --> 이전 수의 연장
                // top의 인덱스 값에서 연산이 이루어짐 : 인덱스 변경 X
                if (last.charAt(0) >= '0' && last.charAt(0) <= '9' || last.charAt(0) == '.') {
                    last = last + s; // 이전 값에 추가
                    bef_array.set(idx_array, last); // 수식의 가장 마지막 값 갱신
                }

                // 숫자가 아닌 경우(연산자인 경우) --> 새 수의 입력
                // top + 1 의 인덱스 값에서 연산이 이루어짐 : 인덱스 변경(++) 필요
                else {
                    idx_array += 1; // top증가 후 연산자 추가
                    bef_array.add(s); // 연산자 추가
                }

            }

            // 화면에 현재 상태 문자열 출력
            expr = ""; // 문자열 비움
            for (String i : bef_array) {
                expr = expr + i;
            }

            tf.setText(expr);
        }

        // 사칙 연산자를 입력한 경우 --> ArrayList에 추가
        else if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
            idx_array += 1;
            bef_array.add(s);

            // 화면에 현재 상태 문자열 출력
            expr = ""; // 문자열 비움
            for (String i : bef_array) {
                expr = expr + i;
            }
            tf.setText(expr);
        }

        // 결과 "="를 누른 경우 --> 연산
        // 저장되어있는 중위표기수식(bef_array)을 후위표기수식()으로 변환
        // 후위표기수식 연산
        else if (s.equals("=")) {
            // 후위표기식으로 변환
            for (String i : bef_array) {
                // 값이 숫자인 경우 --> queue에 삽입
                if (i.charAt(0) >= '0' && i.charAt(0) <= '9') {
                    postfix.add(i);
                }
                // 값이 연산자인 경우 --> 우선순위 판단 후 연산자 stack에 삽입
                else {

                    int bef;
                    int aft;

                    // 스택의 요소와 우선순위 비교
                    // 스택이 비어있는 경우 --> 현재연산자를 스택에 삽입
                    if (op_stack.isEmpty()) {
                        bef = 0;
                        aft = 1;
                    }

                    // 스택이 비어있지 않은 경우 --> 연산자 우선순위 비교
                    else {
                        // 스택에 있던 연산자
                        if ((op_stack.peek() == "+" || op_stack.peek() == "-")) {
                            bef = 1;
                        } else {
                            bef = 2;
                        }

                        // 새로운 연산자
                        if (i.equals("+") || i.equals("-")) {
                            aft = 1;
                        } else {
                            aft = 2;
                        }

                    }

                    // 우선순위에 따른 연산자 처리
                    // 우선순위가 높은 경우 --> 스택에 push
                    if (aft > bef) {
                        op_stack.push(i); // 스택에 추가
                    }
                    // 우선순위가 동일한 경우 --> 기존 연산자를 빼내고, 새 연산자를 스택에 삽입
                    else if (aft <= bef) {
                        String temp = op_stack.pop(); // 기존 연산자 빼냄
                        postfix.add(temp); // 후위표기식에 넣음

                        op_stack.push(i); // 스택에 추가
                    }
                    // 우선순위가 작은 경우 --> 연산자를 postfix에 추가
                    else {

                        postfix.add(i);
                    }
                }
            }

            // 연산자 스택에 남아있는 연산자를 postfix에 추가
            while (!op_stack.isEmpty()) {
                postfix.add(op_stack.pop());
            }

            // 후위표기식 완성

            // 후위표기식의 계산
            // queue의 각 원소에 대해
            // (1) 숫자인 경우 --> stack에 push
            // (2) 연산자의 경우 --> stack에서 원소 두개 꺼내 연산 수행
            for (String i : postfix) {
                // i = postfix.poll();
                if (i == null) { // 빼낸 값이 없을 때
                    break;
                }

                // 숫자인 경우 --> stack에 push
                if (i.charAt(0) >= '0' && i.charAt(0) <= '9') {
                    val_stack.push(i);
                }

                // 연산자인 경우 --> 값 두개 꺼내 연산 수행후 다시 스택에 삽입
                else {
                    Double temp;
                    double v2 = Double.valueOf(val_stack.pop());
                    double v1 = Double.valueOf(val_stack.pop());

                    if (i == "+") {
                        temp = v1 + v2;
                        val_stack.push(temp.toString());
                    } else if (i == "-") {
                        temp = v1 - v2;
                        val_stack.push(temp.toString());
                    } else if (i == "*") {
                        temp = v1 * v2;
                        val_stack.push(temp.toString());
                    } else if (i == "/") {
                        temp = v1 / v2;
                        val_stack.push(temp.toString());
                    }

                }

            }

            String res = val_stack.pop(); // 최종 값을 꺼냄
            bef_array.clear();
            bef_array.add(res); // 수식 저장 ArrayList에 추가

            // 다음 연산을 위해 사용한 요소 초기화
            v1 = v2 = op = "";
            idx_array = 0; // 연산을 한 경우 하나의 값이
            op_stack.clear();
            postfix.clear();
            val_stack.clear();

            // 화면에 현재 상태 문자열 출력
            expr = ""; // 문자열 비움
            for (String i : bef_array) {
                expr = expr + i;
            }
            tf.setText(expr);

        }

        // "AC"를 누른 경우 --> 전체 초기화
        else if (s.equals("AC")) {
            v1 = v2 = op = "";
            bef_array.clear();
            expr = ""; // 문자열 비움
            tf.setText("");

        }

        // "C"를 누른 경우 --> 가장 최근의 값 삭제
        // 최대 한 번까지 삭제가 가능
        else if (s.equals("C")) {
            bef_array.remove(idx_array);
            idx_array -= 1;
            bc.setLabel("AC");

            // 화면에 현재 상태 문자열 출력
            expr = ""; // 문자열 비움
            for (String i : bef_array) {
                expr = expr + i;
            }
            tf.setText(expr);
        }

        // "+/-"를 누른 경우 --> 가장 최근 value값의 부호를 바꿔줌
        else if (s.equals("+/-")) {
            String j = bef_array.get(idx_array);
            if ((j.charAt(0) >= '0' && j.charAt(0) <= '9') || j.charAt(0) == '-') {
                Double tem = Double.parseDouble(j);
                tem = Double.parseDouble(j) * (-1);

                bef_array.set(idx_array, tem.toString());

                // 화면에 현재 상태 문자열 출력
                expr = ""; // 문자열 비움
                for (String i : bef_array) {
                    expr = expr + i;
                }
                tf.setText(expr);
            }
            bc.setLabel("C");

        }

        // "%"를 누른 경우 --> 가장 최근 value의 퍼센테지를 구해줌
        // 스택의 가장 마지막 원소가 숫자일 경우에만 실행
        else if (s.equals("%")) {
            String j = bef_array.get(idx_array);
            if (j.charAt(0) >= '0' && j.charAt(0) <= '9') {
                Double tem = Double.parseDouble(j) / 100;
                bef_array.set(idx_array, tem.toString());

                // 화면에 현재 상태 문자열 출력
                expr = ""; // 문자열 비움
                for (String i : bef_array) {
                    expr = expr + i;
                }
                tf.setText(expr);
            }
            bc.setLabel("C");
        }

    }
}

// 창 크기 변경
// 텍스트area 크기 변경
// 글씨체 변경
// textarea 임의 수정 불가하게끔
// x누르면 창이 닫히고, 시스템 종료(선택)
// 텍스트 오른쪽 정렬