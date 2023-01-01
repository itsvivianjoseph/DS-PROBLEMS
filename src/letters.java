
//NOT COMPLETED

public class letters {
    public static void main(String[] args) {
        String s = "abc";
        String ans = "";
        int[] arr = {1,2,3};
        for(int i = 0; i < arr.length; i++) {
            for(int j =0;j<=i;j++){
                ans =s.charAt(j)+arr[i];
            }
        }
    }
}
