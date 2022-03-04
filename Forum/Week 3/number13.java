import java.util.Scanner;
import java.lang.Math;

public class number13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("ax^2 + bx + c = 0");
        
        System.out.print("a = ");
        int a = input.nextInt();

        System.out.print("b = ");
        int b = input.nextInt();

        System.out.print("c = ");
        int c = input.nextInt();

        double x1 = (-b + Math.sqrt(Math.pow(b,2) - (4*a*c)))/(2*a);
        double x2 = (-b - Math.sqrt(Math.pow(b,2) - (4*a*c)))/(2*a);
        
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);

        input.close();
    }
}

//If a = 0, the answers are either NaN, Infinity or -Infinity