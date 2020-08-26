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
    public void adquirirProducto(){

    }
}
