package banco;

import java.util.HashSet;
import java.util.Set;

public class CC {
    private String codigo;
    private Sucursal sucursal;
    private Set<Domiciliacion> domiciliacions;
    private Set<Cliente> clientes;

    public CC(String codigo, Sucursal sucursal) {
        this.codigo = codigo;
        this.sucursal = sucursal;
        this.domiciliacions = new HashSet<>();
        this.clientes = new HashSet<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Set<Domiciliacion> getDomiciliacions() {
        return domiciliacions;
    }

    public void setDomiciliacions(Set<Domiciliacion> domiciliacions) {
        this.domiciliacions = domiciliacions;
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void addCliente(Cliente cliente){
        this.clientes.add(cliente);
    }
    public void addDomiciliacion(Domiciliacion domiciliacion){
        this.domiciliacions.add(domiciliacion);
    }
    @Override
    public String toString(){
        return this.codigo;
    }
}
