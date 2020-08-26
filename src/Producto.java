public class Producto {
    TarjetaCredito tarjetaCredito;
    TarjetaDebito tarjetaDebito;
    Cuenta cuenta;
    Prestamo presta;

    public Producto(TarjetaCredito tarjetaCredito, TarjetaDebito tarjetaDebito, Cuenta cuenta, Prestamo presta) {
        this.tarjetaCredito = tarjetaCredito;
        this.tarjetaDebito = tarjetaDebito;
        this.cuenta = cuenta;
        this.presta = presta;
    }
}
