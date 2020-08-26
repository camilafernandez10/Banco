import java.util.Scanner;

public class Cliente {
    String nombre;
    int cedula;
    String direccion;
    String email;
    int celular;

    public Cliente(String nombre, int cedula, String direccion, String email, int celular) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.email = email;
        this.celular = celular;
    }
    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", cedula=" + cedula +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                ", celular=" + celular +
                '}';
    }
    public int adquirirProducto(){
        Scanner prod=new Scanner(System.in);
        System.out.println("digite la opcion que desee");
        int producto=prod.nextInt();
        return producto;
    }
    public void crearCliente(){
        Scanner dts= new Scanner (System.in);
        System.out.println("digite la cantidad de clientes a registrar");
        int cantCli=dts.nextInt();
        Cliente c[]=new Cliente[cantCli];
        for (int i=0;i<c.length;i++){
            System.out.println("digite sus datos");
            nombre=dts.nextLine();
            cedula=dts.nextInt();
            direccion=dts.nextLine();
            email=dts.nextLine();
            celular=dts.nextInt();
            c[i]=new Cliente(nombre,cedula,direccion,email,celular);
        }
        System.out.println("cliente creado");

    }
}
