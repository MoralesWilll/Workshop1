import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[][] sillas = new boolean[5][10];
        for (int i = 0; i < sillas.length; i++) {
            for (int j = 0; j < sillas[i].length; j++) {
                sillas[i][j] = true;
            }
        }

        while (true) {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("1. Para mostrar sillas");
            System.out.println("2. Para contar sillas disponibles");
            System.out.println("3. Para reservar una silla");
            System.out.println("4. Para quitar la reserva una silla");
            System.out.println("5. Para salir");
            int option = sc.nextInt();

            switch (option) {
                case 1 -> {
                    for (int i = 0; i < sillas.length; i++) {
                        for (int j = 0; j < sillas[i].length; j++) {
                            if (sillas[i][j] == true) {
                                System.out.print("O");
                            } else {
                                System.out.print("X");
                            }
                        }
                        System.out.println();
                    }
                }
                case 2 -> {
                    int libres = 0;
                    for (int i = 0; i < sillas.length; i++) {
                        for (int j = 0; j < sillas[i].length; j++) {
                            if (sillas[i][j] == true) {
                                libres = libres + 1;
                            }
                        }
                    }
                    System.out.println("Hay " + libres + " sillas disponibles");
                }
                case 3 -> {
                    System.out.println("Ingrese el número de fila (1-5): ");
                    int fila = sc.nextInt() - 1;
                    System.out.println("Ingrese el número de columna (1-10): ");
                    int columna = sc.nextInt() - 1;
                    if (fila >= 0 && fila < 5 && columna >= 0 && columna < 10) {
                        if (sillas[fila][columna] == true) {
                            sillas[fila][columna] = false;
                            System.out.println("Silla reservada con éxito");
                        } else {
                            System.out.println("Silla ya reservada");
                        }
                    } else {
                        System.out.println("Número de fila o columna inválido");
                    }
                }
                case 4 -> {
                    System.out.println("Ingrese el número de fila (1-5): ");
                    int fila = sc.nextInt() - 1;
                    System.out.println("Ingrese el número de columna (1-10): ");
                    int columna = sc.nextInt() - 1;
                    if (fila >= 0 && fila < 5 && columna >= 0 && columna < 10) {
                        if (sillas[fila][columna] == false) {
                            sillas[fila][columna] = true;
                            System.out.println("Reserva quitada con éxito");
                        } else {
                            System.out.println("Silla no reservada");
                        }
                    } else {
                        System.out.println("Número de fila o columna inválido");
                    }
                }
                case 5 -> {
                    System.out.println("Saliendo...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Opción inválida");
            }
        }
    }
}