package hax.util;

import java.util.Random;

/**
 * Useful class with commonly used methods related to numbers and math in Java.
 *
 * @author Machetazo
 * @version 0.1 December 2016
 */
public class Numbers {

    /**
     * Generates a random integer
     *
     * @param start start of generation interval.
     * @param end end of generation interval.
     * @return random int.
     */
    public static int random(int start, int end){
        Random random = new Random();
        double preValue = random.nextDouble();
        int value = (int) (Math.abs(preValue) * (end - start) + start);
        return value;
    }

    /**
     * Converts a numeric value into a string.
     *
     * @param number number that will be converted into a string.
     * @return string version of the number.
     */
    public static String str(int number){
        return String.valueOf(number);
    }

    /**
     * Converts a numeric value into a string.
     *
     * @param number number that will be converted into a string.
     * @return string version of the number.
     */
    public static String str(double number){
        return String.valueOf(number);
    }

}
