public class string_Builder_DataStructure{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
}

// Time complexity: O(26)