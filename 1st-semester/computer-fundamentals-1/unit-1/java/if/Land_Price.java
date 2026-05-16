/*
 Make an algorithm to calculate and print the price of a plot of land given the following data: length, width and price per square meter. If the plot is larger than
 400 square meters, a 7.6% discount is applied. Consider all necessary validations.
 */
import java.util.Scanner;
public class Land_Price {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        double length, width, squareMeters, discount = 0.076, meterPrice = 100;
        System.out.println("\n|| PROGRAM TO CALCULATE THE PRICE OF A PLOT OF LAND ||\n");
        System.out.println("Enter a lenght: ");
        length = input.nextDouble();
        System.out.println("Enter a width: ");
        width = input.nextDouble();
        squareMeters = length * width;
        meterPrice = meterPrice * squareMeters;
        if (squareMeters > 400) {
            meterPrice = meterPrice * discount;
        }
        System.out.printf("Total price: %.2f", meterPrice);
        input.close();
    }
}
