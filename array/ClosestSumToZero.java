/* Brute Force Approach with O(n*n) time complexity */

// public class ClosestSumToZero {
//     public static int ClosestZero(int[] arr) {
//         int closest = 0;
//         int n = arr.length;
//         int closestSum = Integer.MAX_VALUE;
//         for (int i = 0; i < n - 1; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 int currSum = arr[i] + arr[j];
//                 if (Math.abs(currSum) < Math.abs(closestSum)) {
//                     closestSum = currSum;
//                 }
//             }
//         }
//         return closestSum;

//     }

//     public static void main(String[] args) {
//         int[] arr = { -2, 9, 6, 1, 2, -5 };
//         System.out.println(ClosestZero(arr));
//     }
// }


/*  Two Pointer Approache  T.C->O(nlogn)*/
public class ClosestSumToZero {
    public static int ClosestZero(int[] arr) {
        int l=0;
        int r=arr.length-1;
        int closest=Integer.MAX_VALUE;
        while(l<r){
            int currSum=arr[l]+arr[r];
            if(currSum==0){
                return 0;
            }
            else if(currSum<closest){
                closest=currSum;
            }
            else if(currSum<0){
                l++;
            }
            else{
                r--;
            }
        }
        return closest;

    }

    public static void main(String[] args) {
        int[] arr = { -2, 9, 6, 1, 2, -5 };
        System.out.println(ClosestZero(arr));
    }
}

