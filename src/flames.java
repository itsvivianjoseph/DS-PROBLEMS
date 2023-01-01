//NOT COMPLETED

import java.util.*;
public class flames {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        String name1 =  "vivian";
        String name2 = "joseph";
        var first = name1.toCharArray();
        var second = name2.toCharArray();
        for(int i=0;i<name1.length();i++){
            for(int j=0;j<name2.length();j++){
                if(first[i]==second[j]){
                    first[i] = second[j] = 0;
                }
            }
        }
        int count = 0 ;
        for(int i=0;i<first.length;i++){
            if(first[i]!=0) count++;
        }
        for(int j = 0;j<second.length;j++){
            if(second[j]!=0) count++;
        }
        //while(count>6) count-=6;
        int nc = count;
        while(nc>6) nc-=6;
        String ans = findflames(count);
        // if(count==1) System.out.println("friend");
        // else if(count==2) System.out.println("love");
        // else if(count==3) System.out.println("aunty");
        // else if(count==4) System.out.println("marriage");
        // else if(count==5) System.out.println("enemy");
        // else if(count==6) System.out.println("ss");

        get.close();
    }
    static String findflames(int count){
        char[] Flames = {'f','l','a','m','e','s'}; 
        
    }
}
