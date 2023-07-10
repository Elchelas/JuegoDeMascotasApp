package mx.edu.itsur.mascotasapp.model.mascotas;

import java.time.LocalDate;
import mx.edu.itsur.mascotasapp.model.interfaces.IDiagnosticable;
import java.io.Serializable;

public abstract class  Mascota implements IDiagnosticable, Serializable{
    //Metodos de la clase
    protected String nombre;
    protected String color;
    protected LocalDate fechaDeNacimiento;
    protected int estadoDeSalud;
    
    //Constructor de la clase

    public Mascota(String nombre, String color, LocalDate fechaDeNacimiento, int estadoDeSalud) {
        this.nombre = nombre;
        this.color = color;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.estadoDeSalud = estadoDeSalud;
    }
    
    //Getter y Setters

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    @Override
    public int getEstadoDeSalud() {
        return estadoDeSalud;
    }
    
    //Metodos de la clase
    public void comer(){
        System.out.println(this.nombre+", se esta alimentando...");
        System.out.println("Mmmm, que rica comida,");
        updateEstadoDeSalud();
        System.out.println(this.nombre+" esta satisfecho, su ESTADO DE SALUD ha cambiado.");
    }
    public abstract void jugar();
    
}
