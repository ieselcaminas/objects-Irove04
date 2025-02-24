package EjerciciosPOO.Ejercicio5;

import EjerciciosPOO.Ejercicio3.Cuenta;

import java.util.ArrayList;

public class Domiciliacion {
    private String nombre;
    private int num_d;
    private CuentaCorriente cuentaCorriente;


    public Domiciliacion(String nombre, int num_d, CuentaCorriente cuentaCorriente) {
        this.nombre = nombre;
        this.num_d = num_d;
        this.cuentaCorriente = cuentaCorriente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum_d() {
        return num_d;
    }

    public void setNum_d(int num_d) {
        this.num_d = num_d;
    }

    public CuentaCorriente getCuentaCorriente() {
        return cuentaCorriente;
    }

    public void setCuentaCorriente(CuentaCorriente cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }

    @Override
    public String toString() {
        return "Domiciliacion{" +
                "nombre='" + nombre + '\'' +
                ", num_d=" + num_d +
                '}';
    }
}
