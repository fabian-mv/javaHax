package hax.util;

import java.io.IOException;

/**
 * Useful class with commonly methods for catching exceptions and other runtime utilities.
 *
 * @author Machetazo
 * @version 0.1 December 2016
 */
public class Runtime {

    /**
     * Exception manager.
     * @param e exception.
     */
    public static void error(IOException e){
        System.err.println(e.getMessage());
        e.printStackTrace();
    }
    /**
     * Exception manager.
     * @param e exception.
     */
    public static void error(InterruptedException e){
        System.err.println(e.getMessage());
        e.printStackTrace();
    }
    /**
     * Exception manager.
     * @param e exception.
     */
    public static void error(Exception e){
        System.err.println(e.getMessage());
        e.printStackTrace();
    }

    /**
     * Exception manager.
     * @param e exception.
     */
    public static void error(NumberFormatException e){
        System.err.println(e.getMessage());
        e.printStackTrace();
    }

}
