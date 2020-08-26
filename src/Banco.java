public class Banco {
    public static void main(String[] args) {
        System.out.println("Programa plano Carteciano");
        Punto p1 = new Punto(-1.0D, 0.0D);
        Punto p2 = new Punto(1.0D, 0.0D);
        double d = p1.hallarDistancia(p2);
        System.out.println(d);
    }

}
