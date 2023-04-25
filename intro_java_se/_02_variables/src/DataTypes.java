public class DataTypes {
    public static void main(String[] args) {
        // Java es un lenguaje de programación fuertemente tipado por lo que se tiene
        // que definir el tipo de dato de la variable a inicializar
        // byte (-128 hasta 127)
        byte b = 127;   // 1 byte
        // short (-32,768 hasta 32,767)
        short s = 32767;    // 2 bytes
        // integer (-2,147,483,648 hasta 2,147,483,647)
        int i = 2147483647; // 4 bytes
        // long (-9,223,372,036,854,775,808 hasta 9,223,372,036,854,775,807)
        long l = 9223372036854775807L; // 8 bytes (lleva "L" al final)
        // float (1.4012 e-45 hasta 3.4028 e+38)
        float f = 3.1416F;  // 4 bytes (lleva "F" al final)
        // double (4.9406 e-324d hasta 1.7976 e+308d)
        double d = 3.1416;  // 8 bytes

        // char (unicode)
        char c = 'a';   // 2 bytes (comilla simple para char)
        // boolean (true or false)
        boolean bo = true;

        // a partir de Java 10 se puede usar un tipo de dato genérico para inferir el
        // tipo de dato de una variable
        var salary = 1000;  // int
        var pension = salary * 0.03;    // double
        var totalSalary = salary - pension; // double
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Leonel Olivares";
        System.out.println("El empleado se llama " + employeeName + "y su salario neto es " + totalSalary);
    }
}
