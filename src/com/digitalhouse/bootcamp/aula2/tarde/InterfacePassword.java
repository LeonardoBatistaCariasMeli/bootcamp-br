package com.digitalhouse.bootcamp.aula2.tarde;

public class InterfacePassword {

    public static void main(String[] args) {
        var weakPassword = new PasswordWeak("teste"); // anything
        var mediumPassword = new PasswordMedium("123ABC"); // at least numbers with minimum 3 chars
        var strongPassword = new PasswordStrong("$1teA4%dD.&e"); // number, symbol, chars (upper and lown), at

        System.out.println(weakPassword);
        System.out.println(mediumPassword);
        System.out.println(strongPassword);
    }

}
