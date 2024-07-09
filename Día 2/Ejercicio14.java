import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 1 to convert Celsius to Fahrenheit, 2 to convert Fahrenheit to Celsius:");
            int option = sc.nextInt();

            switch (option) {
                case 1 ->                     {
                        System.out.println("Enter temperature in Celsius:");
                        double celsius = sc.nextDouble();
                        double fahrenheit = (celsius * 9 / 5) + 32;
                        System.out.printf("%.2f°C is equal to %.2f°F%n", celsius, fahrenheit);
                    }
                case 2 ->                     {
                        System.out.println("Enter temperature in Fahrenheit:");
                        double fahrenheit = sc.nextDouble();
                        double celsius = (fahrenheit - 32) * 5 / 9;
                        System.out.printf("%.2f°F is equal to %.2f°C%n", fahrenheit, celsius);
                    }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}