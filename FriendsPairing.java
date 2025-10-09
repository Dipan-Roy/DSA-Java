public class FriendsPairing {
    public static int friendsPairingProblem(int n){
        // Base Case
        if(n == 1 || n == 2){
            return n;
        }

        // Choices :-
        // Single
        int fnm1 = friendsPairingProblem(n-1);
        
        // pair
        int fnm2 = friendsPairingProblem(n-2);
        int pairWays = (n-1) * fnm2; // (n-1) => how many people i can make pair with ; f(n-2) => once made a pair, then how many pairs we can have

        // total ways
        int totways = fnm1 + pairWays;
        return totways;
    }
    public static void main(String args[]){
        System.out.println(friendsPairingProblem(3));
    }
}