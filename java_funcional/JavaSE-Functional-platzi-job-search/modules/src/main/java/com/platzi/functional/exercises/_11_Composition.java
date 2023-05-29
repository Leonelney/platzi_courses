package com.platzi.functional.exercises;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _11_Composition {
    //TODO: Crear una funcion o grupo de funciones que puedan calcular: x^2 + y^2 + 2xy
    // usando unicamente los operadores: *, + una vez por funcion.
    // Es decir, Math.pow no esta permitido. y funciones del estilo: a * b + c no estan permitidas.
    public static BiFunction<Integer, Integer, Integer> generateEquation() {
        Function<Integer, Integer> multiplyBy2 = x -> x * 2;
        Function<Integer, Integer> powBy2 = x -> x * x;
        BiFunction<Integer, Integer, Integer> powByY = (x, y) -> x * y;
        BiFunction<Integer, Integer, Integer> sum = (x, y) -> x + y;


        return powByY.andThen(multiplyBy2);
    }



    public static void main(String[] args) {
        System.out.println(
                generateEquation().apply(4, 5)
        );
    }


}
