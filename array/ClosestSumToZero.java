/* Brute Force Approach with O(n*n) time complexity */

public class ClosestSumToZero {
    public static int ClosestZero(int[] arr) {
        int closest = 0;
        int n = arr.length;
        int closestSum = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int currSum = arr[i] + arr[j];
                if (Math.abs(currSum) < Math.abs(closestSum)) {
                    closestSum = currSum;
                }
            }
        }
        return closestSum;

    }

    public static void main(String[] args) {
        int[] arr = { -2, 9, 6, 1, 2, -5 };
        System.out.println(ClosestZero(arr));
    }
}
