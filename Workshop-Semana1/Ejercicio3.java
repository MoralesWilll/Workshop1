import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] grades = new int[8];
        int minAverage = 76;
        int totalGrades = 0;
        int counter = 0;
        System.out.println("Please input 8 grades, or -1 if you have inputed all the grades you have");
        for(int i = 0; i > 8; i++){
            int a = sc.nextInt();
            if(a == -1){
                return;
            }
            grades[i] = a;
            totalGrades = totalGrades + a;
            counter = counter + 1;
        }
        int avg = totalGrades/counter;
        
    }

}