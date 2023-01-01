import java.util.*;
public class doesitdivide {
    public static void main(String[] args) {
        int prod=1;
        int sum=0;
        Scanner get = new Scanner(System.in);
        System.out.println("enter the number :");
        int number = get.nextInt();
        for(int i = 1;i<number;i++)
        {
            prod = prod*i;
            sum=sum+i;
        }
        if((prod>0)&&(sum>0))
        {
            if((prod%sum)==0)
            {
                System.out.println("YEAH");
            }
            else
            {
                System.out.println("NOPE");
            }
        }
        get.close();
    }
}
