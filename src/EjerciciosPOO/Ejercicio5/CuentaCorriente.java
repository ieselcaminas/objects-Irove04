package EjerciciosPOO.Ejercicio5;

import java.util.ArrayList;

public class CuentaCorriente {
    private int numeroCC;
    Cliente cliente;
    Sucursal sucursal;
    ArrayList<Domiciliacion> domiciliaciones;

    public CuentaCorriente(int numeroCC, Cliente cliente) {
        this.numeroCC = numeroCC;
        this.cliente = cliente;
        this.sucursal = sucursal;
        domiciliaciones = new ArrayList<>();
    }

    public ArrayList<Domiciliacion> getDomiciliaciones() {
        return domiciliaciones;
    }

    public void setDomiciliaciones(ArrayList<Domiciliacion> domiciliaciones) {
        this.domiciliaciones = domiciliaciones;
    }

    public void añadirDomiciliacion(Domiciliacion domiciliacion) {
        domiciliaciones.add(domiciliacion);
    }

    public int getNumeroCC() {
        return numeroCC;
    }

    public void setNumeroCC(int numeroCC) {
        this.numeroCC = numeroCC;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "numeroCC=" + numeroCC +
                ", cliente=" + cliente +
                ", sucursal=" + sucursal +
                '}';
    }
}
