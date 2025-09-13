package Builder;

public class Usuario {

    private String Nombre;
    private String Apellido;
    private String DNI;
    private String Domicilio;
    private String Ocupacion;
    private String Mail;

    @Override
    public String toString(){
        return "Usuario"+
                "{"+
                "Nombre= " + Nombre +
                "Apellido=" + Apellido +
                "DNI=" +DNI+
                "Domicilio=" + Domicilio +
                "Ocupación=" + Ocupacion +
                "Mail= " + Mail +
                "}";
    }

    private Usuario(Builder builder){
        this.Nombre = builder.Nombre;
        this.Apellido = builder.Apellido;
        this.DNI = builder.DNI;
        this.Domicilio = builder.Domicilio;
        this.Ocupacion = builder.Ocupacion;
        this.Mail = builder.Mail;
    }

    public static class Builder{
        private String Nombre;
        private String Apellido;
        private String DNI;
        private String Domicilio;
        private String Ocupacion;
        private String Mail;

        public Builder Nombre(String Nombre){
            this.Nombre = Nombre;
            return this;
        }
        public Builder Apellido(String Apellido) {
            this.Apellido = Apellido;
            return this;
        }
        public Builder DNI(String DNI){
            this.DNI = DNI;
            return this;
        }
        public Builder Domicilio(String Domicilio){
            this.Domicilio = Domicilio;
            return this;
        }
        public Builder Ocupacion(String Ocupación){
            this.Ocupacion = Ocupacion;
            return this;
        }
        public Builder Mail(String Mail){
            this.Mail = Mail;
            return this;
        }

        public Usuario build(){
            return new Usuario(this);
        }



    }

}
