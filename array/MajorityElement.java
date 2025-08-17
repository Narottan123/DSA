/* 1. Brute Force Time Complexity->O(n*n) Brute Force Approach */
// public class MajorityElement {
//     public static int MajorityElementFunc(int[] arr) {
//         int n = arr.length;

//         for (int val : arr) {
//             int freq = 0;
//             for (int ele : arr) {
//                 if (val == ele) {
//                     freq++;
//                 }
//             }
//             if (freq > n / 2) {
//                 return val; // return majority element
//             }
//         }

//         return -1; // no majority element
//     }

//     public static void main(String[] args) {
//         int[] arr = { 8, 5, 8, 2, 5, 5, 5, 5 };
//         System.out.println(MajorityElementFunc(arr));
//     }
// }

/*2nd approach will be the HashMap T.C->O(n) S.C->O(n) */

/*Final and optimized approach is Voting Moore Algorithm */

public class MajorityElement {
    public static int MajorityElementFunc(int[] arr) {
        int candidate = 0, votes = 0;
        for (int i : arr) {
            if (votes == 0) {
                candidate = i;
                votes = 1;
            } else {
                if (candidate == i) {
                    votes++;
                } else {
                    votes--;
                }
            }

        }

        // if no majority element found that case
        votes = 0;
        for (int j : arr) {
            if (candidate == j) {
                votes++;
            }
        }
        if (votes > arr.length / 2) {
            return candidate;
        } else {
            return -1;
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println(MajorityElementFunc(arr));
    }
}
