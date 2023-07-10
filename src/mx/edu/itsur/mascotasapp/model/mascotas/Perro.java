package mx.edu.itsur.mascotasapp.model.mascotas;

import java.time.LocalDate;
import java.io.Serializable;

public class Perro extends Mascota implements Serializable{
    //atributos de la clase
    protected String raza;
    public static final int SALUD_MAXIMA = 100;

    public Perro(String nombre, String color, LocalDate fechaDeNacimiento, int estadoDeSalud, String raza) {
        super(nombre, color, fechaDeNacimiento, estadoDeSalud);
        this.raza = raza;
    }

    //getter y setter

    public String getRaza() {
        return raza;
    }
    
    //metodos
    @Override
    public void jugar() 
    {
        if(SALUD_MAXIMA > 0)
        {
            System.out.println(this.nombre+", está jugando contigo...");
            System.out.println("Yipi, que divertido,");
            ladrar();
            updateEstadoDeSalud();
            System.out.println(this.nombre+" jugo demasiado, su ESTADO DE SALUD ha cambiado!");
        }else
        {
            System.out.println("Pasaron buenos momentos juntos, pero "+this.nombre+" ya no puede jugar mas.");
        }
    }
    
    public void ladrar()
    {
        System.out.println(this.nombre+" dice: GUAU GUAU!!!");
    }

    @Override
    public void updateEstadoDeSalud() {
        estadoDeSalud = (int)(Math.random()* Perro.SALUD_MAXIMA);
    }
    
}
