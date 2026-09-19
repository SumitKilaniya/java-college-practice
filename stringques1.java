
//reverse string 
// valid alindrome
//is anagram
// print first unique character
// reverse word in string 
import java.util.*;

public class stringques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));

        }

    }
}
