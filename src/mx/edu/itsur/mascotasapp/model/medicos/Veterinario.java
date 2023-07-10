package mx.edu.itsur.mascotasapp.model.medicos;

import java.util.Random;
import mx.edu.itsur.mascotasapp.model.interfaces.IDiagnosticable;
import mx.edu.itsur.mascotasapp.model.mascotas.*;

public class Veterinario {
    //Atributos de la clase
    protected String nombre;
    protected String cedulaProf;
    protected int aniosDeExperiencia;
    
    //Constructor de la clase

    public Veterinario(String nombre, String cedulaProf, int aniosDeExperiencia) 
    {
        this.nombre = nombre;
        this.cedulaProf = cedulaProf;
        this.aniosDeExperiencia = aniosDeExperiencia;
    }
    
    //Metodos de la clase
    public String diagnosticar(IDiagnosticable id)
    {
        
        int EstadoDeSalud = id.getEstadoDeSalud();
        String Diagnostico = "";
        if(id instanceof Perro){
        
            Perro p1=(Perro) id;
        
            System.out.println(p1.getNombre()+" esta siendo diagnosticado por el veterinario: "+this.nombre);
            if (EstadoDeSalud >= 80)
            {
                return Diagnostico="El Perro "+p1.getNombre()+" de raza "+p1.getRaza()+" esta Saludable.\n"
                                   +p1.getNombre()+" ha sido atendido y regresa a casa.";
              
            }
            else if(EstadoDeSalud < 80 && EstadoDeSalud >= 50)
            {
                p1.updateEstadoDeSalud();
                return Diagnostico="El Perro "+p1.getNombre()+" de raza "+p1.getRaza()+" esta Enfermo.\n"
                                +"El veterinario: "+this.nombre+" aplica Medicamento. \n"
                                +"El ESTADO DE SALUD de "+p1.getNombre()+" ha cambiado.\n"
                                +p1.getNombre()+" ha sido atendido y regresa a casa.";

                
            }
            else if(EstadoDeSalud < 50 && EstadoDeSalud > 0)
            {
                p1.updateEstadoDeSalud();
                return Diagnostico="El Perro "+p1.getNombre()+" de raza "+p1.getRaza()+" esta Muriendo\n"
                                    +"El veterinario: "+this.nombre+" aplica Medidas extraordinarias\n"
                                    +"El ESTADO DE SALUD DE "+p1.getNombre()+" ha cambiado\n"
                                    +p1.getNombre()+" ha sido atendido y regresa a casa";
            }
            else if(EstadoDeSalud == 0)
            {
                return Diagnostico = "Lo siento: "+p1.getNombre()+" ha pasado a mejor vida, hicimos todo lo posible";
            }
            
            
        }
        
        else if(id instanceof Pez)
        {
        
            Pez pez1=(Pez) id;
        
            System.out.println(pez1.getNombre()+" esta siendo diagnosticado por el veterinario: "+this.nombre);
            if (EstadoDeSalud >= 8)
            {
                return Diagnostico="El Pez "+pez1.getNombre()+" de especie "+pez1.getEspecie()+" esta Saludable\n"
                                    +pez1.getNombre()+" ha sido atendido y regresa a casa";
              
            }
            else if(EstadoDeSalud <8 && EstadoDeSalud >= 5)
            {
                pez1.updateEstadoDeSalud();
                return Diagnostico = "El Pez "+pez1.getNombre()+" de especie "+pez1.getEspecie()+" esta Enfermo\n"
                                    +"El veterinario: "+this.nombre+" aplica Medicamento\n"
                                    +"El ESTADO DE SALUD DE "+pez1.getNombre()+" ha cambiado\n"
                                    +pez1.getNombre()+" ha sido atendido y regresa a casa";

                
            }
            else if(EstadoDeSalud<5 && EstadoDeSalud >0)
            {   
                pez1.updateEstadoDeSalud();
                return Diagnostico="El Pez "+pez1.getNombre()+" de especie "+pez1.getEspecie()+" esta Muriendo\n"
                                    +"El veterinario: "+this.nombre+" aplica Medidas extraordinarias\n"
                                    +"El ESTADO DE SALUD DE "+pez1.getNombre()+" ha cambiado\n"
                                    +pez1.getNombre()+" ha sido atendido y regresa a casa";
                   
            }
            else if(EstadoDeSalud==0)
            {
                return Diagnostico="Lo siento: "+pez1.getNombre()+" ha pasado a mejor vida, hicimos todo lo posible";
            }
        }
            
            else if(id instanceof Gato)
            {
        
                Gato g1=(Gato) id;
        
                System.out.println(g1.getNombre()+" esta siendo diagnosticado por el veterinario: "+this.nombre);
                if (EstadoDeSalud >= 40)
                {
                    return Diagnostico="El Gato "+g1.getNombre()+" de la raza "+g1.getRaza()+" esta Saludable\n"
                                        +g1.getNombre()+" ha sido atendido y regresa a casa";
              
                }
                else if(EstadoDeSalud <40 && EstadoDeSalud >= 25)
                {
                    g1.updateEstadoDeSalud();
                    return Diagnostico = "El Gato "+g1.getNombre()+" de la raza "+g1.getRaza()+" esta Enfermo\n"
                                        +"El veterinario: "+this.nombre+" aplica Medicamento\n"
                                        +"El ESTADO DE SALUD DE "+g1.getNombre()+" ha cambiado\n"
                                        +g1.getNombre()+" ha sido atendido y regresa a casa";

                
                }
                else if(EstadoDeSalud<25 && EstadoDeSalud >0)
                {
                    g1.updateEstadoDeSalud();
                    return Diagnostico="El Gato "+g1.getNombre()+" de la raza "+g1.getRaza()+" esta Muriendo\n"
                                        +"El veterinario: "+this.nombre+" aplica Medidas extraordinarias\n"
                                        +"El ESTADO DE SALUD DE "+g1.getNombre()+" ha cambiado\n"
                                        +g1.getNombre()+" ha sido atendido y regresa a casa";
                   
                }
                else if(EstadoDeSalud==0)
                {
                    return Diagnostico="Lo siento: "+g1.getNombre()+" ha pasado a mejor vida, hicimos todo lo posible";
                }
            
            }
        
        return "";
    }
        
}

