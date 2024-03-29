package model;

public class Nurse extends User {
    private String speciality;

    public Nurse(String name, String email) {
        super(name, email);
    }

    // sobreescritura de método abstracto
    @Override
    public void showDataUser() {
        System.out.println("Hospital: Cruz Verde");
        System.out.println("Departamentos: Nutriología, Pediatría");
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
