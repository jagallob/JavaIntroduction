public class Persona {
   private String nombre;
   private int edad;

   public Persona(String nombre, int edad) {
       this.nombre = nombre;
       this.edad = edad;
   }

   public void saludo() {
       System.out.println("Hola, soy " +nombre + " y tengo " +edad + " años");
   }

    public static void main(String[] args) {
        Persona persona = new Persona("Jaime Gallo", 39);

        persona.saludo();
    }
}