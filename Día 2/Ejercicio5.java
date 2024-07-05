import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Introduce un numero");
            int a = sc.nextInt();
            if(a == 0){
                System.out.println("El numero es 0");
            }
            else if(a > 0){
                System.out.println("El numero es positivo");
            }
            else if(a < 0){
                System.out.println("El numero es negativo");
            }
            if(a%2==0){
                System.out.println("El numero es par");
            }
            else if(a%2!=0){
                System.out.println("El numero es impar");
            }
        }
    }
}