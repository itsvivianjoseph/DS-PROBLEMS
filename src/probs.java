public class probs {
    public static void main(String[] args){
        String a = "";
        //int count = 0;
        for (int i = 1; i <10; i++) {
            String dummy = Integer.toString(i);
            //a.concat(dummy);
            a+=dummy;
        }
        System.out.println(a);
    }
}
