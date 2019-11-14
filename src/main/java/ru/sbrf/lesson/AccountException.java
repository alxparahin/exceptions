package ru.sbrf.lesson;

public class AccountException extends RuntimeException {
    public AccountException(String message) {
        super(message);
        System.out.println("first level ext "+message);
    }

    public AccountException(String message, Throwable cause) {
        super(message, cause);
        System.out.println("extended ext "+message);
    }
}
