// Qs => convert each first letter of each word into Uppercase

public class ToUpperCase_Strings{

    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        char first_ch = Character.toUpperCase(str.charAt(0));
        sb.append(first_ch);

        for(int i = 1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();

        // Time complexity: O(n)
    }

    public static void main(String args[]){
        String str = "hi! i'm dipan!!";
        System.out.println(toUpperCase(str));
    }
}