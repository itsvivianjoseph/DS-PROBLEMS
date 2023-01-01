//NOT COMPLETED

import java.util.*;
public class matrixmul {
    public static void main(String[] args) {
        Scanner get =  new Scanner(System.in);
        int cont = 0,choice = 0 ; 
        System.out.println("enter the number of rows in matrix A:");
        int row1 = get.nextInt(); 
        System.out.println("enter the number of columns in matrix A:");
        int col1 = get.nextInt();
        System.out.println("enter the number of rows in matrix B:");
        int row2 = get.nextInt();
        System.out.println("enter the number of columns in matrix A:");
        int col2 = get.nextInt();
        int[][] result = new int[row1][col1];
        do{
            System.out.println("enter the option:");
            System.out.println("1.Multiplication\n2.Print the matrix\n");
            choice = get.nextInt();
            switch(choice) {
                case 1:
                    result = matmult(array1,array2);
                    break;
                case 2:
                    print();
                default:
                    System.out.println("enter a valid choice!!");
                    break;
            }
            System.out.println("do u want to continue??");
            cont= get.nextInt();
        }while(cont!=0);
    }
    public int matmult(x,y)
    {

    }
}
