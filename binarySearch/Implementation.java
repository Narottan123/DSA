public class Implementation {
    static boolean binarySearch(int[] a, int target){
               int n=a.length;
               int low=0;
               int high=n-1;
               while(low<=high){
                int mid=low+(high-low)/2;
                if(target==a[mid]){
                    return true;
                }
                else if(target<a[mid]){
                     high=mid-1;
                }
                else if(target>a[mid]){
                    low=mid+1;
                }
               }
               return false;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int target = 6;
        System.out.println(binarySearch(a, target));
    }
}
