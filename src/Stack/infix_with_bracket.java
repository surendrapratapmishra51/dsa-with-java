package Stack;

import java.util.Scanner;
import java.util.Stack;

public class infix_with_bracket {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 48 && ascii <= 57){
                // integer
                st.push(ascii - 48);
            }
            else if(op.size() == 0 || ch == '(' || op.peek() == '(') {
            op.push(ch);
            }
            else if (ch == ')') {
                while (op.peek() != '('){
                    int v2 = st.pop();
                    int v1 = st.pop();
                    if(op.peek() == '-') st.push(v1-v2);
                    if(op.peek() == '+') st.push(v1+v2);
                    if(op.peek() == '*') st.push(v1*v2);
                    if(op.peek() == '/') st.push(v1/v2);
                    op.pop();

                }
                op.pop();
                
            }
            else {
                if (ch == '-' || ch == '+') {
                    int v2 = st.pop();
                    int v1 = st.pop();
                    if (op.peek() == '-') st.push(v1 - v2);
                    if (op.peek() == '+') st.push(v1 + v2);
                    if (op.peek() == '*') st.push(v1 * v2);
                    if (op.peek() == '/') st.push(v1 / v2);
                    op.pop();
                    op.push(ch);
                } else if (ch == '*' || ch == '/') {

                    if (op.peek() == '*' || op.peek() == '/') {
                        int v2 = st.pop();
                        int v1 = st.pop();
                        if (op.peek() == '*') st.push(v1 * v2);
                        if (op.peek() == '/') st.push(v1 / v2);
                        op.pop();
                        op.push(ch);
                    } else {
                        op.push(ch);
                    }

                }
            }

        }
        while(st.size() > 1){

            int v2 = st.pop();
            int v1 = st.pop();
            if(op.peek() == '-') st.push(v1 - v2);
            if(op.peek() == '+') st.push(v1 + v2);
            if(op.peek() == '*') st.push(v1 * v2);
            if(op.peek() == '/') st.push(v1 / v2);
            op.pop();
        }
        System.out.println(st.peek());
    }
}
