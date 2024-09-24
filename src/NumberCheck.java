public class NumberCheck {
    public void checkNumber(int number) {
        if (number > 0) {
            System.out.println("El número es positivo");
        } else {
            if (number < 0){
                System.out.println("El numero es negativo");
            } else {
                System.out.println("El número es cero");
            }
        }
    }

    public static void main(String[] args) {
        NumberCheck numberCheck = new NumberCheck();
        numberCheck.checkNumber(5);
    }
}
