package aire;

public class Main {
    public static void main(String[] args) {
        AireAcondicionado aa = new AireAcondicionado("AC", 20, 35, 15);

        try {
            aa.setTemperatura(33);

            aa.up();

            System.out.println(aa);

            aa.up();

            System.out.println(aa);

            aa.up();

            System.out.println(aa);

        }catch (IllegalArgumentException e){
            System.out.println("Error al modifical la temperatura "+ e.getMessage());
        }

        try {

            aa.setTemperatura(17);

            aa.down();

            System.out.println(aa);

            aa.down();

            System.out.println(aa);

            aa.down();
            System.out.println(aa);

        }catch (IllegalArgumentException e){
            System.out.println("Error al modifical la temperatura "+ e.getMessage());
        }

    }
}
