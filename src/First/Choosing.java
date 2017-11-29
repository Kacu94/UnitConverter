package First;

import java.util.Scanner;

/**
 * Created by Kacper on 2017-11-29.
 */
public class Choosing {

    public static void chooseType(byte type, String fromUnit, String toUnit, Scanner in) {

        double valueToConvert, meters, kilos, converted;

        switch (type) {
            case 1:

                LenghtConversion fromLenght = new LenghtConversion(fromUnit);
                LenghtConversion toLenght = new LenghtConversion(toUnit);

                System.out.println("Value: ");
                valueToConvert = in.nextDouble();

                meters = fromLenght.toMeters(valueToConvert);
                converted = toLenght.fromMeters(meters);

                System.out.println(converted);
                break;

            case 2:

                WeightConversion toWeight = new WeightConversion(toUnit);
                WeightConversion fromWeight = new WeightConversion(fromUnit);

                System.out.println("Value: ");
                valueToConvert = in.nextDouble();

                kilos = fromWeight.toKilograms(valueToConvert);
                converted = toWeight.fromKilograms(kilos);

                System.out.println(converted);
                break;

        }
    }
}
