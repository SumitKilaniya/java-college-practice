// array is palidrome or not
public class palinarray {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 2, 1 };
        int count = 0;

        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] == arr[arr.length - 1 - i]) {
                count++;
            }
        }

        if (count == arr.length / 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
