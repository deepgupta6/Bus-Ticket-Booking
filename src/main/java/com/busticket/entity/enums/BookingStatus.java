package com.busticket.entity.enums;

public enum BookingStatus {

    AVAILABLE("Available"),
    BOOKED("Booked");

    private final String message;

    BookingStatus(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public static BookingStatus fromValue(String value) {
        return BookingStatus.valueOf(value.toUpperCase());
    }
}