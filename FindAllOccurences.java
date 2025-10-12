// For a given integer array of size N. You have to find all the occurrences
// (indices) of a given element (Key) and print them. Use a recursive function to solve this
// problem.

public class FindAllOccurences {

    public static void printAllOccurrences(int arr[], int key, int start){
        // base
        if(arr.length-1 < start){
            return;
        }

        // work 
        if(arr[start] == key){
            System.out.print(start + " ");
        }

        printAllOccurrences(arr, key, start+1);
    }
    public static void main(String args[]){
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        printAllOccurrences(arr, key, 0);
    } 
}