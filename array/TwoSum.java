
/*This is using two pointer approach T.C is O(nlogn) and SC is->O(n)  for result store */
// import java.util.*;
// public class TwoSum {
//     public static ArrayList<ArrayList<Integer>> TwoSum(int[] arr){
//         Arrays.sort(arr);
//         int l=0;
//         int r=arr.length-1;
//         ArrayList<ArrayList<Integer>> result=new ArrayList<>();
//         while(l<r){
//             ArrayList<Integer> pair=new ArrayList<>();
//             int sum=arr[l]+arr[r];
//             if(sum==0){
//               pair.add(arr[l]);
//               pair.add(arr[r]);
//               result.add(pair);
//               l++;
//               r--;
//             }
//             if(sum>0){
//                 r--;
//             }
//             else{
//                 l++;
//             }
//         }
//         return result;

//     }

//     public static void main(String[] args) {
//         int[] arr = { 6, 1, 8, 0, 4, -9, -1, -10, -6, -5 };
//         System.out.println(TwoSum(arr));
//     }
// }


/* Using Hashing  */
