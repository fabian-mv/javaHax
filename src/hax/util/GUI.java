package hax.util;

import hax.Res;
import javax.swing.JOptionPane;

/**
 * Useful class with commonly used methods for the creation of GUIs in Java.
 *
 * @author Machetazo
 * @version 0.1 December 2016
 */
public class GUI{

    /**
     * Displays a Message Dialog with a message.
     *
     * @param message message to display in the Message Dialog.
     */
    public static void messageDialog(String message){

        JOptionPane.showMessageDialog(null , message);

    }

    /**
     * Displays a Message Dialog with a message, title and a message type.
     *
     * @param message message to display in the Message Dialog.
     * @param title title of the Message Dialog
     * @param messageType type of the Message Dialog
     */
    public static void messageDialog(String message , String title , int messageType){

        JOptionPane.showMessageDialog(null , message , title , messageType);

    }



}
