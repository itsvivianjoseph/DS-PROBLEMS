import java.util.*;
public class spiralmatrix {
    static int rcnt;
    static int ccnt;
    static int rows;
    static int col;
    static void printmartix(int[][] array)
    {
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[i].length;j++)
            {
                System.out.print(" "+array[i][j]);
            }
            System.out.println();
        }
    }
    static void matrixprintspiral(int[][] array){
        rcnt = rows-2;
        ccnt = col-2;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i==0){
                    for(int x=0;x<=col-1;x++){
                    System.out.print(" "+array[i][x]);
                    }
                    System.out.println();
                    break;
                    //i=i+1
                    //j=0-->col-1
                }
                if(i!=rows-1){
                    for(int x=0;x<=rows-1;x++){
                        System.out.print(array[x][col-1]);
                    }
                    System.out.println();
                    break;
                }
                if(i==rows-1){
                    for(int x=col-1;x>=0;x--){
                        System.out.print(" "+array[i][x]);
                    }
                    System.out.println();
                    for(int x=rows-1;x>=1;x--){
                        System.out.print(" "+array[x][0]);
                    }
                    System.out.println();
                    break;
                }
            }
        }
    }
    static boolean stillrunah(int rc,int cc){
        if((rc==0)&&(cc==0)){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("enter rows");
        rows = get.nextInt();
        System.out.println("enter  col");
        col = get.nextInt();

        int[][] arr = new int[rows][col];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = get.nextInt();
            }
        }
        printmartix(arr);
        matrixprintspiral(arr);
        while(stillrunah(rcnt,ccnt)){
            matrixprintspiral();
        }
        get.close();
    }
}
