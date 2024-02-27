package empleados;

public class Tecnico extends Operario{
    public Tecnico(String nombre) {
        super(nombre);
    }

    @Override
    public void dibujar(){
        System.out.println("Estoy dibujando");
    }
    @Override
    public String toString(){
        return super.toString();
    }
}
