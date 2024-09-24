public class CuentaBancaria {
    int numeroDeCuenta;
    double saldo;
    String titular;


    public CuentaBancaria(int numeroDeCuenta, double saldo, String titular) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(double cantidad){
        saldo += cantidad;
        System.out.println("Se depositaron: " + cantidad);
        System.out.println("El nuevo saldo es: " + saldo);
    }

    public void retirar(double cantidad){
        saldo -= cantidad;
        System.out.println("Se retiraron: " + cantidad);
        System.out.println("El nuevo saldo es: " + saldo);
    }


    public static void main(String[] args) {
        CuentaBancaria cuentaBancaria = new CuentaBancaria(123456, 1000000,"Jaime Gallo");
        cuentaBancaria.depositar(500000);
        cuentaBancaria.retirar(200000);
    }

}
