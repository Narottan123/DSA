import java.util.*;

public class Infix {
    public static void main(String[] args) {
        String str = "9-5+3*4/6";
        Stack<Integer> val = new Stack<>();
        Stack<Character> operator = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // find ascii value of character
            int ascii = (int) ch;
            // '0'->48 '9'->57
            if (ascii >= 48 && ascii <= 57) {
                val.push(ascii - 48);
            } else if (operator.size() == 0) {
                operator.push(ch);
            } else {
                // if top level character is higher or equal precedence in that case do that
                if (ch == '+' || ch == '-') {
                    // work
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if (operator.peek() == '-')
                        val.push(v1 - v2);
                    if (operator.peek() == '+')
                        val.push(v1 + v2);
                    if (operator.peek() == '*')
                        val.push(v1 * v2);
                    if (operator.peek() == '/')
                        val.push(v1 / v2);
                    operator.pop();
                    // push
                    operator.push(ch);
                }
                if (ch == '*' || ch == '/') {
                    if (operator.peek() == '*' || operator.peek() == '/') {
                        // work
                        int v2 = val.pop();
                        int v1 = val.pop();
                        if (operator.peek() == '*')
                            val.push(v1 * v2);
                        if (operator.peek() == '/')
                            val.push(v1 / v2);
                        operator.pop();
                        // push
                        operator.push(ch);
                    } else {
                        operator.push(ch);
                    }
                }
            }
        }

        // value stack size greater than 1
        while (val.size() > 1) {
            int v2 = val.pop();
            int v1 = val.pop();
            if (operator.peek() == '-')
                val.push(v1 - v2);
            if (operator.peek() == '+')
                val.push(v1 + v2);
            if (operator.peek() == '*')
                val.push(v1 * v2); 
            if (operator.peek() == '/')
                val.push(v1 / v2);
            operator.pop();
        }
        System.out.println(val.peek());
    }
}
