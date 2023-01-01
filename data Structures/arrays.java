//NOT COMPLETED 


import java.util.Arrays;
import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
        int cnt=0;
        int a = -1;
        Scanner get = new Scanner(System.in);
        System.out.println("ENTER THE ARRAY SIZE");
        int size = get.nextInt();
        int[] array = new int[size];
        int index = 0;
        do
        {
        System.out.println("SELECT AN OPTION:");
        System.out.println("1.INSERT\n2.DELETE\n3.SEARCH\n4.SORT\n5.DELETE\n6.END");
        int choice = get.nextInt();
            switch(choice)
            {
                case 1: 
                    System.out.println("ENTER THE ELEMENT THAT HAS TO BE INSERTED:");
                    a = get.nextInt();
                    if(index<array.length)
                    {
                        array[index] = a;
                    }
                    else
                    {
                        System.out.println("OVERFLOW");
                    }
                    break;
                case 2:
                    if(array.length==0) System.out.println("UNDERFLOW");
                    System.out.println("ENTER THE ELEMENT TO BE DELETED");
                    a = get.nextInt();
                    for(int i=0;i<array.length;i++)
                    {
                        if(array[i]==a)
                        {
                            array[i] = -1;
                        }
                    }
                    break;
                case 3:
                    System.out.println("ENTER THE ELEMENT TO BE SEARCHED");
                    a  = get.nextInt();
                    System.out.println("ELEMENT IS FOUND AT "+search(0,array,a,array.length)+"TH INDEX");
                    break;
                case 4:
                    Arrays.sort(array);
                    break;
                case 5:
                    for(int i=0;i<array.length;i++)
                    {
                        array[i] = -1;
                    }
                    break;
            }
            System.out.println("DO YOU WANT TO CONTINUE??");
            cnt = get.nextInt();
        }while(cnt!=0);
    }
    static int search(int low,int[] tarray,int target,int high)
    {
        int mid=1;
        Arrays.sort(tarray);
        while(low<high)
        {
            mid = (low+high)/2;
            if(tarray[mid]==target) return mid;
            else if(target>tarray[mid]) low=mid;
            else high = mid-1;
        }
        return mid;
    }
}
