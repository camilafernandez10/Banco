import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        System.out.println("Programa banco");
        Cliente c=new Cliente();
        c.crearCliente();
        Scanner prod=new Scanner(System.in);
        System.out.println("digite la opcion que desee");
        int producto=prod.nextInt();
        switch (producto){
            case 1:
                TarjetaDebito td =new TarjetaDebito(1,"1","camila",1,1000);
            break;
        }
    }

}
