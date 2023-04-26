public class IfStatement {
    public static void main(String[] args) {
        // IF statement
        boolean isActivated = true;  // variable global (modificar para ver diferentes resultados)
        int fileSended = 3;  // variable global

        if (isActivated) {
            fileSended++;
            System.out.println("Archivo enviado!");
            System.out.println(fileSended);
        }

        // Un tema importante en todo lenguaje de programación es el alcance o mejor conocido como scope de sus variables, ya que dependiendo de donde se inicialice una variable esta tendra un alcance de uso, lo que hace que no pueda ser llamada en cualquier parte del código como si nada.
        // variables globales: Se definen antes de entrar a una función o proceso
        // Variables locales: Se definen para un proceso en especifico en una función especifica

        // If-else statement
        if (isActivated) {
            System.out.println("Enviado otro archivo!");
            int i = 0; // variable local
            System.out.println(++i);
        } else {
            System.out.println("Error: no esta activado");
        }
    }
}