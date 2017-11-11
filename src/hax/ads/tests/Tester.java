package hax.ads.tests;

import hax.util.Numbers;
import org.junit.Test;

/**
 * Class used to generate tests data structures.
 *
 * @author Fabián Montero <machetazo>
 * @version 0.1 08/11/17
 */
public class Tester {

    /**
     * Generates an array that contains a user-specified amount of integers
     *
     * @param amountOfValuesToGenerate amount fo integers to generate
     * @return an array with that many integers
     */
    public static Integer[] generateInts(int amountOfValuesToGenerate){
        Integer[] values = new Integer[amountOfValuesToGenerate];

        for(int i = 0 ; i < amountOfValuesToGenerate ; i++){
            values[i] = i;
        }
        return values;
    }

    /**
     * Generates an array that contains a user-specified amount of strings
     *
     * @param amountOfValuesToGenerate amount fo strings to generate
     * @return an array with that many strings
     */
    public static String[] generateStrings(int amountOfValuesToGenerate){
        String[] values = new String[amountOfValuesToGenerate];

        for(int i = 0 ; i < amountOfValuesToGenerate ; i++){
            values[i] = String.valueOf(i);
        }
        return values;
    }

    /**
     * Generates an array that contains a user-specified amount of booleans
     *
     * @param amountOfValuesToGenerate amount fo booleans to generate
     * @return an array with that many booleans
     */
    public static Boolean[] generateBooleans(int amountOfValuesToGenerate){
        Boolean[] values = new Boolean[amountOfValuesToGenerate];

        for(int i = 0 ; i < amountOfValuesToGenerate ; i++){
            if(Numbers.isEven(i)){
                values[i] = true;
            } else {
                values[i] = false;
            }
        }
        return values;
    }

    /**
     * Generates an array that contains a user-specified amount of doubles
     *
     * @param amountOfValuesToGenerate amount fo doubles to generate
     * @return an array with that many doubles
     */
    public static Double[] generateDoubles(int amountOfValuesToGenerate){
        Double[] values = new Double[amountOfValuesToGenerate];

        for(int i = 0 ; i < amountOfValuesToGenerate ; i++){
            values[i] = i + i*0.1;
        }
        return values;
    }
}
