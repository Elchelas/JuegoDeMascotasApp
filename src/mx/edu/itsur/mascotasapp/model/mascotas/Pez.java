package mx.edu.itsur.mascotasapp.model.mascotas;

import java.time.LocalDate;
import java.io.Serializable;

public class Pez extends Mascota implements Serializable{
    //Atributos de la clase
    protected String especie;
    public static final int SALUD_MAXIMA = 10;
    
    //Constructor de la clase

    public Pez(String nombre, String color, LocalDate fechaDeNacimiento, int estadoDeSalud, String especie) {
        super(nombre, color, fechaDeNacimiento, estadoDeSalud);
        this.especie = especie;
    }
    
    //Getters y Setters

    public String getEspecie() {
        return especie;
    }
    
    //Metodos de la clase
    public void nadar()
    {
        System.out.println(this.nombre+" dice: FLOW FLOW FLOW!!!");
    }

    @Override
    public void jugar() {
        if(SALUD_MAXIMA > 0)
        {
        System.out.println(this.nombre+", está jugando contigo...");
        System.out.println("Yipi, que divertido,");
        nadar();
        updateEstadoDeSalud();
        System.out.println(this.nombre+" jugo demasiado, su ESTADO DE SALUD ha cambiado!");
        }else
        {
            System.out.println("Pasaron buenos momentos juntos, pero "+this.nombre+" ya no puede jugar mas.");
        }
    }

    @Override
    public void updateEstadoDeSalud() {
        estadoDeSalud = (int)(Math.random()*Pez.SALUD_MAXIMA);
    }
    
}
