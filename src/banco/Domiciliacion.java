package banco;

public class Domiciliacion {
    private String codigo;
    private int numero;
    private String tipo;
    private CC cc;

    public Domiciliacion(String codigo, int numero, String tipo, CC cc) {
        this.codigo = codigo;
        this.numero = numero;
        this.tipo = tipo;
        this.cc = cc;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public CC getCc() {
        return cc;
    }

    public void setCc(CC cc) {
        this.cc = cc;
    }
    @Override
    public String toString(){
        return "Recibo: "+this.codigo+" "+this.tipo+" "+this.numero;
    }
}
