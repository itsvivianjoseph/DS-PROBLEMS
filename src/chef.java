public class chef {
    public static void main(String[] args) {
        String[] arr = {"A 2","B 4","A 6","B 1","C 1"};
        int[] ans = new int[3];
        for(int i=0;i<ans.length;i++) ans[i]=Integer.MAX_VALUE;
        for(String x : arr){
            if(x.charAt(0)=='A'){
                if(ans[0]>(int)x.charAt(2)) ans[0]=Character.getNumericValue(x.charAt(2)); 
            }
            else if(x.charAt(0)=='B'){
                if(ans[1]>(int)x.charAt(2)) ans[1]=Character.getNumericValue(x.charAt(2)); 
            }
            else if(x.charAt(0)=='C'){
                if(ans[2]>(int)x.charAt(2)) ans[2]=Character.getNumericValue(x.charAt(2)); 
            }
        }
        System.out.println(Math.min((ans[0]+ans[1]),ans[2]));
    }
}
