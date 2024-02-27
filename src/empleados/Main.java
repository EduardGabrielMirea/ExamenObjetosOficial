package empleados;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Oficial o1 = new Oficial("Eddy");
        Tecnico t1 = new Tecnico("Adrian");
        Directivo d1 = new Directivo("Brian");

        System.out.println(o1.getNombre());
        o1.cortar();
        System.out.println(t1.getNombre());
        t1.dibujar();
        System.out.println(d1.getNombre());
        d1.organizar();

    }
}
