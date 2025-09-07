import java.util.*;

public class MaxSubArraySum {

    // using Prefix sum
    public static void max_SubArray_sum(int num[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];

        prefix[0] = num[0];
        // calculate prefix array
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + num[i];
        }

        for(int i=0; i<num.length; i++){
            int start = i;
            for(int j=i; j<num.length; j++){
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Max sum using Prefix sum is: " + maxSum);
    }

    // using Kadane's Algo
    public static void kadanes(int num[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0; i<num.length; i++){
            currSum = currSum + num[i];
            if(currSum < 0){
                currSum = 0;
            }

            maxSum = Math.max(currSum, maxSum);
        }

        System.out.println("max sum using Kadane's algo is: " + maxSum);
    }

    // kadane's algo with negative array edge cases covered (special case)
    public static void leetcode_kadanes(int num[]){
        int max = num[0];
        int curr = num[0];

        for(int i=1; i<num.length; i++){
            curr = Math.max(num[i], num[i] + curr);

            max = Math.max(curr, max);
        }

        System.out.println("max using kadanes(leetcode): " + max);
    }

    public static void main(String args[]){
        int num[] = {1, -2, 6, -1, 3};

        max_SubArray_sum(num);

        System.out.println("---------------");

        kadanes(num);

        System.out.println("---------------");

        leetcode_kadanes(num);
    }
}

// Time complexity: O(n^2) [ n + n^2 , so finally it would be O(n^2) ] -----> using Prefix sum
// Time complexity: O(n) ------> using Kadane's Algo [if we get a array of all -ve no.s, then for that we need to make a special case]