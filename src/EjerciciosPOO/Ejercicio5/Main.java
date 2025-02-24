package EjerciciosPOO.Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Banco caixaBank = new Banco("caixaBank", 1, "castellon");
        Sucursal sucursalCaixa = new Sucursal(1, "sucursalCaixa", "castellon", caixaBank);
        caixaBank.addSucursal(sucursalCaixa);

        Cliente cristina = new Cliente("crsitina", "20958484");
        Prestamo pCristina = new Prestamo(20, "prestamoCristina");
        cristina.addPrestamo(pCristina);

        sucursalCaixa.addPrestamo(pCristina);

        Sucursal sucursalCaixa2 = new Sucursal(2, "Valencia", bbva);
        caixaBank.addSucursal(sucursalCaixa2);

    }
}
