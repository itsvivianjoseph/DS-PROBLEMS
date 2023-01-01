public class paranthesis{
    public static void main(String[] args) {
        String str = "()(()()";
        if(str.length()==0) System.out.println("empty");
        int count = 0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='(') count++;
            else if(str.charAt(i)==')') count--;
        }
        if(count==0) System.out.println("EQUAL NO. OF PARANTHESIS");
        else System.out.println("NOT EQUALS NUMBER OF PARANTHESIS");
    }
}