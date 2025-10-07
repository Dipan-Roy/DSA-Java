public class Recursion{

    public static void printDec(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }

    public static void printInc(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        int fnm1 = factorial(n-1);
        int fn = n * fnm1;
        return fn;

        // Time complexity: O(n)
        // Space complexity: O(n)
    }

    public static int sumOfNaturalNos(int n){
        if(n == 1){
            return 1;
        }
        int sumOfnm1 = sumOfNaturalNos(n-1);
        int sumOfn = n + sumOfnm1;
        return sumOfn;

        // Time complexity: O(n)
        // Space complexity: O(n)
    }

    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;

        // Time complexity: O(2^n)
        // space complexity: O(n)
    }

    public static boolean is_Sorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }

        return is_Sorted(arr, i+1);

        // Time complexity: O(n)
        // Space complexity: O(n)
    }

    public static int firstOccurence(int arr[], int key, int i){
        if(i == arr.length-1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }

        return firstOccurence(arr, key, i+1);

        // Time complexity: O(n)
        // Space complexity: O(n)
    }

    public static int lastOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);

        if(isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;
    }

    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        return x * power(x, n-1);

        // Time complexity: O(n)
    }

    public static void main(String args[]){
        int n = 5;
        printDec(n);
        System.out.println();
        printInc(n);
        System.out.println();
        System.out.println(factorial(n));
        System.out.println(sumOfNaturalNos(n));

        // Print nth Fibonacci no.
        System.out.println(fib(8));

        // check if array is sorted or not
        int arr[] = {1,2,3,4,5,5};
        System.out.println(is_Sorted(arr, 0));

        // First occurence
        System.out.println(firstOccurence(arr, 5, 0));

        // Last occurence
        System.out.println(lastOccurence(arr, 5, 0));

        // Print x^n
        System.out.println(power(2, 10));

    }
}