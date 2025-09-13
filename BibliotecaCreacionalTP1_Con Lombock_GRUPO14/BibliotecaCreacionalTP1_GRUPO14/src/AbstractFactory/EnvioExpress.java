package AbstractFactory;

public class EnvioExpress implements MetodoEnvio{
    @Override
    public void RealizarEnvio(){
        System.out.println("El envio se realizará de forma Express");
    }
}
