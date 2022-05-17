public class Main {
    public static void main(String[] args) {


       class Coche {
            int numPuertas = 1;

            int incPuertas() {
                return numPuertas +1;
            }
            
        }
        Coche miCoche = new Coche();
        System.out.println(miCoche.incPuertas());
    }
}