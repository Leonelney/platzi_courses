public class CastingTypes {
    public static void main(String[] args) {
        // En la programación hay situaciones donde se necesita cambiar el tipo de dato
        double d = 86.45;
        System.out.println(d);
        // ESTIMACIÓN
        int i = (int) d;
        System.out.println(i); // solo se quedá con la parte entera
        // EXACTITUD
        int a = 30;
        int b = 12;
        System.out.println(a/b);
        System.out.println((double) a/b);

        // al realizar casteos siempre hay que tener en cuenta que una variable o tipo
        // de dato chica, es decir su tamaño en bytes, se va a poder castear a otro tipo
        // que sea má grande por que si se realizá de manera inversa puede que haya
        // perdida de información a la hora de de castear por que se puede dar un
        // desbordamiento de los datos (overflow)

        // existen también casteos automáticos y casteos explicitos
        double c = a/b; // automático
        System.out.println(c);
        c = (double) a/b;   // explicito
        System.out.println(c);

        // otro ejemplo
        char n = '1';
        int ni = n; // automático por que un char es más pequeño que un int
        System.out.println(ni); // nos regresa su valor entero de la tabla ASCII

        short nS = (short) n; // explicito por que un char es más grande que un short
        System.out.println(nS);
    }
}
