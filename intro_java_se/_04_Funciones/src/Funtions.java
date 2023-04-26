public class Funtions {
    // <modificador de acceso> <valor de regreso> <nombre> (<argumentos>)
    // las funciones deben vivir al nivel del scope de la clase
    // la palabra reservada static solo se utiliza en funciones que se utilizan o se
    // comparten con la función main()
    public static double CircleArea(double r){
        return Math.PI * Math.pow(r,2); // return es la palabra reservada para enviar el resultado de la función
    }

    public static double ConverToDolar(double quantity, String currency){
        double newQuantity = 0;
        switch (currency){
            case "MXN":
                newQuantity = quantity * 0.052;
                break;
            case "COP":
                newQuantity = quantity * 0.00031;
                break;
        }
        return newQuantity;
    }

    public static void main(String[] args) {
        // las funciones nos permiten organizar y modularizar el código, reutilizar
        // código y evitar código repetido.
        int r = 5;  // radio de un circulo
        System.out.println(CircleArea(r));  // imprimir el área de un círculo

        // convertir pesos méxicanos a dolares
        System.out.println(ConverToDolar(500, "MXN"));
        // convertir pesos colonbianos a dolares
        System.out.println(ConverToDolar(1000, "COP"));
    }
}