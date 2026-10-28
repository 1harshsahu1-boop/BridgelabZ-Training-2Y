package Recursion;

import java.util.ArrayList;
import java.util.List;

public class FindSubSequence {

    private static void generateSubsequences(String str, int index, String current, List<String> result) {
        if (index == str.length()) {
            result.add(current);
            return;
        }
        generateSubsequences(str, index + 1, current + str.charAt(index), result);
        generateSubsequences(str, index + 1, current, result);
    }
    public static List<String> getSubsequences(String str) {
        List<String> result = new ArrayList<>();
        generateSubsequences(str, 0, "", result);
        return result;
    }

    public static void main(String[] args) {
        String input = "abc";
        List<String> subsequences = getSubsequences(input);
        System.out.println("Total Subsequences: " + subsequences.size());
        System.out.println("Subsequences: " + subsequences);
    }
}

