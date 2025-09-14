import java.util.*;

public class InfixToPrefix {
    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6";
        Stack<String> val = new Stack<>();
        Stack<Character> operator = new Stack<>();
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            int ascii = (int) ch;
            // if ch between 0 to 9
            if (ascii >= 48 && ascii <= 57) {
                String s = "" + ch;
                val.push(s);
            } else if (operator.size() == 0 || ch == '(' || operator.peek() == '(') {
                operator.push(ch);
            } else if (ch == ')') {
                while (operator.peek() != '(') {
                    // work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = operator.pop();
                    String t = o + v1 + v2;
                    val.push(t);
                }
                operator.pop(); // remove '(' 
            } else {
                if (ch == '+' || ch == '-') {
                    // work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = operator.pop();
                    String t = o + v1 + v2;
                    val.push(t);
                    // push
                    operator.push(ch);
                }
                if (ch == '*' || ch == '/') {
                    if (operator.peek() == '*' || operator.peek() == '/') {
                        // work
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = operator.pop();
                        String t = o + v1 + v2;
                        val.push(t);
                        // push
                        operator.push(ch);
                    } else {
                        operator.push(ch);
                    }
                }
            }
            // value stack size >1

        }
        while (val.size() > 1) {
            String v2 = val.pop();
            String v1 = val.pop();
            char o = operator.pop();
            String t = o + v1 + v2;
            val.push(t);
        }
        System.out.println(val.peek());
    }
}
