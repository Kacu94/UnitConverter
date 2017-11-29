package First;

import java.util.Objects;
import java.util.Scanner;

/**
 * Created by Kacper on 2017-11-28.
 */
class Conversion {

    static void console(){

        Scanner in = new Scanner(System.in);

        System.out.println("Choose type to convert: ");
        String typingConv = in.nextLine();

        System.out.println("Convert from: ");
        String fromUnit = in.nextLine();

        System.out.println("Convert to: ");
        String toUnit = in.nextLine();

        if (Objects.equals(typingConv, "Lenght")) {
            Choosing.chooseType((byte) 1, fromUnit, toUnit, in);
        }
        else if (Objects.equals(typingConv, "Weight")) {
            Choosing.chooseType((byte) 2, fromUnit, toUnit, in);
        }

    }





}
