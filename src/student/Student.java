package student;

import javax.swing.text.Style;

public class Student extends Person {

    private static int cuanto = 0;
    public Student(String nombre, String address) {
        super(nombre, address);
    }

    public static int getCuanto() {
        return cuanto;
    }

    public static void setCuanto(int cuanto) {
        Student.cuanto = cuanto;
    }

    public int credits(){
        return cuanto;
    }
    public int study(){
        return cuanto++;
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
