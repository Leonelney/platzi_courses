public class SwitchStatement {
    public static void main(String[] args) {
        // Switch es ideal para evitar usar muchos If statements
        // Switch statement solo admite los tipos de datos: byte, short, int, char,
        // string y enum; no admite boolean, long, float y double.
        String colorModeSelected = "Dark";

        switch (colorModeSelected){
            case "Light":
                System.out.println("Seleccionaste Light Mode");
                break;
            case "Night":
                System.out.println("Seleccionaste Night Mode");
                break;
            case "Blue Dark":
                System.out.println("Seleccionaste Blue Dark Mode");
                break;
            case "Dark":
                System.out.println("Seleccionaste Dark Mode");
                break;
            default:
                System.out.println("Seleccionaste Default Mode");
                break;
        }

    }
}
