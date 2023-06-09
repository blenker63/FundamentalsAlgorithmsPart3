package com.prosky.fundamentalsalgorithmspart3.service;

public class ElementMissingException extends RuntimeException {
    public ElementMissingException(String massage) {
        super(massage);
    }
}
