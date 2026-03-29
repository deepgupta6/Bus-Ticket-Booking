package com.busticket.entity.enums;

import java.util.Locale;

public enum PaymentStatus {

    Success("Success"),
    Failed("Failed"),
    Pending("Pending");

    private final String message;

    PaymentStatus(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public static PaymentStatus fromValue(String value) {
        return PaymentStatus.valueOf(value);
    }
}
