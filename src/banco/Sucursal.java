package banco;

import java.util.HashSet;
import java.util.Set;

public class Sucursal {
    private String codigo;
    private String localidad;
    private Banco banco;
    private Set<CC> ccs;
    private Set<Prestamo> prestamos;

    public Sucursal(String codigo, String localidad, Banco banco) {
        this.codigo = codigo;
        this.localidad = localidad;
        this.banco = banco;
        this.ccs = new HashSet<>();
        this.prestamos = new HashSet<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Set<CC> getCcs() {
        return ccs;
    }

    public void setCcs(Set<CC> ccs) {
        this.ccs = ccs;
    }

    public Set<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Set<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public void addCC(CC cc){
        this.ccs.add(cc);
    }
    public void addPrestamo(Prestamo prestamo){
        this.prestamos.add(prestamo);
    }
    @Override
    public String toString(){
        return this.localidad;
    }
}
