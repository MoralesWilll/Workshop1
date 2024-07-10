public class Ejercicio1 {

    public static void main(String[] args) {
        double[] notas = {85.5, 92.0, 78.2, 95.1, 88.8, 76.4, 91.3, 82.9, 98.5, 89.2};
        Double total = 0d;
        for(int i = 0; i < notas.length; i++){
            System.out.println((i+1) + ". " + notas[i]);
            total = total + notas[i];
        }
        Double promedio = total/(notas.length+1);
        System.out.println("El promedio es: " + promedio);
    }


}