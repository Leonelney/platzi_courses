package com.platzi.javatests.romanNumerals;

public class RomanNumeral {
    public String arabicToRoman(int n) {
        if(n >= 4000) return "The number must be less than 4000";

        String result = "";
        String romanNumber;
        // obtenemos las unidades, decenas, centenas y unidades de millar
        int units, tens, hundreds, thousandsUnits;
        units = n % 10;
        tens = (n / 10) % 10;
        hundreds = (n / 100) % 10;
        thousandsUnits = (n / 1000) % 10;

        if(units > 0) {
            // el método repeat() solo esta disponible en JAVA SE 11
            romanNumber = "I".repeat(units);
            romanNumber = romanNumber.replaceFirst("IIII","IV");
            romanNumber = romanNumber.replaceFirst("IVI","V");
            romanNumber = romanNumber.replaceFirst("VIIII","IX");
            result = romanNumber + result;
        }
        if(tens > 0) {
            romanNumber = "X".repeat(tens);
            romanNumber = romanNumber.replaceFirst("XXXX","XL");
            romanNumber = romanNumber.replaceFirst("XLX","L");
            romanNumber = romanNumber.replaceFirst("LXXXX","XC");
            result = romanNumber + result;
        }
        if(hundreds > 0) {
            romanNumber = "C".repeat(hundreds);
            romanNumber = romanNumber.replaceFirst("CCCC","CD");
            romanNumber = romanNumber.replaceFirst("CDC","D");
            romanNumber = romanNumber.replaceFirst("DCCCC","CM");
            result = romanNumber + result;
        }
        if(thousandsUnits > 0) {
            romanNumber = "M".repeat(thousandsUnits);
            result = romanNumber + result;
        }

        return result;
    }
}
