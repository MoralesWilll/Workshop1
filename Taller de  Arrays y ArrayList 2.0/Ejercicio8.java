public class Ejercicio8 {

    public static void main(String[] args) {
        int[][] a = new int[4][4];
        int[][] b = new int[4][4];
        Boolean symmetrical = true;
        if(a.length == a[0].length){
            System.out.println("The matrix is square");
            for(int i = 0; i < a.length; i++){
                for(int j = 0; j < a[i].length; j++){
                    b[j][i] = a[i][j];
                }   
            }

            for(int i = 0; i < a.length; i++){
                for(int j = 0; j < a[i].length; j++){
                    if(a[i][j] != b[j][i]){
                        symmetrical = false;
                        break;
                    }
                }   
            }

            if(symmetrical){
                System.out.println("The matrix is simetrical");
            }
            else{
                System.out.println("The matrix is not simetrical");
            }
        }
        else{
            System.out.println("The matrix is not square");
        }
    }

}