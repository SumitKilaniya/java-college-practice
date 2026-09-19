import java.util.Scanner;

public class stringques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        StringBuilder rev_str = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            rev_str.append(str.charAt(i));

        }
        if (rev_str.toString().equals(str) == true) {

            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
    }
}
