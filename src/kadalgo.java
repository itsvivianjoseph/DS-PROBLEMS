
//import java.util.*;
public class kadalgo {
    public static void main(String[] args) {
        //Scanner get = new Scanner(System.in);
        // System.out.println("enter the array size:");
        // int n = get.nextInt();   new int[n];
        int[] arr = {1, 3, 8, -2, 6, -8, 5};
        // for(int i=0;i<arr.length;i++){
        //     arr[i] = get.nextInt();
        // }
        int ans  = maxsubarray(arr);
        System.out.println("MAX SUM IS:" + ans);
        //get.close();
    }
    static int maxsubarray(int[] arr){
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            curr_sum += arr[i];
            if(max_sum<curr_sum) max_sum=curr_sum;
            if(curr_sum<0) curr_sum=0;
        }
        return max_sum;
   }
}
