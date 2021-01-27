package br.com.restspringboot.controller;

public final class Calc {

    public static Double convertToDouble(String string) {
        return Double.parseDouble(string);
    }

    public static Boolean isNumeric(String string) {
        if (string == null)
            return false;
        String number = string.replace(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

    public static Double sum(String numberOne, String numberTwo) {
        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }
}
