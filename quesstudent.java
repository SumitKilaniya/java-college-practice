
import java.util.*; 
class quesstudent{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
         System.out.print("Enter your AGE: ");
        int AGE = sc.nextInt();
       
         System.out.print("Enter your CGPA: ");
        Float CGPA = sc.nextFloat();
   
         System.out.print("Enter your GRADE: ");
        Character GRADE = sc.next().charAt(0);
        sc.nextLine();
        System.out.println("Welcome     " + "[" + name + "]");
        System.out.println("AGE: " + AGE);
        System.out.println("CGPA: " + CGPA);
        System.out.println("GRADE: " + GRADE);
    }
}