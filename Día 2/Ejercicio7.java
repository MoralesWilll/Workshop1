import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;

        while (true) {
            System.out.println();
            System.out.println();
            System.out.println("Select an option:");
            System.out.println("1. Quit");
            System.out.println("2. Sum");
            System.out.println("3. Subtraction");
            System.out.println("4. Multiplication");
            System.out.println("5. Division");
            option = sc.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                case 2 -> {
                    System.out.println("Enter two numbers add");
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();
                    int sum = num1 + num2;
                    System.out.println("The sum is: " + sum);
                }
                case 3 -> {
                    System.out.println("Enter two numbers to subtract");
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();
                    int subtraction = num1 - num2;
                    System.out.println("The subtraction is: " + subtraction);
                }
                case 4 -> {
                    System.out.println("Enter two numbers to multiply");
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();
                    int multiplication = num1 * num2;
                    System.out.println("The multiplication is: " + multiplication);
                }
                case 5 -> {
                    System.out.println("Enter two numbers to divide");
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();
                    if (num2 != 0) {
                        double division = (double) num1 / num2;
                        System.out.println("The division is: " + division);
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
            sc.close();
        }
    }
}