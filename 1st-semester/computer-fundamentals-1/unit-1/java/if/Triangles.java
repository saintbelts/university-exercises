/*
 Make a program that reads three lengths and determines whether or not they form a triangle. If it is a triangle, determine what type of triangle it is between: equilateral (If it has three equal
 sides), isosceles (if it has two equal sides) or scalene (if it has three unequal sides). Consider that to form a triange it is required that: "The longest side is lees than the sum of
 the other two sides". Consider all necessary validations.
 */
import java.util.Scanner;
public class Triangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program to determine the type of a triangle based on the length of its sides.");
        System.out.println("Developed by: Santiago.");
        float side1 = Float.parseFloat(System.console().readLine("Side 1: "));
        if (side1 > 0) {
            float side1 = Float.parseFloat(System.console().readLine("Side 2: "));
            if (side2 > 0) {
                float side3 = Float.parseFloat(System.console().readLine("Side 3: "));
                if (side3 > 0) {
                    // > We determine if the measurements meet the criteria to be a triangle.
                    // > First step to find the longest side.Primer paso para encontrar el lado mayor.
                    float longest = side;
                    if (longest < side2) {
                        longest = side2;
                    }
                    if (longest < side3) {
                        longest = side3;
                    }
                    System.out.printf("Longest side is %s: ", longest);
                    if (longest < (side1 + side2 + side3 - longest)) {
                        System.out.println("It is a triangle.");
                        // > We determine the type of triangle.
                        if (side1 == side2 && side2 == side3) {
                            System.out.println("Equilateral triangle.");
                        } else if (side1 != side2 && side2 != side3 && side1 != side3) {
                            System.out.println("Scalene.");
                        } else {
                            System.out.println("Isosceles.");
                        }
                    } else {
                        System.out.println("With those measeruments it is not possible to form a triangle.");
                    }
                } else {
                    System.out.println("The side of a triangle must be grater than 0.");
                }
            } else {
                System.out.println("The side of a triangle must be grater than 0.");
            }
        } else {
            System.out.println("El lado de un triangulo tiene que ser mayor a 0.");
        }
    input.close();
    }
}
