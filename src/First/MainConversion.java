package First;

import java.util.Scanner;


public class MainConversion {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Convert from: ");
        String fromUnit = in.nextLine();

        System.out.println("Convert to: ");
        String toUnit = in.nextLine();

        LenghtConversion from = new LenghtConversion(fromUnit);
        LenghtConversion to = new LenghtConversion(toUnit);

        System.out.println("Value: ");
        double valueToConvert = in.nextDouble();

        double meters = from.toMeters(valueToConvert);
        double converted = to.fromMeters(meters);

        System.out.println(converted);



    }
}
