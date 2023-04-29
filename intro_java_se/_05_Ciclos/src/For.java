public class For {

    static boolean isTurnOnLight = false;

    public static void main(String[] args) {
        // ejemplo de un for en Java
        turnOnOffLight();

        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0){
                continue;   // continue hace que se ejecute la sigueinte iteración omitiendo lo que seguia en el ciclo
            }
            printSOS();
            if (i == 5) {
                break;  // break finaliza el ciclo
            }
        }
        // este ciclo solo imprimirá 3 señales de S.O.S porque antes del break hay 3
        // valores (1, 3, 5) que no cuimplen la condición de i % 2 == 0

    }

    public static void printSOS (){
        System.out.println(". . . - - - . . .");
    }

    public static boolean turnOnOffLight (){
        isTurnOnLight = (isTurnOnLight)?false:true;
        return isTurnOnLight;
    }
}
