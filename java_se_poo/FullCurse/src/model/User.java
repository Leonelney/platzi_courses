package model;

// abstract nos permite crear clases abstractas que son clases que no necesitamos crear instancias
// en una clase abstracta no implementaremos todos los métodos y no crearemos instancias
// casi siempre serán clases padres que heredan a otras clases
public abstract class User {
    // esta clase funcionará como una clase padre para realizar herencia, aquí tenemos
    // todos los atributos y métodos en común dentro de los diferentes usuarios del hospital
    // atributos
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 8){
            System.out.println("Formato del número teléfonico incorrecto");
        }else{
            this.phoneNumber = phoneNumber;
        }
    }

    // @Override sirve para indicar que se esta modificando un método que es de la clase padre.
    // toString() funciona para hacer casteos al tipo de dato String
    @Override
    public String toString() {
        return "model.User: " + name + ", Email: " + email + "\nAddress: " + address + ", Phone: " + phoneNumber;
    }

    // métodos abstractos
    // Los Métodos Abstractos son los métodos que debemos implementar obligatoriamente
    // cada vez que usemos nuestras clases abstractas, mientras que los métodos que no
    // sean abstractos van a ser opcionales.
    // Solo se pueden implementar en clases abstractas.
    public abstract void showDataUser();
}
