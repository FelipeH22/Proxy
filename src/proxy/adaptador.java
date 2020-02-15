package proxy;

public class adaptador implements interface_objeto{

    @Override
    public void operation() {
        objeto_remoto obj_remoto = new objeto_remoto();
        obj_remoto.doSomething();
    }
    
}
