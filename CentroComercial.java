abstract class CentroComercial implements InterfazDescuento {
    protected String nombreTienda;
    protected String tipoDeComercio;
    protected double descuento;
    public CentroComercial(String nombreTienda, String tipoDeComercio, double descuento) {
        this.nombreTienda = nombreTienda;
        this.tipoDeComercio = tipoDeComercio;
        this.descuento = descuento;
    }
    public abstract void imprimir();
}
