//printh the element of the even idenx number
public class ques3array {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int i = 0; i < arr1.length; i++) {
            if (i % 2 == 0) {
                System.out.println(arr1[i]);
            }
        }
    }
}

