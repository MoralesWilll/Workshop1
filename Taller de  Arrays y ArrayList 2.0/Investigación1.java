import java.util.ArrayList;

public class Investigación1 {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println("Colors: " + colors);
        System.out.println("First color: " + colors.get(0));
        colors.remove(1);
        System.out.println("Colors after removal: " + colors);

        // Number examples
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Numbers: " + numbers);
        System.out.println("First number: " + numbers.get(0));
        numbers.remove(1);
        System.out.println("Numbers after removal: " + numbers);
    }
}