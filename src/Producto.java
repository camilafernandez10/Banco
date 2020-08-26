public class Producto {
    TarjetaCredito tarjetaCredito;
    TarjetaDebito tarjetaDebito;
    Cuenta cuenta;
    Prestamo prestamo;

    public Producto(TarjetaCredito tarjetaCredito, TarjetaDebito tarjetaDebito, Cuenta cuenta, Prestamo prestamo) {
        this.tarjetaCredito = tarjetaCredito;
        this.tarjetaDebito = tarjetaDebito;
        this.cuenta = cuenta;
        this.prestamo = prestamo;
    }

    public TarjetaCredito getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(TarjetaCredito tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public TarjetaDebito getTarjetaDebito() {
        return tarjetaDebito;
    }

    public void setTarjetaDebito(TarjetaDebito tarjetaDebito) {
        this.tarjetaDebito = tarjetaDebito;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public Prestamo getPresta() {
        return prestamo;
    }

    public void setPresta(Prestamo presta) {
        this.prestamo = prestamo;
    }
}
