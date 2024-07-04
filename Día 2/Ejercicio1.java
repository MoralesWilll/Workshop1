import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("Ingrese los numeros que desee operar");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        int subs = a - b;
        int mult = a * b;
        int div = a / b;

        System.out.println("La suma es: " + sum + ", la resta es: " + subs + ", la multiplicacion es: " + mult + ", la division es: " + div);
    }

}