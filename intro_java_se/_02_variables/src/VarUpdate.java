public class VarUpdate {
    public static void main(String[] args) {
        // las variables pueden ser redifinidas dependiendo de las necesidades del proyecto
        int salary = 1000;
        salary += 200;  // los empleados recibieron un aumento
        System.out.println(salary);

        // pero ahora se le quita 50 pesos de la pensión
        salary -= 50;
        System.out.println(salary);

        // más 2 horas extra de 30 pesos cada una
        salary += 2 * 30;
        System.out.println(salary);

        // podemos actualizar cadenas de texto (Strings)
        String employee = "Leonel Olivares";
        employee += " Conchillos";  // cuando sumamos Strings se realiza una concatenación
        System.out.println("Mi nombre es " + employee);
    }
}
