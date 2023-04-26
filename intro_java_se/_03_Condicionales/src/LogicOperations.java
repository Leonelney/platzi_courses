public class LogicOperations {
    public static void main(String[] args) {
        // operadores de equidad
        System.out.println(true == true); // igual a
        System.out.println(false != false); // diferente a

        // operadores relacionales
        System.out.println(3 < 6);
        System.out.println(2 > 4);
        System.out.println(5 <= 5);
        System.out.println(3 >= 6);

        // operadores lógicos
        System.out.println(3 > 2 && 1 < 2); // AND
        System.out.println(3 > 2 || 1 > 2); // OR
        System.out.println(!(3 > 2));  // NOT

        // If - else if - else statement
        int a = 5;
        int b = 8;
        if (a == b) {
            System.out.println("a es igual b");
        } else if (a > b) {
            System.out.println("a es mayor que b");
        } else {
            System.out.println("b es mayor que a");
        }
    }
}
