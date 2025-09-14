import java.util.*;

public class DisplayStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        Stack<Integer> rt = new Stack<>();
        // now empty st stack and put into new rt stack;
        while (st.size() > 0) {
            rt.push(st.pop());
        }
        while (rt.size() > 0) {
            int x = rt.pop();
            System.out.println(x);
            st.push(x);
        }
        System.out.println(st);
    }
}
