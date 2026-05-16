/*
 Make a program to determine the efficiency level of a screw factory operator, according to the following conditions, which are imposed on him during a trial period:

 1. Fewer than 200 defective screws.
 2. More than 10000 screws produced.

 The efficiency level is determined as follows:

 1. If it doesn't matches any condition, level 5.
 2. If it only matches the first condition, level 6.
 3. If it only matches the second condition, level 7.
 4. If it matches the two conditions, level 8.
 Consider all necessary validations.
*/
import java.util.Scanner;
public class Efficiency_Level {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int defectiveScrews, producedScrews;
        System.out.println("Enter the amount of screws produced: ");
        producedScrews = input.nextInt();
        System.out.println("How many of those screws are defectuous? ");
        defectiveScrews = input.nextInt();
        if (defectiveScrews < 200 && producedScrews > 10000) {
            System.out.println("Efficiency level: 8.");
        } else if (producedScrews > 10000) {
            System.out.println("Efficiency level: 7.");
        } else if (producedScrews < 200) {
            System.out.println("Efficiency level: 6.");
        } else {
            System.out.println("Efficiency level: 5.");
        }
    }
}
