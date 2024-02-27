package empleados;

public class Oficial extends Operario {

    public Oficial(String nombre) {
        super(nombre);
    }

    @Override
    public void cortar(){
        System.out.println("Estoy cortando");
    }
    @Override
    public String toString(){
        return super.toString();
    }
}
