package ru.someboy.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
