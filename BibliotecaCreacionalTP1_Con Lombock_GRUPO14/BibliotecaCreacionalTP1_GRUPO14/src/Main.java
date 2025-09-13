import AbstractFactory.*;
import Builder.Usuario;
import Factory.Libro;
import Factory.LogisticaLibro;
import Prototype.Prestamo;
import Singleton.DataBase;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        System.out.println("**********************************APARTADO 1*****************************************");
        //Patrón Singleton - APARTADO 1
        DataBase DB1 = DataBase.getInstance();
        DataBase DB2 = DataBase.getInstance();

        DB1.AgregarLibros("Monstruario");
        DB2.AgregarLibros("La odisea");

        System.out.println(DB1 == DB2); // TRUE, Porque son la misma instancia

        System.out.println("Los libros de la Base de datos son:" + DB1.ListarLibros());

        System.out.println("**********************************APARTADO 2******************************************");

        //Patrón Factory Method - APARTADO 2
        Libro libro1 = LogisticaLibro.CrearLibro("Fisico");
        Libro libro2 = LogisticaLibro.CrearLibro("Digital");

        libro1.MostrarLibro();
        libro2.MostrarLibro();

        System.out.println("********************************APARTADO 3********************************************");
        // Patrón Abstract Factory - APARTADO 3
        Abstract_Factory Admin = new AdminFactory();
        Abstract_Factory Usuario = new UsuarioFactory();

        InterfazUI AdminUI = Admin.MostrarInterfaz();
        MetodoEnvio AdminEnvio = Admin.RealizarEnvio();

        InterfazUI usuarioUI = Usuario.MostrarInterfaz();
        MetodoEnvio usuarioEnvio = Usuario.RealizarEnvio();

        System.out.println("------------------------------------------------------------------");
        usuarioUI.MostrarInterfaz();
        usuarioEnvio.RealizarEnvio();
        System.out.println("------------------------------------------------------------------");
        AdminUI.MostrarInterfaz();
        AdminEnvio.RealizarEnvio();


        System.out.println("*******************************APARTADO 4*********************************************");

        // Patrón Builder - APARTADO 4

        Usuario usuario1 = new Usuario.Builder()
                .Nombre("Juani")
                .DNI("45123789")
                .Ocupacion("Estudiante")
                .Mail("Ayuda@gmail.com")
                .build();

        Usuario usuario2 = new Usuario.Builder()
                .Nombre("Pepo")
                .Apellido("Ratzinger")
                .Ocupacion("Ser un perro")
                .Domicilio("Coronel Ramirez")
                .build();

        System.out.println(usuario1);
        System.out.println(usuario2);

        System.out.println("*******************************APARTADO 5*********************************************");
        //Patron Prototype - APARTADO 5
        //Prestamo prestamo1 = new Prestamo("Contabilidad","Usuario123", "01/01/25", "");

        // Punto 5 - Utilizamos el Prototype

        Prestamo Base = new Prestamo("Contabilidad","Pepo2020","27/08","21/10");
        Prestamo Copia1 = (Prestamo)Base.clone();
        Prestamo Copia2 = (Prestamo)Base.clone();
        Prestamo Copia3 = (Prestamo) Base.clone();

        //Acá lo que hacemos es clonar y modificar algunos atributos
        Copia1.setUsuario("Ari");
        Copia2.setUsuario("Antonio");
        Copia2.setFechaFin("22/10");

        Copia3.setFechaFin("20/09");
        Copia3.setFechaInicio("29/08");
        Copia3.setLibro(""); //DUDA. Como hago en el caso de que se quiera clonar y no se coloca nada? Tendríamos que utilizar un notnull?
        Copia3.setUsuario("Fito");

        System.out.println("El préstamos original =" + Base);
        System.out.println("Se ha creado el Clon 1 =" +Copia1);
        System.out.println("Se ha creado el Clon 2 =" +Copia2);
        System.out.println("Se ha creado el Clon 3 = " + Copia3);




    }
}