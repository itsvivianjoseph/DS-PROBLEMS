import java.util.Scanner;

public class dummy {
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
    static int matrixprintspiral(int rows,int col,int[][] array){
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
                        System.out.print(" "+array[x][col-1]);
                        System.out.println();
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
                // if(i!=rows-1){
                //     for(int x=rows-1;x>=1;x--){
                //         System.out.print(" "+array[x][0]);
                //     }
                //     System.out.println();
                //     break;
                // }
            }
        }
        return rows-2+col-2;
    }
    public static void main(String[] args)
    {
        Scanner get = new Scanner(System.in);
        int rows  = get.nextInt();
        int col = get.nextInt();
        
        int[][] arr = new int[rows][col];
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j] = get.nextInt();
            }
        }
        printmartix(arr);

        if((rows%2==0)&&(col%2==0)){
            
        }

        get.close();
    }
}

// public class dummy {
//     // Hashset hs = new Hashset();
//     public static void main(String[] args) {
//         int A[][] = {{1, 2, 3,4}, // rows = m and column = n
//                 { 5, 6,7,8},
//                 {9, 10,11,12},
//                 {13,14,15,16}};
//         int m, n = m = 4;
//         int i =0,j=0,mincol = 0,minrow = 0,maxcol = n-1,maxrow = m-1;
// while (i!=2 && j!=2){
//                 for (;j<maxcol;j++){
//                     System.out.print(A[i][j] + " ");

//                 }
//                 for(;i<maxrow;i++) {
//                     System.out.print(A[i][j]+ " ");
//                 }while(j != mincol){
//                     System.out.print(A[i][j--]+ " ");
//                 }while(i > minrow){
//                     System.out.print(A[i--][j]+ " ");
//                 }
//                 i++;j++; minrow+=1; maxrow-=1;
//                      mincol+=1;maxcol-=1;


//                      }

//     }
// }
