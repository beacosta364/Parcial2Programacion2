class DispositivosElectronicosDeComercio extends CentroComercial {
    public DispositivosElectronicosDeComercio(String nombreTienda, String tipoDeComercio, double descuento) {
        super(nombreTienda, tipoDeComercio, descuento);
    }
    @Override
    public double calcularDescuento() {
        return descuento * 0.4;
    }
    @Override
    public void imprimir() {
        System.out.println("Nombre de la tienda: " + nombreTienda);
        System.out.println("Tipo de comercio: " + tipoDeComercio);
        System.out.println("Descuento: " + descuento);
    }
}