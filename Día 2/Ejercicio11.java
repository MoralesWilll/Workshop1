import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if(a>=b && b>=c){
                System.out.println("El orden es: " + a + ", " + b + ", " + c);
            }
            else if(b>=a && a>=c){
                System.out.println("El orden es: " + b + ", " + a + ", " + c);
            }
            else if(c>=a && a>=b){
                System.out.println("El orden es: " + c + ", " + a + ", " + b);
            }
            else if(a>=c && c>=b){
                System.out.println("El orden es: " + a + ", " + c + ", " + b);
            }
            else if(b>=c && c>=a){
                System.out.println("El orden es: " + b + ", " + c + ", " + a);
            }
            else if(c>=b && b>=a){
                System.out.println("El orden es: " + c + ", " + b + ", " + a);
            }
        }
    }

}