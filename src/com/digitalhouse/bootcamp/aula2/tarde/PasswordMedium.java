package com.digitalhouse.bootcamp.aula2.tarde;

public class PasswordMedium extends Password {

    public PasswordMedium(String password) {
        super(password);
    }

    @Override
    protected boolean isValid(String password) {
        // pattern validating if has number
        String passwordPattern = "^(?=.*[0-9]).{3,}$";

        return super.isValid(password, passwordPattern);
    }
}
