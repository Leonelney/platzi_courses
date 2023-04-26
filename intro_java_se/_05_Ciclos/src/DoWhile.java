import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // El Do While statement es una variante de While que todos conocemos solamente
        // que la primera iteración siempre la hará sin importar la condición,
        // posteriormente se comportará como un While de toda la vida.
        int response = 0;

        do {
            System.out.println("Selecciona el número de la opción deseada");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Salir");
            System.out.println("-> ");

            Scanner sc = new Scanner(System.in);    // leer desde la terminal STDIN
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 0:
                    System.out.println("Gracias por visitarnos");
                    break;
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                default:
                    System.out.println("Selecciona una opción correcta");
                    break;
            }
        } while (response != 0);
        System.out.println("Se terminó el programa");
    }
}