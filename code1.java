package Assessment;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class code1 {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("the palindrome you want to check");
                String str = scanner.nextLine();
                String rev = "";
                for (int i = str.length() - 1; i >= 0; i--) {
                        rev = rev + str.charAt(i);
                }
                System.out.println(rev);
                {
                        if (str.equals(rev))
                                System.out.println("given string is palindrome");

                        else
                                System.out.println("given string is not palindrome");


                }
        }
}
