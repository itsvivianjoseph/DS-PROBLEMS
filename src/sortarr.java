import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sortarr {
    static ArrayList<Integer> ans = new ArrayList<>();
    static ArrayList<Integer> ans1 = new ArrayList<>();
    public static void main(String[] args) {
        //int[] arr = {1,2,3,3,4,5};
        ans.add(0);
        ans.add(1);
        ans.add(2);
        ans.add(3);
        ans.add(4);
        ans.add(5);
        for(int i=0;i<ans.size();i++){

        }
    }
    static List<Integer> findmin(ArrayList<Integer> ans){
        int min=Integer.MAX_VALUE;
        for(int i:ans){
            min = Math.min(i, min);
        }
        return ans;
    }
    static List<Integer> findmax(ArrayList<Integer> ans){
        int max=Integer.MIN_VALUE;
        for(int i:ans){
            max = Math.max(i, max);
        }
        return ans;
    }
}
