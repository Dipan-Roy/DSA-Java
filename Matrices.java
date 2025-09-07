// 2D - Arrays

import java.util.*;

public class Matrices{

    public static boolean search(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Element FOUND at index : (" + i + "," + j + ") ");
                    return true;
                }
            }
        }

       System.out.println("Element NOT FOUND"); 
       return false;
    }

    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        int n = matrix.length , m = matrix[0].length; // n=rows , m=columns

        // taking input in the matrix
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Elements of the matrix :-");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        // output
        System.out.println("The matrix so formed :-");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

        search(matrix, 5);
    }
}