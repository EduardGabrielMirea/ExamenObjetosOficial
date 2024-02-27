package aire;

public class AireAcondicionado {
    private String nombre;
    private  int temperatura;
    private int tempMax;
    private int tempMin;

    public AireAcondicionado(String nombre, int temperatura, int tempMax, int tempMin) {
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.tempMax = tempMax;
        this.tempMin = tempMin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getTempMax() {
        return tempMax;
    }

    public void setTempMax(int tempMax) {
        this.tempMax = tempMax;
    }

    public int getTempMin() {
        return tempMin;
    }

    public void setTempMin(int tempMin) {
        this.tempMin = tempMin;
    }

    public int up(){
        if (this.temperatura + 1 <= this.tempMax){
            this.temperatura++;
        }else {
            throw new IllegalArgumentException("La temperatura del aire " + this.nombre + " no puede superar la temperatura maxima " + this.tempMax);
        }
        return temperatura;
    }

    public int down(){
        if (this.temperatura -1 >= this.tempMin){
            this.temperatura--;
        }else {
            throw new IllegalArgumentException("La temperatura del aire "+this.nombre+" no puede ser inferior a "+this.tempMin);
        }
        return  this.temperatura;
    }
    @Override
    public String toString(){
        return "El aire: " +this.nombre+ "\n\t"+" Temperatura "+this.temperatura;
    }
}
