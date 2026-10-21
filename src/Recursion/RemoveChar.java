package Recursion;
public class RemoveChar{
    public static String removeChar(String str, char ch) {
        if (str == null || str.length() == 0) {
            return "";
        }
        char first = str.charAt(0);
        if (first == ch) {
            return removeChar(str.substring(1), ch);
        } else {
            return first + removeChar(str.substring(1), ch);
        }
    }
    public static void main(String[] args) {
        String s = "programming";
        char toRemove = 'm';
        String result = removeChar(s, toRemove);
        System.out.println(result);
    }
}
