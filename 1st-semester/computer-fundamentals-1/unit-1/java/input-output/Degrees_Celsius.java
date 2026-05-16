/*
 Convert degrees Celsius to degrees Fahrenheit. Consider that F = C * 9.0 / 5.0 + 32.
*/
public class Degrees_Celsius {
    public static void main (String [] args) {
        float celsius = 110.25f;
        float fahrenheit = (float) ((celsius * 9.0) / 5.0 + 32);
        System.out.printf("Conversion is equal to: %.2f", fahrenheit);
    }
}
