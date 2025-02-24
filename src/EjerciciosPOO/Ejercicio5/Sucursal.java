package EjerciciosPOO.Ejercicio5;

import java.util.List;

public class Sucursal {
    private int num_sucursal;
    private String nombre;
    private String localizacion;
    Banco banco;
    private List<Prestamo> prestamos;

    public Sucursal(int num_sucursal, String nombre, String localizacion, Banco banco   ) {
        this.num_sucursal = num_sucursal;
        this.nombre = nombre;
        this.localizacion = localizacion;
        this.banco = banco;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public int getNum_sucursal() {
        return num_sucursal;
    }

    public void setNum_sucursal(int num_sucursal) {
        this.num_sucursal = num_sucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "num_sucursal=" + num_sucursal +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public void addPrestamo(Prestamo prestamo) {
        this.prestamos.add(prestamo);
    }
}
