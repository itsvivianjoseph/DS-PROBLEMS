public class factorial 
{
    public static void main(String[] args)
    {
        long fact = fact(5);    
        System.out.println(fact);
    }
    static long fact(int number)
    {
        if(number == 1) return number;
        else return number*fact(number-1);
    }
}