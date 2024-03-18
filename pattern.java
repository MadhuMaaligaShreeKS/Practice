import java.util.*;
public class Main
{
	 public static void main(String[] args) {
	 int  n=4;
     
        for (int i = 1; i <= 2 * n - 1; i++) {
            int spaces = Math.abs(n - i);
            int num = n - spaces;
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
     
            for (int j = 1; j <= num; j++) {
                System.out.print(j + " ");
            }
                        for (int j = num - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            
            System.out.println();
        }
    }

}
