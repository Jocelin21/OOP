import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Take array size
        System.out.print("Enter the number of items: ");
        int NUM_ITEMS = input.nextInt();

        //If size < 1
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

        //Making multiple * and Printing
        int i = 0;
        for(int val:items){
            System.out.print(i + ": ");
            for(int j = 0; j < val; j++){
                System.out.print("*");
            }
            System.out.printf("(%d)\n", val);
            i++;
        }

        input.close();
    }
}
