package AbstractFactory;

public class AdminFactory implements Abstract_Factory{
    @Override
    public InterfazUI MostrarInterfaz() {
        return new AdminUI();
    }
    @Override
    public MetodoEnvio RealizarEnvio() {
        return new EnvioExpress();
    }

}
