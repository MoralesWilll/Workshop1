import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] products = {"Apple", "Bread", "Milk", "Eggs", "Chicken Breast", "Rice", "Tomato Sauce", "Onion", "Carrots", "Banana"};
            double[] prices = {0.99, 1.49, 2.99, 1.99, 5.99, 1.29, 1.79, 0.69, 0.89, 0.49};
            System.out.println("Please enter the number of the item you want");
            for(int i = 0; i < products.length; i++){
                System.out.println((i+1) + ". " + products[i]);
            }
            int itemNumber = sc.nextInt()-1;
            if(itemNumber < 0 || itemNumber >= products.length){
                System.out.println("Invalid item number. Please try again.");
                return;
            }
            System.out.println("Your chosen product is: $" + prices[itemNumber]);
            System.out.println("How many will you take?");
            int itemQuantity = sc.nextInt();
            double totalPrice = prices[itemNumber] * itemQuantity;
            System.out.printf("Total price: $%.2f%n", totalPrice);
        }
    }

}