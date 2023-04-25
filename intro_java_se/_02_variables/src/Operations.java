public class Operations {
    public static void main(String[] args) {
        // operaciones de asignación
        int num = 10;
        System.out.println(num);
        num += 5;
        System.out.println(num);
        num -= 3;
        System.out.println(num);
        num *= 2;
        System.out.println(num);
        num /= 3;
        System.out.println(num);
        num %= 5;
        System.out.println(num);

        // operadores de incremento y decremento
        num = 5;
        // primero se imprime y luego se incrementa uno
        System.out.println(num++);  // posfijo
        // primero se incrementa uno y luego se imprime
        System.out.println(++num);  // prefijo

        // primero se imprime y luego se decrementa uno
        System.out.println(num--);  // posfijo
        // primero se decrementa uno y luego se imprime
        System.out.println(--num);  // prefijo
    }
}
