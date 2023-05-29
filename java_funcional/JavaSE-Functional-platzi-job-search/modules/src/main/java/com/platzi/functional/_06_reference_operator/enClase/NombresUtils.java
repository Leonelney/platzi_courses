package com.platzi.functional._06_reference_operator.enClase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NombresUtils {
    public static void main(String[] args) {
        List<String> profesores = getList("Nicolas", "Juan", "Zulema");

        Consumer<String> printer = text -> System.out.println(text);
        profesores.forEach(printer);

        // usar el operador double colon (::) nos permite hacer referencias a otros métodos
        // para usarlos estas funciones deben utilizar la misma cantidad y tipo de parámetros
        profesores.forEach(System.out::println);
    }

    static <T> List<T> getList(T... elements){
        return Arrays.asList(elements);
    }
}
