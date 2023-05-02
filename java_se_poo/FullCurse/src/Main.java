import model.Doctor;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        // para declarar una un objeto a partir de una clase.
        // SINTAXIS     tipoObjeto nombreObjeto = new tipoObjeto();
        // new tipoObjeto(); es el método constructor este siempre va despues de new y
        // utiliza el nombre de la clase seguido de parentesis.
        // por default Java crea uno para cada clase, pero nosotro podemos crearlo para
        // modificar su comportamiento y muchas otras cosas.
        // Doctor myDoctor = new Doctor(); // método constructor

        // la forma de tener acceso a los atributos y métodos es apartir de la sintaxis "."

        // si aumentamos el id de la clase model.Doctor este influira por ser una variable static

        // static para los metodos nos permitiran usar métodos más allá de crear objetos
        // para llamar al método
        showMenu();

    }
}