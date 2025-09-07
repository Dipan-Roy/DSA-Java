public class LinearSearch {

    public static int linear_search(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int key = 14;

        int index = linear_search(numbers, key);
        if(index == -1){
            System.out.println("Not Found!");
        } else {
            System.out.println("The element is present at index : " + index);
        }
    }
}

// Time Complexity of Linear Search is : O(n)