public class JavaBasics2 {
    public static void main(String args[]) {
        // Type casting
        float a = 69.69f;
        int b = (int) a;
        System.out.println(b);

        char ch = 'a';
        char ch2 = 'b';
        char CH = 'A';
        int number = ch; 
        int number2 = ch2; 
        int NUMBER = CH; 
        System.out.println(number); // 'a' => 97 , 'b' => 98 .... ; 'A' => 65 , 'B' => 66
        System.out.println(number2); 
        System.out.println(NUMBER); 

        // Type promotion
        byte c = 10;
        short d = 15;
        char ch3 = 'd';
        int n = c * d * ch3; // all the operands are converted into "int" in the expression
        System.out.println(n); 

        long x = 25;
        float y = 12.25f;
        double z = 32.32221;
        double sum = x + y + z; // all the operands are converted into the largest datatype of the expresion i.e, "double"
        System.out.println(sum);

        byte p = 10;
        p = (byte) (p * 2);
        System.out.println(p);

        // Binary operators 
        int A = 10;
        int B = 5;
        System.out.println("Divide = " + (A/B));
        System.out.println("Modulo(remainder) = " + (A%B));

        // Unary operators (pre/post)
        int a1 = 10;
        int b1 = ++a1; // first the value of "a" is increased by 1, and then the increased value is used
        System.out.println(a1);
        System.out.println(b1);

        int a11 = 10;
        int b11 = a11++; // first the old value of "a" is used, and then the value of "a" is increased by 1
        System.out.println(a11);
        System.out.println(b11); 
        // Similarly, with pre-decrement(--a) and post-decrement(a--) operator
    }
}