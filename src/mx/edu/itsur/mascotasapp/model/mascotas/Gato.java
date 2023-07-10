package mx.edu.itsur.mascotasapp.model.mascotas;

import java.time.LocalDate;
import java.io.Serializable;

public class Gato extends Mascota implements Serializable {
    //Atributos de la clase
    protected String raza;
    public static final int SALUD_MAXIMA = 50; 
    
    //Getters y Setters

    public String getRaza() 
    {
        return raza;
    }
    

    //Constructor de la clase
    public Gato(String nombre, String color, LocalDate fechaDeNacimiento, int estadoDeSalud, String raza) 
    {
        super(nombre, color, fechaDeNacimiento, estadoDeSalud);
        this.raza = raza;
    }

    
    
    //Metodos de la clase
    public void maullar()
    {
        System.out.println(this.nombre+" dice: MEOOWW!!!");
    }
    @Override
    public void jugar() 
    {
        if(SALUD_MAXIMA > 0)
        {
        System.out.println(this.nombre+", está jugando contigo...");
        System.out.println("Yipi, que divertido,");
        maullar();
        updateEstadoDeSalud();
        System.out.println(this.nombre+" jugo demasiado, su ESTADO DE SALUD ha cambiado!");
        }else
        {
            System.out.println("Pasaron buenos momentos juntos, pero "+this.nombre+" ya no puede jugar mas.");
        }
    }

    @Override
    public void updateEstadoDeSalud() {
        estadoDeSalud = (int)(Math.random()*Gato.SALUD_MAXIMA);
    }
    
}
