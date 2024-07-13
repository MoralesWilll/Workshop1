public class Ejercicio9 {

    public static void main(String[] args) {
        int[] a = {0, 2, 0, 5, 5, 6, 8, 4 ,3 , 7, 9, 4, 3 ,2 ,4, 7, 6, 1, 2};
        int[][] b = new int[a.length][2];
        int swapA;
        int swapB;
        int[] printed = new int[10];
        int printedIndex = 0;
        for(int i = 0; i < a.length; i++){
            b[i][0] = a[i];
            b[i][1] = 0;
        }
        for(int i = 0; i < a.length; i++){
            for(int num: a){
                if (num == b[i][0]) {
                    b[i][1] = b[i][1] + 1;
                }
            }
        }

        for (int i = 0; i < b.length - 1; i++) {
            for (int j = 0; j < b.length - i - 1; j++) {
                if (b[j][1] < b[j + 1][1]) {
                    swapA = b[j][0];
                    swapB = b[j][1];
                    b[j][0] = b[j + 1][0];
                    b[j][1] = b[j + 1][1];
                    b[j + 1][0] = swapA;
                    b[j + 1][1] = swapB;
                }
            }
        }

        for (int[] b1 : b) {
            boolean alreadyPrinted = false;
            for (int i = 0; i < printedIndex; i++) {
                if (b1[0] == printed[i]) {
                    alreadyPrinted = true;
                    break;
                }
            }
            if (!alreadyPrinted) {
                System.out.println("Number: " + b1[0] + ", Frequency: " + b1[1]);
                printed[printedIndex++] = b1[0];
            }
        }
    }

}