public class ReverseAnArray {

    public static void reverse(int num[]){
        int start = 0, end = num.length - 1;

        while(start < end){
            //swap 
            int temp = num[start];
            num[start] = num[end];
            num[end] =  temp;

            // update
            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        int num[] = {1, 2, 3, 4, 5, 6}; 

        reverse(num);

        for(int i=0; i<num.length; i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}

// Time complexity: O(n) , Space complexity: O(1)