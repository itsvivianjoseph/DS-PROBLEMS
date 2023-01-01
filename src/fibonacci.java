public class fibonacci {
    public static void main(String[] args) {
        int number = fib(8);
        System.out.println(number);
    }
    static int fib(int number)
    {
        if(number<=1) return number;
        else return (fib(number-1)+fib(number-2));
    }
}
