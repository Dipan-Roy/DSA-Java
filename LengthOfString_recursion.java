// Write a program to find the Length of a String using Recursion

public class LengthOfString_recursion {

    public static int length(String s){
        if(s.length() == 0){
            return 0;
        }

        return (length(s.substring(1)) + 1);
    }


    public static void main(String args[]){
        String s = "Dipan";
        System.out.println(length(s));
    }
}