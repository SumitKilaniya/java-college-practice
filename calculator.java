// create a calculator class and take two number from user and perform
// addition,subtraction,multiplication,division

class calculator {

    public static void main(String[] args) {

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        String operation = args[2];

        // if (operation == "+") {
        // System.out.println(num1 + num2);
        // } else if (operation == "-") {
        // System.out.println(num1 - num2);
        // } else if (operation == "*") {
        // System.out.println(num1 * num2);
        // } else if (operation == "/") {
        // System.out.println(num1 / num2);
        // } else {
        // System.out.println("Invalid operation");

        if (operation.equals("+")) {
            System.out.println("Addition = " + (num1 + num2));
        } else if (operation.equals("-")) {
            System.out.println("Subtraction = " + (num1 - num2));
        } else if (operation.equals("*")) {
            System.out.println("Multiplication = " + (num1 * num2));
        } else if (operation.equals("/")) {
            System.out.println("Division = " + (num1 / num2));
        } else {
            System.out.println("Invalid operation");
        }
    }
}