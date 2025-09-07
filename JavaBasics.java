import java.util.*; // util => is a package

// Boilerplate code
public class JavaBasics {
    public static void main(String args[]) {
        System.out.print("Hello World!!");
        System.out.print("1, 2, 3, 4");
        System.out.println("Hello World!!");  // println (ln) => one line space [next line]
        System.out.println("Hello World!!");
        System.out.println("Hey\n I'm\nDipan");  // "\n" => next line

        // "println" and "\n" works the same => next line

        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");

        int a = 10;
        int b = 20;
        String name = "Dipan";
        System.out.println(a);
        System.out.println(name);

        a = b;
        System.out.println(a);

        boolean var = false;  // either "true" or "false"
        char ch = 'd';
        float price = 8.52f; /* Here, 8.52 is treated as a "double" by default in Java, and you're trying to assign it to a "float" variable,
                                which has less precision. Java doesn't automatically convert a "double" to a "float" because it may result 
                                in loss of precision. 
                                You need to explicitly tell Java that the literal 8.52 is a float by appending f (or F) to the number */

        int c = 15;
        int d = 8;
        int sum = c+d;
        System.out.println(sum);

        // Taking input from user
        Scanner sc = new Scanner(System.in);
        String college = sc.nextLine();
        System.out.println(college);

        // Type conversion
        int e = 25;
        long f = e;  // int -> long
        System.out.println(f);

        int g = sc.nextInt();
        float z = g; // int -> float
        System.out.println(z);

    }
}