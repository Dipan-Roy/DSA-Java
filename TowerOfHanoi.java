public class TowerOfHanoi {

    // Recursive function to solve Tower of Hanoi
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        // Base case
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }

        // Step 1: Move (n-1) disks from source → helper using destination as temporary
        towerOfHanoi(n - 1, src, dest, helper);

        // Step 2: Move the nth (largest) disk from source → destination
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);

        // Step 3: Move (n-1) disks from helper → destination using source as temporary
        towerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 3; // number of disks
        towerOfHanoi(n, "A", "B", "C");
    }
}
