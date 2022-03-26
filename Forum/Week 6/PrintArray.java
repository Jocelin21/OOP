import java.util.Scanner;
import java.util.Arrays;

public class PrintArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Get array size
        System.out.print("Enter the number of items: ");
        int NUM_ITEMS = input.nextInt();

        //If items < 1
        while(NUM_ITEMS < 1){
            System.out.println("Items must at least be 1.");
            System.out.print("Enter the number of items: ");
            NUM_ITEMS = input.nextInt();
        }

        //Make array
        int[] items = new int[NUM_ITEMS];

        //Take value input
        System.out.print("Enter the value of all items (separated by space): ");
        for(int i = 0; i < NUM_ITEMS; i++){
            items[i] = input.nextInt();
            if (items[i] < 0){
                System.out.println("Value must be positive.");
                input.close();
                return;
            }
        }

        System.out.println("Array = " + Arrays.toString(items));

        input.close();
    }
}
