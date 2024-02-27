package banco;

import java.util.HashSet;
import java.util.Set;

public class Cliente {
    private String codigo;
    private String nombre;
    private Set<Prestamo> prestamos;
    private Set<CC> ccs;

    public Cliente(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.prestamos = new HashSet<>();
        this.ccs = new HashSet<>();
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

    public Set<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Set<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public Set<CC> getCcs() {
        return ccs;
    }

    public void setCcs(Set<CC> ccs) {
        this.ccs = ccs;
    }
    public void addPrestamo(Prestamo prestamo){
        this.prestamos.add(prestamo);
    }
    public void addCC(CC cc){
        this.ccs.add(cc);
    }
    @Override
    public String toString(){
        return this.nombre;
    }
}
