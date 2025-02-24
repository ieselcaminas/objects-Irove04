package EjerciciosPOO.Ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Facultad {
    private String nombre;
    private List<Catedra> catedras;

    public Facultad(String nombre) {
        this.nombre = nombre;
        this.catedras = new ArrayList<>();
    }

    public List<Catedra> getCatedras() {
        return catedras;
    }

    public void addCatedra(Catedra c) {
        this.catedras.add(c);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
