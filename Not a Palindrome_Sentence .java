import java.util.*;
public class Main {
    public static void main(String[] args) {
        String input = "he knows malayalam";
        String[] words = input.split("\\s+");
        
        printNonPalindromes(words);
    }
    public static void printNonPalindromes(String[] words) {
        for (String word : words) {
            if (!isPalindrome(word)) {
                System.out.print(word + " ");
            }
        }
    }

    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
