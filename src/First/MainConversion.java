package First;

public class MainConversion {

    public static void main(String[] args) {

        showStartMessage();
        System.out.println("\r");
        Conversion.console();
    }

    private static void showStartMessage(){

        System.out.println("Hello and Welcome!");
        System.out.println("You can convert units like:");
        System.out.println("Inches, foots, miles yards, ");
        System.out.println("milimeters, centimeters, meters and kilometers,");
        System.out.println("in both directions.");
        System.out.println("Just type first two letters.");
    }
}
