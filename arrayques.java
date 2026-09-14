// find the sum of the elements in an array.

public class arrayques {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 40;
        arr1[3] = 50;
        arr1[4] = 60;

        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        System.out.println("The sum of the elements in the array is: " + sum);
    }
}
