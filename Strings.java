import java.util.*;

public class Strings{

    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }


    public static void main(String args[]) {
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "Dipan";
        String str2 = new String("yoyo");

        // Strings are IMMUTABLE

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("name: " + name);
        System.out.println("length : " + name.length());

        // Concatenation
        String firstName = "Dipan";
        String middleName = "Roy";
        String lastName = "Choudhury";
        String fullname = firstName + " " + middleName + " " + lastName;
        System.out.println(fullname);
        System.out.println("1st letter : " + fullname.charAt(0));
        printLetters(fullname);
        System.out.println();

        String FullString = "Dipan Roy";
        System.out.println(FullString);
        System.out.println("Substring: " + FullString.substring(0,3));

    }
}