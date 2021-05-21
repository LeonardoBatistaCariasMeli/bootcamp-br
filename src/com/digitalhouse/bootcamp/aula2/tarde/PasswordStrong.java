package com.digitalhouse.bootcamp.aula2.tarde;

public class PasswordStrong extends Password {

    public PasswordStrong(String password) {
        super(password);
    }

    @Override
    protected boolean isValid(String password) {
        // digit + lowercase char + uppercase char + punctuation + symbol
        String passwordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,}$";

        return super.isValid(password, passwordPattern);
    }

}
