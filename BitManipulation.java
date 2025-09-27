public class BitManipulation{

    public static void OddorEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("No. is even");
        } else {
            System.out.println("No. is odd");
        }
    }

    public static int  getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit){
        n = clearIthBit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }

    public static int clearLastIBits(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    public static int clearBitsInRange(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = ((1<<i)-1);
        int bitmask = a|b;
        return n & bitmask; 
    }

    public static boolean isPowerOfTwo(int n){
        return (n&(n-1)) == 0;
    }

    public static int countSetBits(int n){
        int count = 0;
        while(n > 0){
            if((n&1) != 0){ // Check our LSB
                count++;
            }
            n = n>>1;
        }

        return count;
        
        // Time complexity : O(log n)
    }

    public static void main(String args[]){
        OddorEven(3); // odd
        OddorEven(6); // even
        System.out.println("-----------");

        System.out.println(getIthBit(10, 3));
        System.out.println("-----------");

        System.out.println(setIthBit(10, 2));
        System.out.println("-----------");

        System.out.println(clearIthBit(10, 1));
        System.out.println("-----------");

        System.out.println(updateIthBit(10, 2, 1));
        System.out.println("-----------");

        System.out.println(clearLastIBits(15, 2));
        System.out.println("-----------");

        System.out.println(clearBitsInRange(10, 2, 4));
        System.out.println("-----------");

        System.out.println(isPowerOfTwo(16));
        System.out.println("-----------");

        System.out.println(countSetBits(10));
        System.out.println("-----------");
    } 
}