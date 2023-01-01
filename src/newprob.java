
public class newprob {
    public static void main(String[] args) {
     String s = "nathamuni";
     char[] arr = new char[s.length()];
     for(int i=0;i<s.length();i++){
        arr[i] = s.charAt(i);
     }
     printstr(arr);
    }
    public static void printstr(char[] ch)
    { 
        String str ="";
        for(int i=ch.length-1 ; i>=0;i--){
            
            //int flag =0;
            if((ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u'))
            {
              //  flag =1;
                System.out.println(str);
                str = "";
            }
            else{
                str = str.concat(String.valueOf(ch[i]));
            }
        }
    }
}
