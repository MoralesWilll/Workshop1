import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Introduce tu peso");
            System.out.println("Introduce tu altura");
            double peso = sc.nextDouble();
            double altura = sc.nextDouble();
            double imc = peso / (altura * altura);
            System.out.println("Tu IMC es: " + imc);
        }
    }
    
}