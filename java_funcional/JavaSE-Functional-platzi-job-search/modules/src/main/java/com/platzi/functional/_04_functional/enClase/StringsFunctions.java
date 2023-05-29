package com.platzi.functional._04_functional.enClase;

import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public class StringsFunctions {
    public static void main(String[] args) {
        // trabaja sobre un tipo de dato y regres ese mismo tipo de dato
        UnaryOperator<String> quote = text -> "\"" + text + "\"";
        UnaryOperator<String> addMark = text -> text + "!";

        System.out.println(quote.apply(addMark.apply("Hola Mundo")));

        // recibe dos tipos de datos y regresa un tipo de dato
        // cuando los tipos de datos son iguales y el resultado igual podemos usar BinaryOperator<>
        BiFunction<Integer,Integer,Integer> multiplicacion =
                (x, y) -> x * y;

        System.out.println(multiplicacion.apply(4,5));

        BiFunction<String, Integer, String> leftPad =
                (text, number) -> String.format("%" + number + "s", text);

        System.out.println(leftPad.apply("Java", 10));
    }
}
