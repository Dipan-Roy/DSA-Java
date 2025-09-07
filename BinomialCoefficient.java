import java.util.*;

public class BinomialCoefficient { // nCr = n!/r!*(n-r)!

    public static float BinomialCoefficient(int n, int r){
        int nFact = 1;
        for(int i = 1; i<=n; i++){
            nFact *= i;
        }

        int rFact = 1;
        for(int i = 1; i<=r; i++){
            rFact *= i;
        }

        int n_Minus_r = n - r;
        int n_Minus_r_Fact = 1;
        for(int i = 1; i<=n_Minus_r; i++){
            n_Minus_r_Fact *= i;
        }

        float f = nFact / (rFact * n_Minus_r_Fact);
        return f;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter r : ");
        int r = sc.nextInt();

        System.out.println("The Binomial Coefficient is: " + BinomialCoefficient(n, r));

    }
}