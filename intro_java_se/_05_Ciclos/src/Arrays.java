public class Arrays {
    public static void main(String[] args) {
        // arrays en Java
        // los arreglos son solo de un objeto, por lo que no puede contener diferentes valores de diferentes tipos.
        // SINTAXIS     TipoDato[] nombreVariable;      TipoDato nombreVariable[];
        // SINTAXIS     nombreVariable = new TipoDato[capacidad];
        String[] androidVersions = new String[17];
        String days[] = new String[7];

        String[][] cities = new String[4][2];

        // con arreglos de 3 o más dimensiones ya se recomienda pasar la información a una base de datos
        int[][][] numbers = new int[2][2][2];
        int[][][][] numbers2 = new int[2][2][2][2];

        // los indices so la manera de identificar una posición en un arreglo (n-1)
        // SINTAXIS nombreVariable[indice] = valor;
        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Banana Bread";
        androidVersions[2] = "Cup Cake";
        androidVersions[3] = "Donut";

        // al recorrer el array en todas sus posiciones ser muestra los campos que no hemos llenado
        for (int i = 0; i < androidVersions.length; i++) {
            System.out.println(androidVersions[i]);
        }

        System.out.println();
        System.out.println();

        cities[0][0] = "Colombia";
        cities[0][1] = "Medillín";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogotá";
        cities[2][0] = "México";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "México";
        cities[3][1] = "CDMX";

        // for anidados
        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
        }

        System.out.println();
        System.out.println();

        // el for each es un ciclo que nos permite iterar los elementos de un array desde su definición
        // SINTAXIS for(tipoDato newNombre : nombreArray)
        for (String androidVersion : androidVersions) {
            System.out.println(androidVersion);
        }
    }
}
