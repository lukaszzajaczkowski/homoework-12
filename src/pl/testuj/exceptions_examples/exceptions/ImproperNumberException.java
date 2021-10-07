package pl.testuj.exceptions_examples.exceptions;

public class ImproperNumberException extends Exception {
    private String number; // posłuży do przechwycenia wyjątku - niepoprawnego numeru

    public ImproperNumberException(String number) {
        this.number = number;
    }

    // posłuży do pobrania informacji o niepoprawnym numerze
    public String getNumber() {
        return number;
    }
}
