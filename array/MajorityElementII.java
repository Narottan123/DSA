/*Brute Force Approach T.C is O(n*n) and S.C is O(1) */
// import java.util.List;
// import java.util.ArrayList;
// public class MajorityElementII {
//     public static List<Integer> MajorityElementFunc(int[] arr) {
//         int n=arr.length;
//         List<Integer> result=new ArrayList<>();
//         for(int ele:arr){
//             int count=0;
//             for(int val:arr){
//                 if(ele==val){
//                     count++;
//                 }
//             }
//             if(count>arr.length/3 && !result.contains(ele)){
//                 result.add(ele);

//             }
//         }
//         return result;
        
//     }

//     public static void main(String[] args) {
//         int[] arr = {2, 2, 3, 1, 3, 2, 1, 1};
//         System.out.println(MajorityElementFunc(arr));
//     }
// }


/*Optimized Approach T.C is O(n) and Space Complexity is O(1) */
import java.util.*;
public class MajorityElementII{
    public static List<Integer> MajorityElementFunc(int[] nums){

        int candidate1=0,candidate2=0;
        int count1=0,count2=0;
        List<Integer> result=new ArrayList<>();
        for(int num:nums){
            if(candidate1==num){
                count1++;
            }
            else if(candidate2==num){
                count2++;
            }
            else if(count1==0){
                candidate1=num;
                count1=1;
                
            }
            else if(count2==0){
                candidate2=num;
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }

        count1=0;
        count2=0;
        for(int num:nums){
            if(candidate1==num){
                count1++;
            }
            if(candidate2==num){
                count2++;
            }
        }
        if(count1>nums.length/3){
            result.add(candidate1);
        }
        if(count2>nums.length/3){
            result.add(candidate2);
        }
        return result;


    }
    public static void main(String[] args){
          int[] arr = {2, 2, 3, 1, 3, 2, 1, 1};
          System.out.println(MajorityElementFunc(arr));
    }
}