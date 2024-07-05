import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the total bill amount");
            double total = sc.nextDouble();

            System.out.print("Enter the tip percentage (%)");
            double tipPercentage = sc.nextDouble();

            double tipAmount = total * (tipPercentage / 100);
            double totalWithTip = total + tipAmount;

            System.out.printf("Tip amount: $%.2f%n", tipAmount);
            System.out.printf("Total with tip: $%.2f%n", totalWithTip);
        }
    }
}