package AbstractFactory;

public class UsuarioFactory implements Abstract_Factory{
    @Override
    public InterfazUI MostrarInterfaz() {
        return new UsuarioUI();
    }
    @Override
    public MetodoEnvio RealizarEnvio() {
        return new EnvioNormal();
    }
}
