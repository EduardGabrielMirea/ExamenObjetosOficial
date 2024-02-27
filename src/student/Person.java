package student;

public abstract class Person {
    private String nombre;
    private String address;

    public Person(String nombre, String address) {
        this.nombre = nombre;
        this.address = address;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString(){
        return this.nombre+"\n\t"+this.address;
    }
}
