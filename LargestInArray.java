import java.util.*;

public class LargestInArray {

    public static int largest(int num[]){
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity

        for(int i=0; i<num.length; i++){
            if(largest < num[i]){
                largest = num[i];
            }   

            if(smallest > num[i]){
                smallest = num[i];
            }     
        }

        System.out.println("The smallest Element is: " + smallest);

        return largest;
    }

    public static void main(String args[]) {
        int num[] = {1, 3, 6, 23, 14, 8, 20};
        System.out.println("The largest Element is: " + largest(num));
    }
}

// Time complexity: O(n)