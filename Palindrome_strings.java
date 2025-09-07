public class Palindrome_strings{

    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                //not a Palindrome
                return false;
            }
        }
        return true;

        // Time Complexity: O(n) - linear time complexity
    }


    public static void main(String args[]){
        String str = "noon";
        System.out.println(isPalindrome(str));
    }
}