import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingresa el numero del mes que deseas consultar");
            int a = sc.nextInt();
            int d;
            String m;
            switch (a) {
                case 1 -> {
                    d = 31;
                    m = "Enero";
                    System.out.println("El mes de " + m + " tiene " + d + " días");
                }
                case 2 -> {
                    d = 28;
                    m = "Febrero";
                    System.out.println("El mes de " + m + " tiene " + d + " días");
                }case 3 -> {
                    d = 31;
                    m = "Marzo";
                    System.out.println("El mes de " + m + " tiene " + d + " días");
                }case 4 -> {
                    d = 30;
                    m = "Abril";
                    System.out.println("El mes de " + m + " tiene " + d + " días");
                }case 5 -> {
                    d = 31;
                    m = "Mayo";
                    System.out.println("El mes de " + m + " tiene " + d + " días");
                }case 6 -> {
                    d = 30;
                    m = "Junio";
                    System.out.println("El mes de " + m + " tiene " + d + " días");
                }case 7 -> {
                    d = 31;
                    m = "Julio";
                    System.out.println("El mes de " + m + " tiene " + d + " días");
                }case 8 -> {
                    d = 31;
                    m = "Agosto";
                    System.out.println("El mes de " + m + " tiene " + d + " días");
                }case 9 -> {
                    d = 30;
                    m = "Septiembre";
                    System.out.println("El mes de " + m + " tiene " + d + " días");
                }case 10 -> {
                    d = 31;
                    m = "Octubre";
                    System.out.println("El mes de " + m + " tiene " + d + " días");
                }case 11 -> {
                    d = 30;
                    m = "Noviembre";
                    System.out.println("El mes de " + m + " tiene " + d + " días");
                }case 12 -> {
                    d = 31;
                    m = "Diciembre";
                    System.out.println("El mes de " + m + " tiene " + d + " días");
                }
            }
        }
    }
}