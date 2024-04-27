class Descuento {
    public static double calcularDescuento(CentroComercial comercio) {
        switch (comercio.tipoDeComercio) {
            case "Ropa de niño":
                return comercio.calcularDescuento();
            case "Dispositivos Electronicos":
                return comercio.calcularDescuento();
            case "Joyeria":
                return comercio.calcularDescuento();
            default:
                return 0;
        }
    }
}