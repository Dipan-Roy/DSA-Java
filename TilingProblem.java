// Tiling Problem :-
// Given a "2 x n" board and tiles of size "2 x 1", 
// count the number of ways to tile the given board using the 2 x 1 tiles.
// (A tile can either be placed horizontally or vertically. )

public class TilingProblem {
    public static int tilingWays(int n){ //2 x n (floor size)
        // Base case
        if(n == 1 || n == 0){
            return 1;
        }

        // Vertical Choice
        int fnm1 = tilingWays(n-1);

        // Horizontal Choice 
        int fnm2 = tilingWays(n-2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }

    public static void main(String args[]){
        System.out.println(tilingWays(3));
    }
}