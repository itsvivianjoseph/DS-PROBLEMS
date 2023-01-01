import java.util.ArrayList;
import java.util.Stack;
import java.util.*;;
public class Printbracketno {
    public static void main(String[] args) {
        //String s = "()((()))(";
        //char[] arr = s.toCharArray();
        Scanner get = new Scanner(System.in);
        ArrayList<String> s = new ArrayList<String>();
        for(int i=0;i<5;i++){
            String x = get.nextLine();
            s.add(x);
        }
        Stack<String> stk = new Stack<String>(); 
        for(int i=0;i<s.size();i++){
            if(s.get(i)=="("){
                stk.push("(");
            }
            if(s.get(i)==")"){
                stk.push(")");
            }
        }
        System.out.println(stk.pop());
        // int l = stk.size();
        // int count=0; 
        // for(int i =0;i<l;i++){
        //     if((stk.elementAt(i)=="(")&&(stk.elementAt(i+1)==")")){
        //         stk.remove(i);
        //         stk.remove(i+1);
        //         count++;
        //         System.out.print(count+" ");
        //     }
        // }

    }
}

