import java.util.ArrayList;

public class hello {
    public static void main(String[] args) {
        int[] arr = {3,4,5};
        ArrayList<Integer> ds = new ArrayList<>();
        printSubsequence(0,arr,ds);
    }
    static int printSubsequence(int index,int[] array,ArrayList<Integer> ds)
    {
        if(index==array.length)
        {
           if(ds.size()>0)
           {
            System.out.println(ds);
           }
           return 1;
        }
        ds.add(array[index]);
        printSubsequence(index+1, array, ds);
        ds.remove(ds.size()-1);
        printSubsequence(index+1,array,ds);
        return 1;
    }
}
