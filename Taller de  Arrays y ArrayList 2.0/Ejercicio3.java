import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Double minAverage = 76d;
            Double totalGrades = 0d;
            int counter = 0;
            System.out.println("Please input 8 grades, or -1 if you have inputed all the grades you have");
            for(int i = 0; i < 8; i++){
                int a = sc.nextInt();
                if(a == -1){
                    break;
                }
                totalGrades = totalGrades + a;
                counter = counter + 1;
            }
            Double avg = totalGrades/counter;
            int rem = 8-counter;
            Double neededTotal =(minAverage * 8) - totalGrades;
            Double remAvg = neededTotal/rem;
            if(counter != 8){
                System.out.println(rem);
                System.out.println(avg);
                System.out.println("You need " + remAvg + " in average in the remaining " + rem + " grades to pass");
            }
            else {
                System.out.println("Your average is " + avg);
                if(avg >= minAverage){
                    System.out.println("Congratulations! You passed");
                }
                else {
                    System.out.println("You failed");
                }
            }            
        }
    }

}