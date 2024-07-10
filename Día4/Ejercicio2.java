import java.util.Scanner;

public class Ejercicio2{

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] lista = new int[5];
            lista[0] = sc.nextInt();
            lista[1] = sc.nextInt();
            lista[2] = sc.nextInt();
            lista[3] = sc.nextInt();
            lista[4] = sc.nextInt();
            int menor = 999999999;
            int mayor = -999999999;
            for(int i = 0; i < lista.length; i++){
                if(lista[i]<menor){
                    menor = lista[i];
                }
                if(lista[i]>mayor){
                    mayor = lista[i];
                }
            }
            System.out.println("El menor es: " + menor);
            System.out.println("El mayor es: " + mayor);
        }
    }

}