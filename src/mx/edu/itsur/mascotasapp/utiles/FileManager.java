package mx.edu.itsur.mascotasapp.utiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.edu.itsur.mascotasapp.model.mascotas.*;

public class FileManager{
    
    public static final String GAME_FILE_NAME = "mascotas.app";

    public void guardarAvances (ArrayList<Mascota> datos) 
    {
    try{
        FileOutputStream escritor = new FileOutputStream(GAME_FILE_NAME);
        
        ObjectOutputStream escritorDeObjetos = new ObjectOutputStream(escritor);

        escritorDeObjetos.writeObject(datos);
        escritorDeObjetos.close();
        escritor.close();
        
        System.out.println("Los datos se han escrito correctamente");
        }catch(FileNotFoundException ex){
            System.out.println("Ocurrio un problema al acceder/crear el archivo");
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (IOException ex) {
            System.out.println("Ocurrio un problema el intetar escribir objetos hacia archivo");
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static ArrayList<Mascota> recuperarAvances() {
        ArrayList datos = new ArrayList();
        try {
            FileInputStream Entrada = new FileInputStream(GAME_FILE_NAME);
            
            ObjectInputStream lector = new ObjectInputStream(Entrada);
            
            datos = (ArrayList)lector.readObject();
            lector.close();
            Entrada.close();
            System.out.println("Avances recuperados correctamente.");
        }
        catch (FileNotFoundException e) {
            System.out.println("No se puedo recuperar informacion plasmada anteriormente.");
        }
        catch (IOException | ClassNotFoundException e) {
            System.out.println("Ocurrio un problema al intentar recuperar lo guardado previamente.");
            System.out.println(e.getMessage());
        }
        return datos;
    }

}
