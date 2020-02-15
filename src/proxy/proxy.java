package proxy;

public class proxy implements interface_objeto{

    objeto_real obj = new objeto_real();
    adaptador adaptador = new adaptador();
    @Override
    public void operation() {
        obj.operation();
        adaptador.operation();
    }
    
}
