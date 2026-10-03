import java.util.*;

public class GenerateParentheses {

    public static List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();

        backtrack(result, "", 0, 0, n);

        return result;
    }

    public static void backtrack(
            List<String> result,
            String current,
            int open,
            int close,
            int n) {

        // Base case
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        // Add opening parenthesis
        if (open < n) {
            backtrack(
                result,
                current + "(",
                open + 1,
                close,
                n
            );
        }

        // Add closing parenthesis
        if (close < open) {
            backtrack(
                result,
                current + ")",
                open,
                close + 1,
                n
            );
        }
    }

    public static void main(String[] args) {

        int n = 3;

        List<String> result = generateParenthesis(n);

        System.out.println(result);
    }
}