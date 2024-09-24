public class DivisionPorCero {
    public static void main(String[] args) {
        try {
            int resultado = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }
    }
}
