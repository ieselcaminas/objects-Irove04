package EjerciciosPOO.Ejercicio5;

import EjerciciosPOO.Ejercicio3.Cuenta;

import java.util.ArrayList;

public class Banco {
    private String nombreBanco;
    private int num_banco;
    private String localizacion;

    private ArrayList<Sucursal> sucursales;

    public Banco(String nombreBanco, int num_banco, String localizacion) {
        this.nombreBanco = nombreBanco;
        this.num_banco = num_banco;
        this.localizacion = localizacion;
        this.sucursales = new ArrayList<>();
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public ArrayList<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(ArrayList<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public int getNum_banco() {
        return num_banco;
    }

    public void setNum_banco(int num_banco) {
        this.num_banco = num_banco;
    }

    public void addSucursal(Sucursal sucursal) {
        sucursales.add(sucursal);
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nombreBanco='" + nombreBanco + '\'' +
                ", num_banco=" + num_banco +
                ", localizacion='" + localizacion + '\'' +
                ", sucursales=" + sucursales +
                '}';
    }
}

