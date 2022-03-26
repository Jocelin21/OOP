import java.util.Scanner;
import java.util.Arrays;

public class PrintStudentsGrade {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Take array size
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        //If array size < 1
        while(numStudents < 1){
            System.out.println("Students must at least be 1.");
            System.out.print("Enter the number of students: ");
            numStudents = input.nextInt();
        }

        //Make array
        int[] grades = new int[numStudents];
        int sum = 0;

        //Take value input
        for(int i = 0; i < numStudents; i++){
            System.out.printf("Enter the grade for student %s: ", i+1);
            grades[i] = input.nextInt();
            while (grades[i] < 0 || grades[i] > 100){
                System.out.println("The grade must be between 0-100.");
                System.out.printf("Enter the grade for student %s: ", i+1);
                grades[i] = input.nextInt();
            }
            sum += grades[i];
        }

        double avg = (double)sum/numStudents;
        Arrays.sort(grades); //For max and min
  
        System.out.printf ("The average is: %.2f\n", avg);
        System.out.println("The minimum is: " + grades[0]);
        System.out.println("The maximum is: " + grades[numStudents-1]);


        input.close();
    }
}
