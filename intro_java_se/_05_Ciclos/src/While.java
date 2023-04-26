public class While {
    static boolean isTurnOnLight = false;

    public static void main(String[] args) {
        turnOnOffLight();
        int index = 0;
        while (isTurnOnLight && index <= 10){
            printSOS();
            index++;
        }
    }

    public static void printSOS (){
        System.out.println(". . . - - - . . .");
    }

    public static boolean turnOnOffLight (){
        /* El operador ternario funciona como un if donde el primer valor después del ?
        se regresa cuando se cumple la condición dentro de los parentesis y el segundo
        valor cuando no se cumple*/
        isTurnOnLight = (isTurnOnLight)?false:true;
        return isTurnOnLight;
    }
}
