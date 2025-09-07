public class StringCompression{

    public static String compress(String str){
        StringBuilder sb = new StringBuilder("");

        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1){
                sb.append(count.toString());
            }
        }

        return sb.toString();
    }

    public static void main(String args[]){
        String str = "aaabbbccd";
        System.out.println(compress(str));
    }
}

// Time complexity: O(n) => it has O(n), even though we have nested loops as in the inner loop we are also increasing i++ so,
// it could only go upto str.length() as defined in the outer loop. hence, overall the loop could only go upto str.length(),
// Therefore, we have linear time complexity, i.e, O(n)