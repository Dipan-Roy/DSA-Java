public class TilingProblem {
    public static int tilingWays(int n){ //2 x n (floor size)
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