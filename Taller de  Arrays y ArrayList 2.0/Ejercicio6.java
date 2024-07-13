import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] list = {"juan", "carlos", "alberto", "dina", "julian", "hector"};
            System.out.println("Input the name to search");
            String name = sc.nextLine();
            int index = 0;
            Boolean found = false;
            for(int i = 0; i < list.length; i++){
                if(list[i].equals(name)){
                    index = i;
                    found = true;
                }
            }
            if(found){
                System.out.println("The name " + name + " was found in the " + (index+1) + " position");
            }
            else{
                System.out.println("The name " + name + " was not found in the list");
            }
        }
    }

}