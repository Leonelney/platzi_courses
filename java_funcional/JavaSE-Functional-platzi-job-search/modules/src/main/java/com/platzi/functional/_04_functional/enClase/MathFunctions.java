package com.platzi.functional._04_functional.enClase;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {
    public static void main(String[] args) {
        Function<Integer, Integer> squareFunction = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * integer;
            }
        };
        System.out.println(squareFunction.apply(5));
        System.out.println(squareFunction.apply(25));

        // nueva sintaxis más entendible
        Function<Integer, Boolean> isOdd = x -> x % 2 == 1;
        System.out.println(isOdd.apply(4));
        System.out.println(isOdd.apply(5));

        // predicate es igual que Function<"anyType", Boolean>, siempre retorna valores booleanos
        Predicate<Integer> isEven = x -> x % 2 == 0;
        // para validarlos ya que se consideran como un test se usa el método test()
        System.out.println(isEven.test(4));
        System.out.println(isEven.test(5));

        // ahora trabajaremos con clases
        Predicate<Student> isApproved = student -> student.getCalificacion() >= 6.0;
        Student leonel = new Student(5.9);
        System.out.println(isApproved.test(leonel));
    }

    static class Student {
        private double calificacion;

        public Student(double calificacion) {
            this.calificacion = calificacion;
        }

        public double getCalificacion() {
            return calificacion;
        }
    }
}
