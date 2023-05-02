package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

// clase
public class Doctor extends User {
    // atributos
    private String speciality;
    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    // método constructor
    // podemos crear diferentes métodos constructores que cambia por los argumentos que
    // recibe y puede hacer diferentes acciones, a esto se le conoce como sobrecarga de constructores

    public Doctor(String name, String email){
        super(name, email);
    }

    // comportamientos
    public void addAvailableAppoinment(String date, String time){
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable: " + availableAppointments.toString();
    }

    // sobreescritura de método abstracto
    @Override
    public void showDataUser() {
        System.out.println("Hospital: Cruz Roja");
        System.out.println("Departamento: Cancerología");
    }

    // getter and setter
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    // clases anidadas
    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Available Appointments \nDate: " + date + "\nTime: " + time;
        }
    }
}
