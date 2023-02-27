package ru.netology.javaqa;

public class NotRegisteredException extends RuntimeException {
    public NotRegisteredException(String name) {
        super("Element" + name + " not found");

    }
}
