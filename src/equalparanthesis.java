class equalparanthesis
{

    static char[] stack = new char[50];
    static int top = -1;
    public static void main(String[] args)
    {
        String ip = "())()()(()";
        for(int i=0;i<ip.length();i++)
        {
            stack[i] = ip.charAt(i);
        }
        // System.out.println(stack);
        
    }
}