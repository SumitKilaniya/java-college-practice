import java.util.*;

public class charity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of days u want to give to charity: ");
        int n = sc.nextInt();
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i * i;
            // total=total+i*i;
        }
        System.out.println("Total amount donated to charity is: " + total);
    }
}