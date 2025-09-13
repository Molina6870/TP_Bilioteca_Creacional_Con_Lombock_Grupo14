package Factory;

//Acá es donde recién se va a aplicar el Factory Method

public class LogisticaLibro {
    public static Libro CrearLibro(String Libro){
        switch (Libro){
            case "Fisico" : return new LibroFisico();
            case "Digital" : return new LibroDigital();
            default: throw new IllegalArgumentException("No se encontro el tipo de libro");
        }
    }
}
