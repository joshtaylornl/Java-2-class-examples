package ca.nl.cna.java2.exceptions;

import java.io.IOException;

/**
 * A customer Exception for to demonstrate standard methods that are overloaded
 *
 * author @josh
 */
public class CustomException extends IOException {

    //The default message
    public static final String MSG = "Custom Exception message...! ";

    public CustomException() {
        super(MSG);
    }

    public CustomException(String message) {
        super(message);
    }

    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomException(Throwable cause) {
        super(MSG, cause);
    }
}
