package empleados;

public class Directivo extends Empleado{
    public Directivo(String nombre) {
        super(nombre);
    }

    @Override
    public void organizar(){
        System.out.println("Organizo el papeleo");
    }
    @Override
    public String toString(){
        return super.toString();
    }
}
