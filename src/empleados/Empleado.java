package empleados;

public abstract class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void cortar(){
    }
    public void dibujar(){

    }
    public void organizar(){

    }

    @Override
    public String toString(){
        return this.nombre;
    }
}
