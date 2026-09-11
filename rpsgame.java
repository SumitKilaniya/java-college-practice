import java.util.Scanner;

public class rpsgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("playerA - Enter your move (you an enter- rock , paper, scissors): ");
        String move = sc.nextLine();

        if (move.equals("rock")) {
            System.out.println("paper");
        } else if (move.equals("scissors")) {
            System.out.println("rock");
        } else if (move.equals("paper")) {
            System.out.println("scissors");
        } else {
            System.out.println("Invalid Input");
        }
    }

}
