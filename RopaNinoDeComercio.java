class RopaNinoDeComercio extends CentroComercial {
    public RopaNinoDeComercio(String nombreTienda, String tipoDeComercio, double descuento) {
        super(nombreTienda, tipoDeComercio, descuento);
    }
    @Override
    public double calcularDescuento() {
        return descuento * 0.8;
    }
    public void imprimir() {
        System.out.println("Nombre de la tienda: " + nombreTienda);
        System.out.println("Tipo de comercio: " + tipoDeComercio);
        System.out.println("Descuento: " + descuento);
    }
}

