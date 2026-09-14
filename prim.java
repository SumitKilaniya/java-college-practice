import java.util.*;

public class prim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your ProductID: ");
        int num = sc.nextInt();
        // if (num % num == 0 && num % 2 != 0) {
        // System.out.println("Primium product");
        // } else if (num == 1) {
        // System.out.println("Regular product ");
        // } else {
        // System.out.println("Regular product");
        // }
        int count = 0;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                count += 1;
            }
        }
        if (count == 1) {
            System.out.println("Primium product");
        } else {
            System.out.println("Regular product");
        }
    }

}
