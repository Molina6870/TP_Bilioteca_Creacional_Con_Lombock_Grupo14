package AbstractFactory;

public class EnvioNormal implements MetodoEnvio{

    @Override
    public void RealizarEnvio() {
        System.out.println("El envio se realizará de forma Normal");
    }
}
