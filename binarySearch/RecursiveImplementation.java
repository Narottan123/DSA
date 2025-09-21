
public class RecursiveImplementation {
    public static boolean recBinarySearch(int[] a, int low, int high, int target) {
        if (low > high)
            return false;
        int mid = low + (high - low) / 2;
        if (target == a[mid]) {
            return true;
        } else if (target < a[mid]) {
            return recBinarySearch(a, low, mid - 1, target);
        } else  {
            return recBinarySearch(a, mid + 1, high, target);
        }
        
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6 };
        int low = 0;
        int high = a.length - 1;    

        int target = 7;
        System.out.println(recBinarySearch(a, low, high, target));
    }
}
