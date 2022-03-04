import java.util.Scanner;
import java.lang.Math;

public class number10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("x1 = ");
        float x1 = input.nextFloat();

        System.out.print("x2 = ");
        float x2 = input.nextFloat();

        System.out.print("x3 = ");
        float x3 = input.nextFloat();
        
        float mean = (x1 + x2 + x3)/3;
        double variance = (Math.pow(x1 - mean,2) + Math.pow(x2 - mean,2) - Math.pow(x3 - mean,2))/3;
        double sd = Math.sqrt(variance);

        System.out.println("Mean               = " + String.format("%.2f", mean));
        System.out.println("Variance           = " + String.format("%.2f", variance));
        System.out.println("Standard Deviation = " + String.format("%.2f", sd));

        input.close();
    }
}
