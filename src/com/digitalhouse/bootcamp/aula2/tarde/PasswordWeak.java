package com.digitalhouse.bootcamp.aula2.tarde;

public class PasswordWeak extends Password{

    public PasswordWeak(String password) {
        super(password);
    }

    @Override
    protected boolean isValid(String password) {
        // empty password
        String passwordPattern = "";

        return super.isValid(password, passwordPattern);
    }
}
