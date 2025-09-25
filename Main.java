package chanchinw;

public class Main {
    public static void main(String[] args) {
        Sandwich sandwich1 = new Sandwich.Builder()
                .setPan("Integral")
                .setCarne("Pollo")
                .setVerdura("Lechuga")
                .build();

        Sandwich sandwich2 = new Sandwich.Builder()
                .setPan("Blanco")
                .setCarne("Res")
                .setVerdura("Tomate")
                .build();

        System.out.println(sandwich1);
        System.out.println(sandwich2);
    }
}