package Recursion;
public class StringTraverse {

    public static void traverse(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        System.out.print(str.charAt(0)+" ");
        traverse(str.substring(1));
    }

    public static void main(String[] args) {
        String text = "Recursion";4
        traverse(text);
    }
}

