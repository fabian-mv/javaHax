package hax.util;

import java.awt.Toolkit;
import java.util.Scanner;
import hax.Res;

/**
 * Useful class with commonly used methods/hax.ads.console/stuff in Java
 * @author Machetazo
 * @version 0.1 December 2016
 */
public class Console{

    /**
     * Writes stuff into console.
     *
     * If parameters are left empty, a blank line is printed.
     * If the parameter is an int n, n blank lines are printed.
     * If parameter is a string, that string is printed.
     * If parameters are a string and a valid ANSI color, the string is printed in that color.
     * Everything is printed with println().
     */
    public static void write_(){
        System.out.println();
    }

    /**
     * Same thing as write_() but everything is printed with print().
     * If parameters are left blank, whitespace is printed instead of blank lines.
     */
    public static void write(){
        System.out.print("\t");
    }

    /**
     * Writes stuff into console.
     *
     * If parameters are left empty, a blank line is printed.
     * If the parameter is an int n, n blank lines are printed.
     * If parameter is a string, that string is printed.
     * If parameters are a string and a valid ANSI color, the string is printed in that color.
     * Everything is printed with println.
     *
     * @param blankLines amount of blank lines to be printed into hax.ads.console.
     */
    public static void write_(int blankLines){
        for(int i=0 ; i<blankLines ; i++) {
            System.out.println();
        }
    }

    /**
     * Same thing as write_() but everything is printed with print().
     * If parameters are left blank, whitespace is printed instead of blank lines.
     */
    public static void write(int whiteSpace){
        for(int i=0 ; i<whiteSpace ; i++) {
            System.out.print("\t");
        }
    }

    /**
     * Writes stuff into console.
     *
     * If parameters are left empty, a blank line is printed.
     * If the parameter is an int n, n blank lines are printed.
     * If parameter is a string, that string is printed.
     * If parameters are a string and a valid ANSI color, the string is printed in that color.
     * Everything is printed with println.
     *
     * @param text text that will be printed into hax.ads.console.
     */
    public static void write_(String text){
        System.out.println(text);
    }

    /**
     * Same thing as write_() but everything is printed with print().
     * If parameters are left blank, whitespace is printed instead of blank lines.
     */
    public static void write(String text){
        System.out.print(text);
    }

    /**
     * Writes stuff into console.
     *
     * If parameters are left empty, a blank line is printed.
     * If the parameter is an int n, n blank lines are printed.
     * If parameter is a string, that string is printed.
     * If parameters are a string and a valid ANSI color, the string is printed in that color.
     * Everything is printed with println.
     *
     * @param text text that will be printed into hax.ads.console.
     * @param color color in which the text will be printed into hax.ads.console.
     */
    public static void write_(String text , String color){
        System.out.println(color + text + Res.ANSI_RESET);
    }

    /**
     * Same thing as write_() but everything is printed with print().
     * If parameters are left blank, whitespace is printed instead of blank lines.
     */
    public static void write(String text , String color){
        System.out.print(color + text + Res.ANSI_RESET);
    }

    /**
     * Clears the console.
     */
    public static void flush(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     * Ends the application.
     */
    public static void kill(){
        System.exit(0);
    }

    /**
     * Plays an alert sound.
     */
    public static void beep(){
        Toolkit.getDefaultToolkit().beep();
    }

    /**
     * Gets an int from a console as user input.
     *
     * If parameter is a string, that string is printed as a prompt for the user.
     * If parameters are a string and a valid ANSI color, the string is printed in that color as a prompt for the user.
     * If parameters are left blank, no prompt is printed.
     * A second string parameter can be introduced as a confirmation message to the user once input is received.
     *
     * @return the number inputed by the user.
     */
    public static int inputInt(String prompt){
        Scanner input = new Scanner( System.in );
        write(prompt + " ");
        int number = input.nextInt();
        return number;
    }

    /**
     * Gets an int from a console as user input.
     *
     * If parameter is a string, that string is printed as a prompt for the user.
     * If parameters are a string and a valid ANSI color, the string is printed in that color as a prompt for the user.
     * If parameters are left blank, no prompt is printed.
     * A second string parameter can be introduced as a confirmation message to the user once input is received.
     *
     * @return the number entered by the user.
     */
    public static int inputInt(String prompt , String color){
        Scanner input = new Scanner( System.in );
        write(prompt + " " , color);
        int number = input.nextInt();
        return number;
    }

    /**
     * Gets an int from a console as user input.
     *
     * If parameter is a string, that string is printed as a prompt for the user.
     * If parameters are a string and a valid ANSI color, the string is printed in that color as a prompt for the user.
     * If parameters are left blank, no prompt is printed.
     * A second string parameter can be introduced as a confirmation message to the user once input is received.
     *
     * @return the number entered by the user.
     */
    public static String inputLine(String prompt){
        Scanner input = new Scanner( System.in );
        write(prompt + " ");
        String line = input.nextLine();
        return line;
    }

    /**
     * Gets an int from a console as user input.
     *
     * If parameter is a string, that string is printed as a prompt for the user.
     * If parameters are a string and a valid ANSI color, the string is printed in that color as a prompt for the user.
     * If parameters are left blank, no prompt is printed.
     * A second string parameter can be introduced as a confirmation message to the user once input is received.
     *
     * @return the line entered by the user.
     */
    public static String inputLine(String prompt , String color){
        Scanner input = new Scanner( System.in );
        write(prompt + " " , color);
        String line = input.nextLine();
        return line;
    }

    /**
     * Gets an int from a console as user input.
     *
     * If parameter is a string, that string is printed as a prompt for the user.
     * If parameters are a string and a valid ANSI color, the string is printed in that color as a prompt for the user.
     * If parameters are left blank, no prompt is printed.
     * A second string parameter can be introduced as a confirmation message to the user once input is received.
     *
     * @return the line entered by the user.
     */
    public static int inputInt(String prompt , String color , String answer){
        Scanner input = new Scanner( System.in );
        write(prompt + " " , color);
        int number = input.nextInt();
        write_();
        write_(answer);
        return number;
    }

    /**
     * Gets an int from a console as user input.
     *
     * If parameter is a string, that string is printed as a prompt for the user.
     * If parameters are a string and a valid ANSI color, the string is printed in that color as a prompt for the user.
     * If parameters are left blank, no prompt is printed.
     * A second string parameter can be introduced as a confirmation message to the user once input is received.
     *
     * @return the number inputed by the user.
     */
    public static int inputInt(String prompt , String color , String answer , String exitColor){
        Scanner input = new Scanner( System.in );
        write(prompt + " " , color);
        int number = input.nextInt();
        write_();
        write_(answer , exitColor);
        return number;
    }

    /**
     * Gets an int from a console as user input.
     *
     * If parameter is a string, that string is printed as a prompt for the user.
     * If parameters are a string and a valid ANSI color, the string is printed in that color as a prompt for the user.
     * If parameters are left blank, no prompt is printed.
     * A second string parameter can be introduced as a confirmation message to the user once input is received.
     *
     * @return the number inputed by the user.
     */
    public static int inputInt(){
        Scanner input = new Scanner( System.in );
        int number = input.nextInt();
        return number;
    }

    /**
     * Generates a nice, simple header for a console app.
     *
     * Supports ANSI colors for the title.
     *
     * @param title title of the header
     */
    public static void header(String title) {

        int titleLength = title.length() + 2;

        write(3);
        for (int i = 0; i < (titleLength * 3); i++) {
            write("$", Res.ANSI_GREEN);
        }
        write_();
        write(3);
        for (int i = 0; i < titleLength; i++) {
            write("$", Res.ANSI_GREEN);
        }
        write(" " + title + " ", Res.ANSI_WHITE);
        for (int i = 0; i < titleLength; i++) {
            write("$", Res.ANSI_GREEN);
        }
        write_();
        write(3);
        for (int i = 0; i < (titleLength * 3); i++) {
            write("$", Res.ANSI_GREEN);
        }
        write_();
    }

    /**
     * Generates a nice, simple header for a console app.
     *
     * Supports ANSI colors for the title.
     *
     * @param title title of the header.
     * @param color color fo the title.
     */
    public static void header(String title , String color){

        int titleLength = title.length() + 2;

        write(3);
        for(int i=0 ; i<(titleLength*3) ; i++){
            write("$" , Res.ANSI_GREEN);
        }
        write_();
        write(3);
        for(int i=0 ; i<titleLength ; i++){
            write("$" , Res.ANSI_GREEN);
        }
        write(" " + title + " " , color);
        for(int i=0 ; i<titleLength ; i++){
            write("$" , Res.ANSI_GREEN);
        }
        write_();
        write(3);
        for(int i=0 ; i<(titleLength*3) ; i++){
            write("$" , Res.ANSI_GREEN);
        }
        write_();
    }











}
