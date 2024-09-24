public class Coche {
    String marca;
    String modelo;
    int year;

    public Coche(String marca, String modelo, int year) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
    }

    public void acelerar () {
        System.out.println("El coche está acelerando");
    }

    public void frenar () {
        System.out.println("El coche está frenando");
    }

    public static void main(String[] args) {
        Coche coche = new Coche("Nissan", "XTrial", 2025);
        System.out.println("Marca: " + coche.marca);
        System.out.println("Modelo: " + coche.modelo);
        System.out.println("Year: " + coche.year);

        coche.acelerar();
        coche.frenar();
    }
}
