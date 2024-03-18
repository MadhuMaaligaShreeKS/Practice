import java.util.*;
public class Main
{
	 public static void main(String[] args) {
	 String str1 = "asdfghij";
        String str2 = "adsfgijh";

        if (str1.length() != str2.length()) {
            System.out.println("Input strings must have equal length.");
            return;
        }

        for (int i = 0; i < str1.length() - 1; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                System.out.println(str1.charAt(i) + "" + str1.charAt(i + 1) + "-" + str2.charAt(i) + "" + str2.charAt(i + 1));
            }
        }

	}

}
