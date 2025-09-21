public class BinarySeachDecending {
    public static int binarySearch(int[] arr, int target) {
        int n = arr.length;
        int low =0;
        int high = n-1;
        int index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                index = mid;
                return index;
            } else if (arr[mid] > target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        int target = 5;
        int i = binarySearch(arr, target);
        System.out.println(i);
    }
}
