
/*Simple Linear search approach T.C->O(n) S.C->O(1) */

// public class BitonicPoint {
//     public static int BitonicFunc(int[] arr) {
//         int n = arr.length;
//         if (n == 1) {
//             return arr[0];
//         }
//         if (arr[0] > arr[1]) {
//             return arr[0];
//         }
//         if (arr[n - 1] > arr[n - 2]) {
//             return arr[n - 1];
//         }
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
//                 return arr[i];
//             }
//         }
//         return -1;

//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 4, 5, 7, 8, 3 };
//         System.out.println(BitonicFunc(arr));
//     }
// }

/*Optimal Solution  Using Binary Search Approach T.C->O(logn) S.C->O(1)*/

public class BitonicPoint {
    public static int BitonicFunc(int[] arr) {
        int l = 0;
        int h = arr.length - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (mid > 0 && mid < arr.length - 1) {
                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                    return arr[mid];
                }
                else if(arr[mid]<arr[mid-1]){
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }
            }

            
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 7, 8, 3 };
        System.out.println(BitonicFunc(arr));
    }
}
