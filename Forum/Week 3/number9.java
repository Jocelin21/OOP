import java.util.Scanner;

public class number9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Celcius = ");
        float celcius = input.nextFloat();

        float fahrenheit = ((celcius*9)/5)+32;
        System.out.println("Fahrenheit = " + String.format("%.1f", fahrenheit));

        input.close();
    }
}