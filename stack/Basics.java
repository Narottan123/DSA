import java.util.*;
public class Basics {
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(32);
        st.push(90);
        st.push(5);
        //stack works in LIFO->Last In Fast Out  FILO->Fast In Last Out
        //peek -->return top most element
        System.out.println(st.peek()); //5

        //print full stack
        System.out.println(st);
        //delete from stack
        st.pop(); //delete top element from stack
        System.out.println(st);
        //size of stack
        //push,pop,peek all take O(1) time complexity
        System.out.println(st.size());

        //print first element from stack
        while(st.size()>1){
            st.pop();
        }
        System.out.println(st.peek());  //1  O(n) T.C
        //check if stack empty or not
        
    }
}
