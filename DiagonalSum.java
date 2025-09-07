public class DiagonalSum{
    // diagonal is only possible in matrix where we have n = m(no.of rows = no.of columns) [sq. matrix]
    // primary diagonal => index property: i = j (row=col)
    // secondary diagonal => i + j = n-1 (where n is the total no.of rows)

    public static int diagonalSum(int matrix[][]){
        // Brute Force method :-
        // int sum = 0;
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         // primary diagonal  
        //         if(i == j){
        //             sum += matrix[i][j];
        //         } // secondary diagonal ("else" will take care of the middle repeated element if any)  
        //         else if (i+j == matrix.length-1){
        //             sum += matrix[i][j];
        //         }    
        //     }
        // }
        // return sum;
        // Time complexity: O(n^2)

        // Optimized method :-
        int sum = 0;
        for(int i=0; i<matrix.length; i++){
            // principal diagonal
            sum += matrix[i][i];

            // secondary diagonal: i+j = n-1 => j = n-1-i (like this we can get "j", so we can do matrix[i][j])
            if(i != matrix.length-1-i){ // we do it inside "if" condition to take care of repeated middle element if any
                sum += matrix[i][matrix.length-1-i]; 
            }
        }
        return sum;
        // Time complexity: O(n)
    }



    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(diagonalSum(matrix));

    }
}