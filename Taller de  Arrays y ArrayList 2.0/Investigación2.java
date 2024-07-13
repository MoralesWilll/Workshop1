import java.util.HashMap;
import java.util.Map;

public class Investigación2 {

    public static void main(String[] args) {
        Map<String, String> colorCodes = new HashMap<>();
        colorCodes.put("Red", "#FF0000");
        colorCodes.put("Green", "#00FF00");
        colorCodes.put("Blue", "#0000FF");
        System.out.println("Color codes: " + colorCodes);
        System.out.println("Code for Red: " + colorCodes.get("Red"));
        colorCodes.remove("Green"); 
        System.out.println("Color codes after removal: " + colorCodes);

        Map<String, Integer> numberValues = new HashMap<>();
        numberValues.put("One", 1);
        numberValues.put("Two", 2);
        numberValues.put("Three", 3);
        System.out.println("Number values: " + numberValues);
        System.out.println("Value for One: " + numberValues.get("One"));
        numberValues.remove("Two"); 
        System.out.println("Number values after removal: " + numberValues);
    }
}