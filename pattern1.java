public class pattern1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
        for (int j = 2; j <= 1; j--) {
            for (int i = 1; i <= j; i--) {
                System.out.print("*");
            }
            System.out.print("");

        }
    }
}
