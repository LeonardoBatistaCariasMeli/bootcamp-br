package com.digitalhouse.bootcamp.aula2.tarde;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    private String password;

    public Password() {
    }

    public Password(String password) {
        setPassword(password);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws IllegalArgumentException {
        if (password == null || password.trim().equals("") || !isValid(password)) {
            throw new IllegalArgumentException("Melhore essa senha!!!");
        }

        this.password = password;
    }

    protected boolean isValid(final String password) {
        // digit + lowercase char + uppercase char + punctuation + symbol
        final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";

        final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    protected boolean isValid(final String password, final String passwordPattern) {
        final Pattern pattern = Pattern.compile(passwordPattern);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    @Override
    public String toString() {
        return "Login{" +
                "password='" + password + '\'' +
                '}';
    }
}
