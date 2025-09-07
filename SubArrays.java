import java.util.*;

public class SubArrays {

    public static void sub_arrays(int num[]){
        int total_subArrays = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<num.length; i++){
            int start = i;
            for(int j=i; j<num.length; j++){
                int end = j;
                int sum = 0;
                for(int k=start; k<=end; k++){
                    System.out.print(num[k] + " ");
                    sum = sum + num[k];
                }
                total_subArrays++;
                System.out.println();
                System.out.println("Sum of the above sub-array is: " + sum);
                max = Math.max(max, sum);
                min = Math.min(min, sum); 
            }
            System.out.print("------------------");
            System.out.println();
        }
        System.out.println("Total no.of Sub-Arrays: " + total_subArrays);
        System.out.println("Maximum Subarray: " + max);
        System.out.println("Minimum Subarray: " + min);
    }

    public static void main(String args[]){
        int num[] = {2, 4, 6, 8, 3, 4, 9};

        sub_arrays(num);
    }
}

// Time Complexity: O(n^3) - using Brute Force