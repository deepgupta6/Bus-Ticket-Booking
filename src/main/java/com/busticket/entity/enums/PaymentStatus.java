package com.busticket.entity.enums;

public enum PaymentStatus {

    SUCCESS("Success"),
    FAILED("Failed"),
    PENDING("Pending");

    private final String message;

    PaymentStatus(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public static PaymentStatus fromValue(String value) {
        return PaymentStatus.valueOf(value.toUpperCase());
    }
}