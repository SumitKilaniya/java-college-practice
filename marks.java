import java.util.*;
public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int class_size = sc.nextInt();
        int[] marks = new int[class_size];
        for (int i=0;i<class_size;i++) {
            marks[i]=sc.nextInt();
        }
        System.out.println("Marks: " + Arrays.toString(marks));
    }
    
    
}
