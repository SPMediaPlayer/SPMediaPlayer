/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

/**
 *
 * @author Markus
 */
public class MarkException extends Throwable {
    
    String message = "Unknow Exception";
    
    public MarkException(String s) {
        this.message = s;
    }

    @Override
    public String getLocalizedMessage() {
        return message;
    }

    @Override
    public String getMessage() {
        return message;
    }
    
}