package banco;

import java.util.HashSet;
import java.util.Set;

public class Banco {
    private String codigo;
    private String nombre;
    private Set<Sucursal> sucursals;

    public Banco(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sucursals = new HashSet<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Sucursal> getSucursals() {
        return sucursals;
    }

    public void setSucursals(Set<Sucursal> sucursals) {
        this.sucursals = sucursals;
    }
    public void addSucursal(Sucursal sucursal){
        this.sucursals.add(sucursal);
    }
    @Override
    public String toString(){
        return this.nombre;
    }
}
