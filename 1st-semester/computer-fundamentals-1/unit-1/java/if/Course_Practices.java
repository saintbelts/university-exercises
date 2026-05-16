/*
 The average grade for a course's practical exercises is caculated based in four graded exercises. The lowest grade is dropped, and the three highest grades are averaged. Write a
 program that determines the average, if all grades are less than 7, print the message "repeat course" instead of the average.
 
 Example:
 Grades Capture system.
 Practice 1: 8
 Practice 2: 6
 Practice 3: 8.5
 Practice 4: 6
 Your average is 7.5

 Grade Capture system.
 Practice 1: 6.9
 Practice 2: 6
 Practice 3: 6.5
 Practice 4: 6 REPEAT COURSE.

 The rating range is from 0.0 to 10.0
 Consider all necessary validations.
 */
import java.util.Scanner;
public class Course_Practices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double highGrades = 0, highAmount = 0, grade1, grade2, grade3, grade4;
        System.out.println("\n|| GRADE CAPTURE SYSTEM ||\n");
        System.out.println("Practice 1: ");
        grade1 = input.nextDouble();
        if (grade1 >= 6) {
            highGrades += grade1;
            highGrades++;
        }
        System.out.println("Practice 2: ");
        grade2 = input.nextDouble();
        if (grade2 >= 6) {
            highGrades += grade2;
            highAmount++;
        }
        System.out.println("Practice 3: ");
        grade3 = input.nextDouble();
        if (grade3 >= 6) {
            highGrades += grade3;
            highAmount++;
        }
        System.out.println("Practice 4: ");
        grade4 = input.nextDouble();
        if (grade4 >= 6) {
            highGrades += grade4;
            highAmount++;
        }
        System.out.println("Number of high grades: " + highAmount);
        double average = highGrades / highAmount;
        System.out.println("Average: " + average);
        if (grade1 < 7 && grade2 < 7 && grade3 < 7 && grade4 < 7) {
            System.out.println("Repeat course.");
        }
    }
}
