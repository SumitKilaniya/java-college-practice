// EXAMPLE OF COMPARISON BETWEEN == AND .equals() METHOD IN JAVA
public class String1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str1 == str2); // true, because both refer to the same string literal in the string pool
        System.out.println(str1 == str3); // false, because str3 refers to a new String object in the heap
        System.out.println(str1.equals(str3)); // true, because .equals() compares the content of the strings
    }
}
