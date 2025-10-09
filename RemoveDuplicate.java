public class RemoveDuplicate {

    public static void removeDuplicate_fromStrings(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            // Duplicate
            removeDuplicate_fromStrings(str, idx+1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicate_fromStrings(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static void main(String args[]){
        String str = "diippaaann"; // a-z (lowercase only)
        removeDuplicate_fromStrings(str, 0, new StringBuilder(""), new boolean[26]);
    }
}