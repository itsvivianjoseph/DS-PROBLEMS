import java.util.*;
public class nocommondiv {
    public static void main(String[] args){
        int count=0;
        Scanner get = new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a = get.nextInt();
        System.out.println("enter the value of b:");
        int b = get.nextInt();
        for(int i = 1;(i<=a)&&(i<=b);i++)
        {
            if((a%i==0)&&(b%i==0))
            {
                count++;      
            }
        }
        System.out.println("number of common divisiors is" + count);
        get.close();
    }
    
}

