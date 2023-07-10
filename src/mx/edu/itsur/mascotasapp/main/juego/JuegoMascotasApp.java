package mx.edu.itsur.mascotasapp.main.juego;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;
import mx.edu.itsur.mascotasapp.model.mascotas.*;
import mx.edu.itsur.mascotasapp.model.medicos.Veterinario;

public class JuegoMascotasApp {
    //Atributos
    private ArrayList<Mascota> mascotas = new ArrayList<>();
    private Veterinario V1 = new Veterinario("Luis", "ACJLN13658", 9);  
    private boolean gameOver =  false;
    
    //Metodos de la clase
    public void iniciarJuego()
    {
        while(!gameOver){    
        System.out.println("""
                     **MASCOTAS APP - MENU PRINCIPAL**
                    ------------------------------------           
                    1. Ver mascotas :D
                    2. Alimentar mascota.
                    3. Jugar con mascota.
                    4. Llevar mascota a veterinario.
                    5. Adoptar nueva mascota.
                    6. salir.
                    ------------------------------------           
                        ¿Que accion desea realizar?
                    (escriba el numero y presione ENTER)
                    """);
        
        try{
            char lectura = (char) System.in.read();
            System.in.skip(2);//Omitir los caracteres /n /r del ENTER.
            
            switch(lectura)
            {
                case '1':
                    verMascotas();
                    break;
                case '2':
                    alimentarMascota();
                    break;
                case '3':
                    jugarConMascota();
                    break;
                case '4':
                    llevarMascotaAlVeterinario();
                    break;
                case '5':
                    adoptarNuevaMascota();
                    break;
                case '6':
                    System.out.println("El juego a terminado, nos vemos pronto.");
                    gameOver = true;
                    break;
                default:
                    System.out.println("Elija una opcion VALIDA!!");
            }
            System.out.println("Presione ENTER para regresar al menu principal.");
            System.in.read(new byte[System.in.available()]);//lipiar 
            System.in.read();//Esperar el ENTER al importar lo escrito.
            System.in.read(new byte[System.in.available()]);
        }
        catch(IOException ex){
            System.out.println("Ocurrio un problema: " + ex.getMessage());
        }
    }
        
    }

    
    private void verMascotas()
    {
        System.out.println("**ESTAS SON LAS MASCOTAS**\n");
        System.out.println("---------------------------------------------------------");
        System.out.println("|No.\t|Tipo\t|Nombre\t|Raza\t|Color\t|FechaNacimi.\t|Salud");
        System.out.println("---------------------------------------------------------");
        
        for(int i = 0; i< mascotas.size();i++)
            {
                Mascota pet = mascotas.get(i);
                if(pet instanceof Perro p)
                {
                    System.out.println("|"+(i+1) +"\t|Perro"+ "\t|"+ pet.getNombre()+"\t|"+p.getRaza()+"\t|"+pet.getColor()+"\t|"+pet.getFechaDeNacimiento()+"\t|"+pet.getEstadoDeSalud());
                    System.out.println("---------------------------------------------------------");
                }  
                if(pet instanceof Gato g)
                {
                    System.out.println("|"+(i+1) +"\t|Gato"+ "\t|"+ pet.getNombre()+"\t|"+g.getRaza()+"\t|"+pet.getColor()+"\t|"+pet.getFechaDeNacimiento()+"\t|"+pet.getEstadoDeSalud());
                    System.out.println("---------------------------------------------------------");
                } 
                if(pet instanceof Pez pez)
                {
                    System.out.println("|"+(i+1) +"\t|Pez"+ "\t|"+ pet.getNombre()+"\t|"+pez.getEspecie()+"\t|"+pet.getColor()+"\t|"+pet.getFechaDeNacimiento()+"\t|"+pet.getEstadoDeSalud());
                    System.out.println("---------------------------------------------------------");
                } 
            }
    }
    
    private void alimentarMascota() throws IOException
    {
        System.out.println("**ESTAS SON LAS MASCOTAS**\n");
        System.out.println("---------------------------------------------------------");
        System.out.println("|No.\t|Tipo\t|Nombre\t|Raza\t|Color\t|FechaNacimi.\t|Salud");
        System.out.println("---------------------------------------------------------");
        
        for(int i = 0; i< mascotas.size();i++)
            {
                Mascota pet = mascotas.get(i);
                if(pet instanceof Perro p)
                {
                    System.out.println("|"+(i+1) +"\t|Perro"+ "\t|"+ pet.getNombre()+"\t|"+p.getRaza()+"\t|"+pet.getColor()+"\t|"+pet.getFechaDeNacimiento()+"\t|"+pet.getEstadoDeSalud());
                    System.out.println("---------------------------------------------------------");
                }  
                if(pet instanceof Gato g)
                {
                    System.out.println("|"+(i+1) +"\t|Gato"+ "\t|"+ pet.getNombre()+"\t|"+g.getRaza()+"\t|"+pet.getColor()+"\t|"+pet.getFechaDeNacimiento()+"\t|"+pet.getEstadoDeSalud());
                    System.out.println("---------------------------------------------------------");
                } 
                if(pet instanceof Pez pez)
                {
                    System.out.println("|"+(i+1) +"\t|Pez"+ "\t|"+ pet.getNombre()+"\t|"+pez.getEspecie()+"\t|"+pet.getColor()+"\t|"+pet.getFechaDeNacimiento()+"\t|"+pet.getEstadoDeSalud());
                    System.out.println("---------------------------------------------------------");
                } 
            }
        System.out.println("Escribe el No. de Mascota a alimentar: _");
        System.in.read(new byte[System.in.available()]);
        int lectura = Integer.parseInt(String.valueOf((char) System.in.read()));
        
        Mascota pet = this.mascotas.get(lectura - 1);
        pet.comer();
  
    }
    
    private void jugarConMascota() throws IOException
    {
        System.out.println("**ESTAS SON LAS MASCOTAS**\n");
        System.out.println("---------------------------------------------------------");
        System.out.println("|No.\t|Tipo\t|Nombre\t|Raza\t|Color\t|FechaNacimiento.\t|Salud");
        System.out.println("---------------------------------------------------------");
        
        for(int i = 0; i< mascotas.size();i++)
            {
                Mascota pet = mascotas.get(i);
                if(pet instanceof Perro p)
                {
                    System.out.println("|"+(i+1) +"\t|Perro"+ "\t|"+ pet.getNombre()+"\t|"+p.getRaza()+"\t|"+pet.getColor()+"\t|"+pet.getFechaDeNacimiento()+"\t"+pet.getEstadoDeSalud());
                    System.out.println("---------------------------------------------------------");
                }  
                if(pet instanceof Gato g)
                {
                    System.out.println("|"+(i+1) +"\t|Garo"+ "\t|"+ pet.getNombre()+"\t|"+g.getRaza()+"\t|"+pet.getColor()+"\t|"+pet.getFechaDeNacimiento()+"\t"+pet.getEstadoDeSalud());
                    System.out.println("---------------------------------------------------------");
                } 
                if(pet instanceof Pez pez)
                {
                    System.out.println("|"+(i+1) +"\t|Pez"+ "\t|"+ pet.getNombre()+"\t|"+pez.getEspecie()+"\t|"+pet.getColor()+"\t|"+pet.getFechaDeNacimiento()+"\t"+pet.getEstadoDeSalud());
                    System.out.println("---------------------------------------------------------");
                } 
            }
        
        System.out.println("Escribe el No. de Mascota con la cual jugaras: _");
        System.in.read(new byte[System.in.available()]);
        int lectura = Integer.parseInt(String.valueOf((char) System.in.read()));
        
        Mascota pet = this.mascotas.get(lectura - 1);
        
            if(pet instanceof Perro p)
                {
                    p.jugar();
                }
            if(pet instanceof Gato g)
                {
                    g.jugar();
                }
            if(pet instanceof Pez pez)
                {
                    pez.jugar();
                }
        
    }
    
    private void llevarMascotaAlVeterinario() throws IOException
    {
        System.out.println("**ESTAS SON LAS MASCOTAS**\n");
        System.out.println("---------------------------------------------------------");
        System.out.println("|No.\t|Tipo\t|Nombre\t|Raza/Especie\t|Color\t|Fecha Nacimiento.\t|Salud");
        System.out.println("---------------------------------------------------------");
        
        for(int i = 0; i< mascotas.size();i++)
            {
                Mascota pet = mascotas.get(i);
                if(pet instanceof Perro p)
                {
                    System.out.println("|"+(i+1) +"\t|Perro"+ "\t|"+ pet.getNombre()+"\t|"+p.getRaza()+"\t|"+pet.getColor()+"\t|"+pet.getFechaDeNacimiento()+"\t"+pet.getEstadoDeSalud());
                    System.out.println("---------------------------------------------------------");
                }  
                if(pet instanceof Gato g)
                {
                    System.out.println("|"+(i+1) +"\t|Gato"+ "\t|"+ pet.getNombre()+"\t|"+g.getRaza()+"\t|"+pet.getColor()+"\t|"+pet.getFechaDeNacimiento()+"\t"+pet.getEstadoDeSalud());
                    System.out.println("---------------------------------------------------------");
                } 
                if(pet instanceof Pez pez)
                {
                    System.out.println("|"+(i+1) +"\t|Pez"+ "\t|"+ pet.getNombre()+"\t|"+pez.getEspecie()+"\t|"+pet.getColor()+"\t|"+pet.getFechaDeNacimiento()+"\t"+pet.getEstadoDeSalud());
                    System.out.println("---------------------------------------------------------");
                } 
            }
        System.out.println("Escribe el No. de Mascota que llevaras al veterinario: _");
        
        System.in.read(new byte[System.in.available()]);
        int lectura = Integer.parseInt(String.valueOf((char) System.in.read()));
        
        Mascota pet = this.mascotas.get(lectura - 1);
        
        System.out.println(this.V1.diagnosticar(pet));
    }
    
    private void adoptarNuevaMascota() throws IOException
    {
        Scanner s = new Scanner(System.in);
        //char lectura = (char) System.in.read();
        System.out.println("**LLENA EL FORMULARIO PARA ADOPTAR LA NUEVA MASCOTA **");
        System.out.println("Tipo de mascota? [p]erro, [g]gato, Pe[z] ([x] para cancelar)");
        
        String lectura = s.next();
        switch(lectura)
        {
            
            case "x":
                System.out.println("Se cancelo la adopcion, esperamos verte en un futuro.");
                break;
            case "p":
                System.out.println("Ingresa el nombre de la mascota:");
                String nombrep = s.next();
                System.out.println("Ingresa la raza de la mascota:");
                String razap = s.next();
                System.out.println("Ingresa el Color de la mascota:");
                String colorp = s.next();
                System.out.println("ingresa el Anio de nacimiento de la mascota:");
                int aniop = s.nextInt();
                System.out.println("Ingresa el Mes de nacimiento de la mascota:");
                int mesp = s.nextInt();
                System.out.println("Ingresa el Dia de nacimiento de la mascota:");
                int diap = s.nextInt();
                mascotas.add(new Perro(nombrep, colorp,LocalDate.of(aniop, mesp, diap), 100, razap));
                System.out.println("FELICIDADES! has adoptado una nueva mascota.");
                
                break;
            case "g":
                System.out.println("Ingresa el nombre de la mascota:");
                String nombreg = s.next();
                System.out.println("Ingresa la raza de la mascota:");
                String razag = s.next();
                System.out.println("Ingresa el Color de la mascota:");
                String colorg = s.next();
                System.out.println("ingresa el Anio de nacimiento de la mascota:");
                int aniog = s.nextInt();
                System.out.println("Ingresa el Mes de nacimiento de la mascota:");
                int mesg = s.nextInt();
                System.out.println("Ingresa el Dia de nacimiento de la mascota:");
                int diag = s.nextInt();
                mascotas.add(new Gato(nombreg, colorg,LocalDate.of(aniog, mesg, diag), 50, razag));
                System.out.println("FELICIDADES! has adoptado una nueva mascota.");
                break;
            case "z":
                System.out.println("Ingresa el nombre de la mascota:");
                String nombre = s.next();
                System.out.println("Ingresa la especie de la mascota:");
                String especie = s.next();
                System.out.println("Ingresa el Color de la mascota:");
                String color = s.next();
                System.out.println("ingresa el Anio de nacimiento de la mascota:");
                int anio = s.nextInt();
                System.out.println("Ingresa el Mes de nacimiento de la mascota:");
                int mes = s.nextInt();
                System.out.println("Ingresa el Dia de nacimiento de la mascota:");
                int dia = s.nextInt();
                mascotas.add(new Pez(nombre, color,LocalDate.of(anio, mes, dia), 10, especie));
                System.out.println("FELICIDADES! has adoptado una nueva mascota.");
                break;
            default:
                System.out.println("Por favor seleccione una opcion valida.");
        }
    
    }

}
