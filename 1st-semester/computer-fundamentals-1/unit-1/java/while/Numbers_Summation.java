/*
Sum to find the sum of a series of number, the user is asked for the limit.

Enter the number for the sum: 8
Result: 36

Σ= 1 + 2 + 3 +4 +5 + 6 + 7 +8 
*/
import java.util.Scanner;
public class Numbers_Summation {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int limit;
        String option = "Y";
        while (option.equalsIgnoreCase("Y")) {
            int number = 1, summation = 0;
            System.out.println("\nEstablish a limit for the sequence of numbers: "); limit = input.nextInt();
            if (limit > 0) {
                while (number <= limit) {
                    if (number < limit) {
                        System.out.printf("%d + ", number);
                    } else {
                      System.out.printf("%d", number);
                    }
                    summation += number;
                    number++;
                }
                System.out.println("\nSummation: " + summation);
                option = System.console().readLine("\nAgain? Y/N: ");
            } else {
                System.out.println("ERROR. Only positive integers are allowed.");
            }
        }
        System.out.println("Thank you for using the program :)");
        input.close();
    }
}
