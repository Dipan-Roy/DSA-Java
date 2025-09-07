public class ContainsDuplicate{

    public static boolean contains_duplicate(int nums[]) {
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(i == j){
                    continue;
                }
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String args[]) {
        int nums[] = {1,2,3,1};
        System.out.println(contains_duplicate(nums));
    }
}

// Time complexity: O(n^2)