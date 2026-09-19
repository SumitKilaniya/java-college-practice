import java.util.*;

public class stringques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter a second string: ");
        String str2 = sc.nextLine();
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        String sorted_str1 = new String(char1);
        String sorted_str2 = new String(char2);
        if (sorted_str1.equals(sorted_str2)) {
            System.out.println("The strings are anagrams");
        } else {
            System.out.println("The strings are not anagrams");
        }

    }

}
