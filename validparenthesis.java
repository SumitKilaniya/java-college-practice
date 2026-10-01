import java.util.*;

public class validparenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    System.out.println("Invalid");
                    return;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    System.out.println("Invalid");
                    return;
                }
            }
        }
        if (!stack.isEmpty()) {
            System.out.println("Invalid");
        } else {
            System.out.println("Valid");
        }
    }
}
