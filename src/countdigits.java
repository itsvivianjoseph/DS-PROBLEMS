

//Problem Statement: Given an integer N , write program to count number of digits in N.
public class countdigits {
    public static void main(String[] args) {
        int n = 122334;
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println("the count of digits inthe given number is"+count);
    }
}
