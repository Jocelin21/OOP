import java.util.Scanner;

public class number11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("x = ");
        int x = input.nextInt();

        System.out.print("y = ");
        int y = input.nextInt();

        int a = x;
        x = y;
        y = a;

        System.out.println("--After--");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        input.close();
    }
}
