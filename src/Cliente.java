import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    ArrayList<String> nombres = new ArrayList<String>();
    ArrayList<String> apellidos = new ArrayList<String>();
    ArrayList<Integer> cedulas = new ArrayList<Integer>();
    ArrayList<String> direcciones= new ArrayList<String>();
    ArrayList<String> emails = new ArrayList<String>();
    ArrayList<Integer> celulares = new ArrayList<Integer>();


    public void crearCliente(){
        System.out.println("Creacion de cliente");
        Scanner dts= new Scanner (System.in);
        System.out.println("digite sus datos");
        System.out.println("1. nombre");
        nombres.add(dts.nextLine());
        System.out.println("2. apellido");
        apellidos.add(dts.nextLine());
        System.out.println("3. cedula");
        cedulas.add(dts.nextInt());
        System.out.println("4. direccion");
        direcciones.add(dts.next());
        System.out.println("5.email");
        emails.add(dts.next());
        System.out.println("6.celular");
        celulares.add(dts.nextInt());
        System.out.println("cliente creado");
    }
    public void mostrarDatos(){
        for (int i=0;i< nombres.size();i++){
            System.out.println("nombre: "+nombres.get(i));
            System.out.println("apellidos: "+apellidos.get(i));
            System.out.println("cedula: "+cedulas.get(i));
            System.out.println("direccion: "+direcciones.get(i));
            System.out.println("email: "+emails.get(i));
            System.out.println("celular: "+celulares.get(i));

        }
    }

    public int adquirirProducto(){
        Scanner prod=new Scanner(System.in);
        System.out.println("digite la opcion que desee");
        int producto=prod.nextInt();
        switch (producto){
            case 1:
                TarjetaDebito td =new TarjetaDebito(1,"1","camila",1,1000);
                break;
        }
        return producto;
    }


}
