/*
 Find the area of a circle. The area of a circle is obtained using the following formula: Area  = 𝛑 * radius2. The program should prompth the user for the radius.
*/
import java.lang.Math;
import java.util.Scanner;
public class Circle_Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for the radius: ");
        float radius = input.nextFloat();
        float result = (float)(Math.PI * Math.pow(radius, 2));
        System.out.printf("The are of the circle is: %.2f", result);
        input.close();
    }
}
