package org.sparta.tk.exceptions;
/**
 * Made by Tolga Komur.
 */
public class SorterException extends Exception {

    private String message;

    public SorterException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}