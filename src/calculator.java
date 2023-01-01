import java.util.*;
public class calculator 
{
    public static void main(String[] args)
    {
        int cont = 1;
        Scanner get = new Scanner(System.in);
        System.out.println("==========CALCULATOR============");
        do{
        System.out.println("enter value of A:");
        int a = get.nextInt();
        System.out.println("enter value of B:");
        int b = get.nextInt();
        System.out.println("enter the opeartor:");
        System.out.println("\n1.addtion\n2.subtraction\n3.multiplication\n4.divide");
        int choice = get.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("sum is"+ (a+b));
            break;
            case 2:
            System.out.println("difference is"+ (a-b));
            break;
            case 3:
            System.out.println("product is"+ (a*b));
            break;
            case 4:
            System.out.println("quotient is"+ (a/b));
            break;
            default:
            System.out.println("enter a valid operator");
            break;
        }
        System.out.println("do you want to continue?");
        cont = get.nextInt();
        }while(cont!=0);
        get.close();
    }
}
