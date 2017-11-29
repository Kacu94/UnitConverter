package First;

/**
 * Created by Kacper on 2017-11-28.
 */

class WeightConversion {


    final private double POUNDS_TO_KILOGRAMS = 0.453;
    final private double STONES_TO_KILOGRAMS = 6.35;
    final private double GRAMS_TO_KILOGRAMS = 0.001;
    final private double OUNCE_TO_KILOGRAMS = 0.028;
    final private double CETNAR_TO_KILOGRAMS = 50.802;
    final private double CARAT_TO_KILOGRAMS = 0.0002;

    private double factor;

    WeightConversion(String unit){

        if (unit.equals("lb")){
            factor = POUNDS_TO_KILOGRAMS;
        }
        else if (unit.equals("st")){
            factor = STONES_TO_KILOGRAMS;
        }
        else if (unit.equals("g")){
            factor = GRAMS_TO_KILOGRAMS;
        }
        else if (unit.equals("oz")){
            factor = OUNCE_TO_KILOGRAMS;
        }
        else if (unit.equals("cwt")){
            factor = CETNAR_TO_KILOGRAMS;
        }
        else if (unit.equals("ct")){
            factor = CARAT_TO_KILOGRAMS;
        }
    }

    double toKilograms(double weight){
        return (weight * factor);
    }
    double fromKilograms(double weight){
        return (weight / factor);
    }
}
