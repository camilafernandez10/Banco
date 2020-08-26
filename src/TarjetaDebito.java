import java.util.Scanner;

public class TarjetaDebito {
    int numeroCuenta;
    String fechaVencimiento;
    String titular;
    int clave=1234;
    int saldo;

    public TarjetaDebito(int numeroCuenta, String fechaVencimiento, String titular, int clave, int saldo) {
        this.numeroCuenta = numeroCuenta;
        this.fechaVencimiento = fechaVencimiento;
        this.titular = titular;
        this.clave = clave;
        this.saldo = saldo;
    }
    public int retirarDinero(int dinero){

    Scanner md=new Scanner(System.in);
        System.out.println("digite la clave de la cuenta");
        if (clave==md.nextInt()){
            System.out.println("digite el monto de dinero a retirar");
            int Mdinero=md.nextInt();
            System.out.println("dinero retirado");

        }else
            System.out.println("clave incorrecta");
        return 0;
    }
}
