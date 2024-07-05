import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter three grades between 0 and 10:");
            int grade1 = sc.nextInt();
            int grade2 = sc.nextInt();
            int grade3 = sc.nextInt();
            
            if (grade1 < 0 || grade1 > 10 || grade2 < 0 || grade2 > 10 || grade3 < 0 || grade3 > 10) {
                System.out.println("Invalid grades. Please enter grades between 0 and 10.");
                return;
            }
            
            double average = (grade1 + grade2 + grade3) / 3.0;
            
            System.out.println("The average is: " + average);
            
            if (average >= 6) {
                System.out.println("The student passed.");
            } else {
                System.out.println("The student failed.");
            }
        }
    }
}