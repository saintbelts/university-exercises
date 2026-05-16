/*
 Program to find the area of a triangle, ask the user for the base and height. The area of a triangle is obtained with the following formula Area = Base * Height / 2.
*/
public class Height_Base {
    public static void main(String[] args) {
       int base = 15;
       float height = 72.5f;
       float area = (float) (base * height) / 2;
       System.out.printf("Triangle area: %.2f", area);
    }
}
