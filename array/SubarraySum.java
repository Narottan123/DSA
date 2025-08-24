/*Brute Force Approach->O(n*n) Space Complexity->O(1)*/

// import java.util.*;

// public class SubarraySum {
//     public static int[] SlidingWindow(int[] arr, int target) {
//         int n = arr.length;
//         for (int i = 0; i < n; i++) {
//             int currSum = 0;
//             for (int j = i; j < n; j++) {
//                 currSum += arr[j];
//                 if (currSum == target) {
//                     return new int[] { i, j };
//                 }
//             }

//         }
//         return new int[] { -1, -1 };
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 3, 7, 5 };
//         int target = 12;
//         int[] indexs = SlidingWindow(arr, target);
//         System.out.println(Arrays.toString(indexs));
//     }
//}

/* Optimized Solution  Using Sliding Window Technique */

/*  Dry Run Step by step arrr=[ 1, 2, 3, 7, 5] target=12
 * l=0,r=0,sum=0
 * sum=1<12 ->l=0,r=1;
 * sum=1+2<12->l=0,r=2;
 * sum=3+3<12-<l=0,r=3;
 * sum=6+7>12->l=1,r=3;
 * sum=2+3+7==12->ans indexes {1,3}
 * 
 */

import java.util.*;

public class SubarraySum {
    public static int[] SlidingWindow(int[] arr, int target) {
        int l=0,r=0,n=arr.length;
        int sum=0;
        while(l<=r && r<n){
           if(sum==target){
            return  new int[] {l,r-1};
           }
           else if(sum<target){
            sum+=arr[r];
            r++;
           }
           else{
            sum-=arr[l];
             l++;
           }

        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 7, 5 };
        int target = 12;
        int[] indexs = SlidingWindow(arr, target);
        System.out.println(Arrays.toString(indexs));
    }
}
