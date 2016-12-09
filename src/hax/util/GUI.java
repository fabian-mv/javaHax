package hax.util;

import javax.swing.*;
import java.awt.*;


/**
 * Useful class with commonly used methods for the creation of GUIs in Java.
 *
 * @author Machetazo
 * @version 0.1 December 2016
 */
public class GUI{

    /**
     * Displays a dialog with a message.
     *
     * @param message message to display in the Message Dialog.
     */
    public static void messageDialog(String message){
        JOptionPane.showMessageDialog(null , message);
    }

    /**
     * Displays a dialog with a message.
     *
     * @param component parent component.
     * @param component parent component.
     * @param message message to display in the Message Dialog.
     */
    public static void messageDialog(Component component , String message){
        JOptionPane.showMessageDialog(component , message);
    }

    /**
     * Displays a dialog with a message, title and a message type.
     *
     * @param message message to display in the Message Dialog.
     * @param title title of the Message Dialog
     * @param messageType type of the Message Dialog
     */
    public static void messageDialog(String message , String title , int messageType){
        JOptionPane.showMessageDialog(null , message , title , messageType);
    }

    /**
     * Displays a dialog with a message, title and a message type.
     *
     * @param component parent component.
     * @param message message to display in the Message Dialog.
     * @param title title of the Message Dialog
     * @param messageType type of the Message Dialog
     */
    public static void messageDialog(Component component , String message , String title , int messageType){
        JOptionPane.showMessageDialog(component , message , title , messageType);
    }

    /**
     * Displays a dialog with a message and an input bar for the user to type in.
     *
     * @param message message to display in the Input Dialog.
     * @return a String containing the characters typed by the user.
     */
    public static String inputDialog(String message){
        String text = JOptionPane.showInputDialog(message);
        if(text.isEmpty()){
            return "";
        } else{
            return text;
        }
    }

    /**
     * Displays a dialog with a message and an input bar for the user to type in.
     *
     * @param component parent component.
     * @param message message to display in the Input Dialog.
     * @return a String containing the characters typed by the user.
     */
    public static String inputDialog(Component component , String message){
        String text = JOptionPane.showInputDialog(component , message);
        if(text.isEmpty()){
            return "";
        } else{
            return text;
        }
    }

    /**
     * Displays a dialog with a message and an input bar with a default initial value for the user to type in.
     *
     * @param message message to display in the Input Dialog.
     * @param defaultInitialValue default initial value in the input dialog.
     * @return a String containing the characters typed by the user.
     */
    public static String inputDialog(String message , String defaultInitialValue){
        String text = JOptionPane.showInputDialog(message , defaultInitialValue);
        if(text.isEmpty()){
            return "";
        } else{
            return text;
        }
    }

    /**
     * Displays a dialog with a message and an input bar with a default initial value for the user to type in.
     *
     * @param component parent component.
     * @param message message to display in the Input Dialog.
     * @param defaultInitialValue default initial value in the input dialog.
     * @return a String containing the characters typed by the user.
     */
    public static String inputDialog(Component component , String message , String defaultInitialValue){
        String text = JOptionPane.showInputDialog(component , message , defaultInitialValue);
        if(text.isEmpty()){
            return "";
        } else{
            return text;
        }
    }










}
