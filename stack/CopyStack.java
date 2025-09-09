import java.util.*;

public class CopyStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n;
        System.out.println("Enter number elements want to insert");
        n = sc.nextInt();
        System.out.println("Enter  elements");
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);

        //copy into another stack in reverse order
        Stack<Integer> gt=new Stack<>();
        while(st.size()>0){
            // int x=st.peek();
            // rt.push(x);
            // st.pop();

            gt.push(st.pop());
        }
        System.out.println(gt);

        //now another stack to get reverse stack in same order
        Stack<Integer> rt=new Stack<>();
        while(gt.size()>0){
            rt.push(gt.pop());
        }
        System.out.println(rt);
        //mind it previous two stack gt and st right now empty 
    }
}
