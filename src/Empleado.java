public class Empleado {
    String nombre;
    String puesto;
    double salario;

    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public void trabajar() {
        System.out.println("El empleado " +nombre + " está trabajando como " +puesto);
    }

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Jaime Gallo", "Desarrollador web", 9000000);
        empleado.trabajar();
    }
}
