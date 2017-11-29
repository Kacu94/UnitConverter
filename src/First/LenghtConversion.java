package First;

/**
 * Created by Kacper on 2017-11-28.
 */

class LenghtConversion {

    final private double INCH_TO_METERS = 0.0254;
    final private double FOOT_TO_METERS = 0.3048;
    final private double MILE_TO_METERS = 1609.344;
    final private double MILIMETERS_TO_METERS = 0.001;
    final private double CENTIMETERS_TO_METERS = 0.01;
    final private double KILOMETERS_TO_METERS = 1000;
    final private double YARDS_TO_METERS = 0.9144;

    private double factor;


    LenghtConversion(String unit){

        if (unit.equals("in")) {
            factor = INCH_TO_METERS;
        }
        else if (unit.equals("ft")) {
            factor = FOOT_TO_METERS;
        }
        else if (unit.equals("mi")) {
            factor = MILE_TO_METERS;
        }
        else if (unit.equals("mm")) {
            factor = MILIMETERS_TO_METERS;
        }
        else if (unit.equals("cm")) {
            factor = CENTIMETERS_TO_METERS;
        }
        else if (unit.equals("km")) {
            factor = KILOMETERS_TO_METERS;
        }
        else if (unit.equals("yd")) {
            factor = YARDS_TO_METERS;
        }
    }

    double toMeters(double measurement){
        return (measurement * factor);
    }
    double fromMeters(double measurement){
        return (measurement / factor);
    }
}
