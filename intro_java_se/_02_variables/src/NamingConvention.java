public class NamingConvention {
    public static void main(String[] args) {
        // Java es sensible a las mayúsculas y minúsculas
        int celphone = 55555555;
        int celPhone = 66778899;
        System.out.println(celphone);
        System.out.println(celPhone);
        // los nombres deben empezar con una letra, "$" o "_"
        String countryName = "MX";
        String $state = "CDMX";
        String _street = "Miguel Hidalgo";
        String curp$ = "KLJD324562HDFJTT01";
        String background_color = "RED";

        // también tenemos constantes en Java y estas tienen otra convención
        // Letras posteriores pueden ser letras, números, "$" y "_"
        // Las constantes se escriben en mayúsculas y contienen "_"
        int POSITION = -5;
        int MAX_WIDHT = 9999;
        int MIN_WIDHT = 1;
        // las constantes se pueden definir también con la palabra reservada "final"
        final String NOMBRE_COMPLETO = "Leonel Olivares Conchillos";

        // también podemos usar la convención Upper Camel Case o Lower Camel Case
        String UpperCamelCase;  // la primer letra es mayúscula (solo para nombre de clases)
        String lowerCamelCase;  // la primer letra es minúscula (solo para nombres de variables y nombres de métodos)
    }
}
