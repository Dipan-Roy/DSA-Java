import java.util.*;

public class FunctionsAndMethods{

    public static void printName() {
        System.out.println("Dipan");
    }

    public static int calSum(int a, int b){ // parameters
        int sum = a + b;
        return sum;
    }

    public static void main(String args[]){
        printName();
        System.out.println("-----------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();

        int sum = calSum(a, b); // arguments
        System.out.print("Sum is : " + sum );
    }
}