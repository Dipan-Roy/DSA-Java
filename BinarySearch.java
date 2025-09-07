public class BinarySearch {

    public static int binary_search(int numbers[], int key){
        int start = 0, end = numbers.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;

            // comparisons
            if(numbers[mid] == key){ // found
                return mid;
            }
            if(numbers[mid] > key){ // left
                end = mid - 1;
            } else if (numbers[mid] < key) { // right 
                start = mid + 1;
            }
        }

        return -1;
    }


    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10, 13, 17, 19, 21};
        int key = 17;

        System.out.println("The index for the key is: " + binary_search(numbers, key));
    }
}

// Time complexity: O(log n)