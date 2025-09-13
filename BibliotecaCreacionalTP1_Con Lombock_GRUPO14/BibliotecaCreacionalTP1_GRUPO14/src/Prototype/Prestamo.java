package Prototype;

import Builder.Usuario;
import lombok.Data;

@Data
public class Prestamo implements Cloneable {

    //libro, usuario, fechaInicio, fechaFin
    private String Libro;
    private String Usuario;
    private String FechaInicio;
    private String FechaFin;

    public Prestamo(String libro, String usuario, String fechaInicio, String fechaFin) {
            this.Usuario = usuario;
            this.Libro = libro;
            this.FechaInicio = fechaInicio;
            this.FechaFin = fechaFin;
    }

    //Lo voy a hacer por Deep copy. Porque la primera vez lo hice por Shallow copy
    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Prestamo(this.Libro,this.Usuario ,this.FechaInicio, this.FechaFin);
    }

    public void mostrar() {
        System.out.println("Libro= " + Libro + "" + " Usuario: " + Usuario+ ""  + "Fecha Inicio= " + FechaInicio + "" + "Fecha Fin= " + FechaFin);
    }
}
