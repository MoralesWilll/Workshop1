import java.util.Scanner;

public class Ejercicio13 {

    static Double fee = 2.57;
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Introduce el numero de kilometros recoridos");
            Double km = sc.nextDouble();
            Double total = fee * km;
            System.out.println("El costo del viaje es: " + total + " USD");
        }
    }

}