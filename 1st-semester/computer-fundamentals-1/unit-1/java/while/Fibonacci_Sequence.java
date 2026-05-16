/*
Make a program to find the Fibonacci sequence. The sequence is the
following:
 
F= 0,1,1,2,3,5,8,13,21,34,55, ......................................., n 

The first element is 0, second is 1 and each remaining element is the sum of the
last two. The program must request the limit number of the series.
*/
import java.util.Scanner;
public class Fibonacci_Sequence {
    public static void main (String[] args) {
        int limit;
        String option = "Y";
        Scanner input = new Scanner(System.in);
        while (option.equalsIgnoreCase("Y")) {
            System.out.println("\nInput a number to establish the limit of the sequence: ");
            limit = input.nextInt();
            if (limit > 0) {
                int element0 = 0, element1 = 1, sum = 0;
                System.out.printf("%d, %d", element0, element1);
                while (sum < limit) {
                    sum = element0 + element1;
                    System.out.printf(", %d", sum);
                    element0 = element1;
                    element1 = sum;
                }
                option = System.console().readLine("\n\nAgain? Y/N: ");
            } else {
                System.out.println("ERROR. Only positive integers are allowed.");
            }
        }
        System.out.println("Thank you for using the program :)");
        input.close();
    }
}
