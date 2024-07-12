import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double totalPrice = sc.nextDouble();
        Double discount = 0d;
        if (totalPrice >= 200 && totalPrice < 300) {
            discount = totalPrice*0.1;
        }
        else if (totalPrice >= 300 && totalPrice < 500) {
            discount = totalPrice*0.15;
        }
        else if (totalPrice >= 500 && totalPrice < 1000) {
            discount = totalPrice*0.2;
        }
        else if (totalPrice >= 1000) {
            discount = totalPrice*0.25;
        }
        System.out.println("El descuento es: " + discount);
            System.out.println("El precio final es: " + (totalPrice - discount));
    }

}