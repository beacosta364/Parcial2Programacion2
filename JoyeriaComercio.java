class JoyeriaComercio extends CentroComercial {
    public JoyeriaComercio(String nombreTienda, String tipoDeComercio, double descuento) {
        super(nombreTienda, tipoDeComercio, descuento);
    }
    @Override
    public double calcularDescuento() {
        // Implementa el descuento para el nuevo tipo de comercio
        return descuento * 0.6;
    }
    @Override
    public void imprimir() {
        System.out.println("Nombre de la tienda: " + nombreTienda);
        System.out.println("Tipo de comercio: " + tipoDeComercio);
        System.out.println("Descuento: " + descuento);
    }
}