package EjerciciosPOO.Ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String nombre;
    private List<Catedra> catedras;

    public Profesor(String nombre) {
        this.nombre = nombre;
        this.catedras = new ArrayList<>();
    }

    public List<Catedra> getCatedras() {
        return catedras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
