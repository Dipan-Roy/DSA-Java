// Binary Strings Problem
// Print all binary strings of size N without consecutive ones.

public class BinaryStrings {

    public static void printBinaryStrings(int n, int lastPlace, String str){
        // Base case 
        if(n == 0){
            System.out.println(str);
            return;
        }

        // Work
        if(lastPlace == 0){ // when we will put "0" in the last place
            printBinaryStrings(n-1, 0, str+"0"); // we place 0
            printBinaryStrings(n-1, 1, str+"1"); // We place 1
        } else { // When we will put "1" in the last place
            printBinaryStrings(n-1, 0, str+"0"); // we place 0
        }

    //    // Clean consized code
    //     printBinaryStrings(n-1, 0, str+"0"); // we place 0

    //     if(lastPlace == 0){
    //         printBinaryStrings(n-1, 1,  str+"1"); // We place 1
    //     }
    }

    public static void main(String args[]){
        printBinaryStrings(3, 0, "");
    }
}