package Singleton;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private static DataBase Instancia;

    public static synchronized DataBase getInstance(){
      if ( Instancia == null){
            Instancia = new DataBase();
      }
      System.out.println("La base de datos ya a sido conectada anteriormente");
      return Instancia;
    }

    private List<String> Libros;

    private DataBase(){
        this.Libros =new ArrayList<>();
        System.out.println("Se está conectando a la base de datos");
    }

    public void AgregarLibros (String Libro){
        Libros.add(Libro);
    }

    public List<String> ListarLibros(){
        return Libros;
    }

}
