// normal brute  force approach t.c is O(n*n)
// public class NextGreater {
//     public static void main(String[] args) {
//         int[] arr={1,3,2,1,8,6,3,4};
//         int[] res=new int[arr.length];
//         for(int i=0;i<arr.length;i++){
//            res[i]=-1;
//             for(int j=i+1;j<arr.length;j++){

//                 if(arr[j]>arr[i]){
//                     res[i]=arr[j];
//                     break;
//                 }
//             }
//         }
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//          for(int i=0;i<res.length;i++){
//             System.out.print(res[i]+" ");
//         }
//     }
// }


// Time complexity is O(n) and space complexity is O(n)
//this is the first approach where in stack i have stored value
//keep iterate loop from last of array
// import java.util.*;

// public class NextGreater {
//     public static ArrayList<Integer> nextGreaterFunc(int[] arr) {
//         int n = arr.length;
//         Stack<Integer> st = new Stack<>();
//         ArrayList<Integer> res = new ArrayList<>(Collections.nCopies(n, -1));
//         st.push(arr[n - 1]);
//         for (int i = n - 2; i >= 0; i--) {
//             while (!st.isEmpty() && st.peek() <= arr[i]) {
//                 st.pop();
//             }
//             if (st.size() == 0) {
//                 res.set(i, -1);
//             } else {
//                 res.set(i, st.peek());
//             }
//             st.push(arr[i]);
//         }
//         return res;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 3, 2, 1, 8, 6, 3, 4 };
//         ArrayList<Integer> res = nextGreaterFunc(arr);
//         System.out.println(res);
//     }
// }


// Time complexity is O(n) and space complexity is O(n)
//this is the second approach where in stack i have stored index to track the value 
//keep iterating from start of array


import java.util.*;

public class NextGreater {
    public static ArrayList<Integer> nextGreaterFunc(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>(Collections.nCopies(n, -1));
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                int idx=st.pop();
                res.set(idx,arr[i]);  // arr[i] is the next greater for arr[idx]
            }
            
            st.push(i);

        }
        return res;
        
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 1, 8, 6, 3, 4 };
        ArrayList<Integer> res = nextGreaterFunc(arr);
        System.out.println(res);
    }
}
