//find the index of first occurance of an element in an array
//HomeWork->Find index of last occurance  of an element in array********   
public class firstOccurance {
    public static int firstOccurance(int[] arr, int x) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int fo = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                fo = mid;
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }
        return fo;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 5, 5, 6, 2, 4 };
        int x = 4;
        int ans = firstOccurance(arr, x);
        System.out.println(ans);
    }
}
