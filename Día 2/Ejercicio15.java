import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Introduce la calificacion");
            int calificacion = sc.nextInt();
            if(calificacion >= 90){
                System.out.println("Sacaste una A");
            } else if(calificacion >= 80){
                System.out.println("Sacaste una B");
            } else if(calificacion >= 70){
                System.out.println("Sacaste una C");
            } else if(calificacion >= 60){
                System.out.println("Sacaste una D");
            } else {
                System.out.println("Sacaste una F");
            }
        }
    }

}