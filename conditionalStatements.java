import java.util.*;

public class conditionalStatements {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 

        // odd-even (if-else)
        System.out.print("Enter no. (n) : ");
        int n = sc.nextInt();
        if (n%2 == 0) {
            System.out.println("Even no.");
        } else {
            System.out.println("Odd no.");
        }

        // income-tax calculator (else-if)
        System.out.print("Enter your income : ");
        int income = sc.nextInt();
        if(income < 500000) {
            System.out.println("You are taxed at 0%");
        } else if ((income >= 500000) && (income < 1000000)) {
            float tax = (0.20f * income);
            System.out.println("You are taxed at 20% i.e," + tax);
        } else {
            float tax = (0.30f * income);
            System.out.println("You are taxed at 30% i.e," + tax);   
        }

        // largest of 3 no.s 
        int a = 3, b = 5, c = 2;

        if((a >= b) && (a >=c)){
            System.out.println("a is the largest");
        } else if (b >= c) {
            System.out.println("b is the largest");
        } else {
            System.out.println("c is the largest");
        }

        // ternary operator (odd-even)
        int number = 8;
        String type = ((number%2) == 0)? "even" : "odd";
        System.out.println(type);

        // Switch Statement
        int num = 2;
        switch(num) {
            case 1: System.out.println("Dosa");
                        break;
            case 2: System.out.println("French-Fries");
                        break;
            case 3: System.out.println("Cold-Coffee");
                        break;
            default: System.out.println("Kuch bhi ho chalega.. bas saath meh woh honi chaiye :)");
        }

        // Calculator 
        System.out.print("Enter 1st Operand : ");
        int A = sc.nextInt();
        System.out.print("Enter 2st Operand : ");
        int B = sc.nextInt();
        System.out.print("Enter the operator (+,-,*,/,%) : ");
        char ch = sc.next().charAt(0);

        switch(ch){
            case '+': int sum = A + B;
                      System.out.println("Sum is : " + sum);
                      break;
            case '-': int diff = A - B;
                      System.out.println("Difference is : " + diff);
                      break;
            case '*': int multiply = A * B;
                      System.out.println("Product is : " + multiply);
                      break;
            case '/': int divide = A / B;
                      System.out.println("Quotient is : " + divide);
                      break;
            case '%': int modulo = A % B;
                      System.out.println("Remainder is : " + modulo);
                      break;
            default: System.out.println("Kya User banega re tu!!");
        }
    }
}