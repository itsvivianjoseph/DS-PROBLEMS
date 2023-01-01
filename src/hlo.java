import java.util.*;
public class hlo {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("enter a number");
        int n = get.nextInt();
        if(n%2==0) divbytwo(n);
        else if(n%3==0) divbythree(n);
        else if(n%5==0) divbyfive(n);
        else System.out.println("not div by 2 or 3 or 5");
        get.close();
    }
    static void divbytwo(int n)
    {
        if(n==1) {
            System.out.println("divisible by two");
        }
        if(n%2==0) {
            n = n/2;
            divbytwo(n);
        }
        if(n%3==0) {
            n = n/3;
            divbythree(n);
        }
        if(n%5==0) {
            n = n/5;
            divbyfive(n);
        }
        
    }
    static void divbythree(int n){
        if(n==1) {
            System.out.println("divisible by three");
        }
        if(n%2==0) {
            n = n/2;
            divbytwo(n);
        }
        if(n%3==0) {
            n = n/3;
            divbythree(n);
        }
        if(n%5==0) {
            n = n/5;
            divbyfive(n);
        }
    }
    static void divbyfive(int n){
        if(n==1) {
            System.out.println("divisible by five");
        }
        if(n%2==0) {
            n = n/2;
            divbytwo(n);
        }
        if(n%3==0) {
            n = n/3;
            divbythree(n);
        }
        if(n%5==0) {
            n = n/5;
            divbyfive(n);
        }
    }
}
