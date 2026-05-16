/*
 Request a measurement in meters and convert it to millimeters, centimeters, decimeters, kilometers, inches, feet, yards and miles.
 
 1 m = 1000 mm             1 m = 39.37 '' 
 1 m = 100 cm                 1 m = 3.28 ' 
 1 m = 10 dm                  1 m = 1.0936 yd 
 1 m = 0.001 km              1 m = 0.000621371 m 
*/
import java.util.Scanner;
public class Measurements_Meters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value in meters: ");
        double metersMeasurement = input.nextDouble();
        double millimetersMeasurement = metersMeasurement * 1000;
        double centimetersMeasurement = metersMeasurement * 100;
        double decimetersMeasurement = metersMeasurement * 10;
        double kilometersMeasurement = metersMeasurement * 0.001;
        double inchesMeasurement = metersMeasurement * 39.37;
        double feetMeasurement = metersMeasurement * 3.28;
        double yardsMeasurement = metersMeasurement * 1.0936;
        double milesMeasurement = metersMeasurement * 0.000621371;
        System.out.printf("Measurement from meters to millimeters: %.2f\n", millimetersMeasurement);
        System.out.printf("Measurement from meters to centimeters: %.2f\n", centimetersMeasurement);
        System.out.printf("Measumerent from meters to decimeters: %.2f\n", decimetersMeasurement);
        System.out.printf("Measurement from meters to kilometers: %.2f\n", kilometersMeasurement);
        System.out.printf("Measurement from meters to inches: %.2f\n", inchesMeasurement);
        System.out.printf("Measurement from meters to feet: %.2f\n", feetMeasurement);
        System.out.printf("Measurement from meters to yards: %.2f\n", yardsMeasurement);
        System.out.printf("Measurement from meters to miles: %.2f\n", milesMeasurement);
        input.close();
    }
}
