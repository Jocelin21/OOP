import java.util.Scanner;

public class number14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Seconds = ");
        int second = input.nextInt();

        int hour = second/3600;
        int min = (second%3600)/60;
        int sec = (second%3600)%60;

        System.out.println(second + " seconds are " + hour + " hour, " + min + " minute, and " + sec + " seconds.");
        
        input.close();
    }
}
