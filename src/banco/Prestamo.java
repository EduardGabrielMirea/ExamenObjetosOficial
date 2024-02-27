package banco;

public class Prestamo {
    private String codigo;
    private int cantidad;
    private Sucursal sucursal;
    private Cliente cliente;

    public Prestamo(String codigo, int cantidad, Sucursal sucursal, Cliente cliente) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.sucursal = sucursal;
        this.cliente = cliente;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    @Override
    public String toString(){
        return this.codigo+ " " +this.cantidad;
    }
}
