
/*  Brute Force Approach T.C->o(n*n*n) S.C->O(1)*/
// public class TripletsumGfg {
//     public static Boolean TripletFunc(int[] arr,int target){
//       for(int i=0;i<arr.length;i++){
//         for(int j=i+1;j<arr.length;j++){
//             for(int k=j+1;k<arr.length;k++){
//                 if(arr[i]+arr[j]+arr[k]==target){
//                     return true;
//                 }
//             }
//         }
//       }
//       return false;
//     }
//     public static void main(String args[]){
//         int[] arr={1, 4, 45, 6, 10, 8};
//         int target=13;
//         System.out.println(TripletFunc(arr,target));
//     }
// }

/* Time Complexity->O(n*n)->Sorting will take O(nlogn) two for loop O(n*n) amonh this two time
 * complexity O(n*n) is big soo this is final T.C ,S.C->>O(1)
*/
import java.util.*;
public class TripletsumGfg {
    public static Boolean TripletFunc(int[] arr, int target) {
        //Using Sorting And Two Pointer Approach
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int a=arr[i];
            int y=target-a;
            int l=i+1;
            int r=arr.length-1;
            while(l<r){
                int currSum=arr[l]+arr[r];
                if(currSum==y){
                    return true;
                }
                else if(currSum>y){
                    r--;
                }
                else{
                    l++;
                }
            }
            
        }
        return false;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 4, 45, 6, 10, 8 };
        int target = 13;
        System.out.println(TripletFunc(arr, target));
    }
}