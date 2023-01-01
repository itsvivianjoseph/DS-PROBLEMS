import java.util.*;
public class uniqueornot {
    public static void main(String[] args) {
        int unique=0;
        int[] arr = new int[6]; 
        Scanner get = new Scanner(System.in);
        System.out.println("enter the array elements:");
        for(int i =0;i<6;i++)
        {
            arr[i]=get.nextInt();
        }
        for(int i=0;i<6;i++)
        {
            for(int j=1;j<6;j++)
            {
                if(arr[i]==arr[j])
                {
                    unique=0;
                }
                else
                {
                    unique=1;
                }
            }
        }
        if(unique==0)
        {
            System.out.println("not unique elements!!");
        }
        else
        {
            System.out.println("unique elements!!");
        }
        get.close();
    }    
}
