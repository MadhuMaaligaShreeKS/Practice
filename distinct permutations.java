import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String input = "ABCA";
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        boolean[] used = new boolean[input.length()];
        backtrack(chars, used, "");
    }
    public static void backtrack(char[] chars, boolean[] used, String current) {
        if (current.length() == chars.length) {
            System.out.println(current);
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            if (used[i] || (i > 0 && chars[i] == chars[i - 1] && !used[i - 1])) {
                continue; // Skip duplicate characters that have already been used
            }
            used[i] = true;
            backtrack(chars, used, current + chars[i]);
            used[i] = false;
        }
    }
}
