package com.mytests.exception.nullpointer;

public class MessageNotSendException extends Exception {
    public MessageNotSendException(final String message) {
        super(message);
    }
}
