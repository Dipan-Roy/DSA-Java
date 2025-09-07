import java.util.*;

public class Sorting {

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                //swap
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArr(arr);

        // Time complexity of Bubble sort : O(n^2)
    }

    public static void selectionSort(int arr[]) {
        // outer loop - for turns/passes
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            // inner loop - to traverse the whole array at each turn and find the smallest element in each turn
            for(int j = i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        printArr(arr);

        // Time complexity of selection sort : O(n^2)
    }

    public static void insertionSort(int arr[]) {
        for(int i=1; i<arr.length; i++){
          int curr = arr[i];
          int prev = i-1;
          // shifting - finding out the correct position to insert
          while(prev >= 0 && arr[prev] > curr){
            arr[prev+1] = arr[prev];
            prev--;
          } 
          // insertion
          arr[prev + 1] = curr;
        }
        printArr(arr);

        // Time complexity of insertion sort : O(n^2)
    }

    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        // Constructing the "count" array -- main array elements => count array index 
        int count[] = new int[largest+1]; // largest+1 => as we take from 0 to the largest no. as count array index
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        // Sorting
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

        printArr(arr);

        // Time complexity of counting sort: O(n + range)
    }


    public static void main(String args[]){
        int arr[] = {3, 2, 4, 1, 9, 5};

        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);


        // Inbuilt sort
        // Arrays.sort(arr);
        // printArr(arr);

        // Arrays.sort(arr, 1, 4);
        // printArr(arr);

        countingSort(arr);

    }
}