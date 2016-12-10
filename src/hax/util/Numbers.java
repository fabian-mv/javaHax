package hax.util;

import java.util.Random;

/**
 * Useful class with commonly used methods related to numbers and math in Java.
 *
 * @author Machetazo
 * @version 0.1 December 2016
 */
public class Numbers{

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
     * Converts a numeric value (int) into a string.
     *
     * @param number int that will be converted into a string.
     * @return string of the number.
     */
    public static String str(int number){
        return String.valueOf(number);
    }

    /**
     * Converts a numeric value (double) into a string.
     *
     * @param number double that will be converted into a string.
     * @return string of the number.
     */
    public static String str(double number){
        return String.valueOf(number);
    }

    /**
     *
     * @param number String version of an int.
     * @return numeric value of the string.
     */
    public static int _int(String number){
        try{
            return Integer.parseInt(number);
        } catch(NumberFormatException e){
            Console.error(e);
            return -1;
        }
    }

}
