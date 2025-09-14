//this is brute force approach find all possible result and t.c is O(n*n) and s.c is O(1)
import java.util.*;
public class Histogram {

    public static int histogramFunc(int[] arr){
        int n=arr.length;
        int ans=0;
        //kepp tract of minimum value
       //find minimum height 
        for(int i=0;i<n;i++){
             int min_element=arr[i];
            for(int j=i;j<n;j++){
                ///match next all height and find minimum
                min_element=Math.min(arr[j],min_element);
                int length=j-i+1;
                int curr_area=min_element*length;
                ans=Math.max(ans,curr_area);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={2,1,5,6,2,3};
        int res=histogramFunc(arr);
        System.out.println(res);
    }
}
