package Strings;
import java.util.*;
public class PalindromeS{
    static boolean isPalindrome(String str)
    {
        int l = 0;
        int h = str.length() - 1;
        while (h > l)
        {
            if (str.charAt(l++) != str.charAt(h--))
            {
                return false;
            }
        }
        return true;
    }
    static ArrayList<String> PalindromicStrings(String []arr,
                                                int N)
    {
        ArrayList<String> ans = new ArrayList<String>();
        for (int i = 0; i < N; i++) {
            if (isPalindrome(arr[i])) {
                ans.add(arr[i]);
            }
        }
        return ans;
    }
    public static void main(String args[])
    {

        String []arr
                = { "abc", "car", "ada", "racecar", "cool" };
        int N = arr.length;
        ArrayList<String> s = PalindromicStrings(arr, N);
        if(s.size() == 0)
            System.out.print("-1");
        for (String st : s)
            System.out.print(st + " ");

    }
}
