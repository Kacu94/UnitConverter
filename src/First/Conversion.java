package First;

import java.util.Scanner;

/**
 * Created by Kacper on 2017-11-28.
 */
public class Conversion {

    public static void console(){

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
