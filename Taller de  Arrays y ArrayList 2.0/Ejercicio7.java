public class Ejercicio7 {

    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        int[][] a = new int[5][5];
        int filler = 1;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = filler;
                filler = filler + 1; 
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(String.format("%3d", matrix[i][j]));
            }
            System.out.println();
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                a[j][i] = matrix[i][j];
            }
        }

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.print(String.format("%3d", a[i][j])); 
            }
            System.out.println();
        }

    }

}