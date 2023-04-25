public class Variables {
    public static void main(String[] args) {
        // las variables en Java se compondrán de un nombre y un valor.
        // <tipo de dato> <nombre>;
        int speed;
        // asignamos un valor a una variable
        speed = 10;
        // vemos el valor de la variable
        System.out.println(speed);

        // podemos inicializar una variable desde el principio
        int salary = 25000;
        String employeeName = "Leonel Olivares";
        // podemos usar formatos para facilitar las impreciones de datos
        // esto lo hacemos con printf
        System.out.printf("%s gana %s al mes.",employeeName, salary);
    }
}