public class Estudiante {
    String nombre;
    int edad;
    int grado;

    public Estudiante (String nombre, int edad, int grado) {
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
    }

    public void estudiar() {
        System.out.println("La estuadiante " +nombre + " de " +edad + " años de edad" + " está estudiando en grado " +grado);
    }

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juliana", 14, 10 );
        estudiante.estudiar();
    }


}
