package EjerciciosPOO.Ejercicio5;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String dni;
    private CuentaCorriente cuentaCorriente;

    //Añadimos una lista por que un cliente puede tener varios prestamos
    List<Prestamo> prestamos;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.cuentaCorriente = cuentaCorriente;
        this.prestamos = new ArrayList<>();
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void addPrestamo(Prestamo prestamo) {
        this.prestamos.add(prestamo);
    }

    public CuentaCorriente getCuentaCorriente() {
        return cuentaCorriente;
    }

    public void setCuentaCorriente(CuentaCorriente cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", cuentaCorriente=" + cuentaCorriente +
                '}';
    }
}
