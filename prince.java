import java.util.Scanner;

public class prince {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temerature: ");
        int temp = sc.nextInt();
        if (temp < 0) {
            System.out.println("Too cold for outdoor activity");
        } else {
            System.out.println("Safe for outdoor activities ");
        }
    }
}
