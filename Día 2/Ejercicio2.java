import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = 18 - a;
            if (a >= 18){
                System.out.println("Eres mayor de edad, bienvenido");
            }
            else {
                System.out.println("No eres mayor de edad, vuelve en " + b + " años");
            }
        }
    }
}