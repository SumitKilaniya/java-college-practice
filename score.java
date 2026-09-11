import java.util.Scanner;

public class score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter score of student 1 : ");
        int A = sc.nextInt();
        System.out.print("Enter score of student 2 : ");
        int B = sc.nextInt();
        System.out.print("Enter score of student 3 : ");
        int C = sc.nextInt();

        if ((A > B & B > C) || (C > B & B > A)) {
            System.out.println("Student 2 has the second highest score");
        } else if ((B > A & A > C) || (C > A & A > B)) {
            System.out.println("Student 1 has the second highest score");
        } else if ((A > C & C > B) || (B > C & C > A)) {
            System.out.println("Student 3 has the second highest score");
        } else {
            System.out.println("All students have equal scores");

        }
    }
}
