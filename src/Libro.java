public class Libro {
    String titulo = "";
    String autor = "";
    int paginas = 0;

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void leerPagina () {
        System.out.println("Estás leyendo la página: " +paginas);
    }

    public static void main(String[] args) {
        Libro libro = new Libro("Libro", "Jaime Gallo", 300);

        libro.leerPagina();

    }
}
