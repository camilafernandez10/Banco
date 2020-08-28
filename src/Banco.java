import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        System.out.println("Programa banco");
        Cliente c=new Cliente();
        Scanner opc=new Scanner(System.in);
        System.out.println("digite la opcion que desea\n"
        + "1. Crear cliente");
        int opcion= opc.nextInt();
        switch (opcion){
            case 1:
                c.crearCliente();
                c.mostrarDatos();
                break;

        }
    }

}
