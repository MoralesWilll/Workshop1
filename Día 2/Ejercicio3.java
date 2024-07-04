import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Double m = 1.60934;
        Double b = a * m;
        System.out.println( a + "Kilometros son equivalentes a " + b + "Millas");
    }

}
