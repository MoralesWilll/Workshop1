import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text:");
        String text = sc.nextLine().toLowerCase();
        System.out.println("Enter a word to search:");
        String word = sc.nextLine().toLowerCase();
        
        int startIndex = text.indexOf(word);
        if (startIndex!= -1) {
            int endIndex = startIndex + word.length() - 1;
            System.out.println("The word '" + word + "' is found at index " + startIndex + " and ends at index " + endIndex);
        } else {
            System.out.println("The word '" + word + "' is not found in the text.");
        }
    }

}