package EjerciciosPOO.Ejercicio5;

public class Prestamo {
    private int num_prestamo;
    private String nombre;
    Sucursal sucursal;

    public Prestamo(int num_prestamo, String nombre) {
        this.num_prestamo = num_prestamo;
        this.nombre = nombre;
        this.sucursal = sucursal;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public int getNum_prestamo() {
        return num_prestamo;
    }

    public void setNum_prestamo(int num_prestamo) {
        this.num_prestamo = num_prestamo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "num_prestamo=" + num_prestamo +
                ", nombre='" + nombre + '\'' +
                ", sucursal=" + sucursal +
                '}';
    }
}
