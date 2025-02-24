package EjerciciosPOO.Ejercicio6;

import java.util.List;

public class Catedra {
    private String nombre;
    private List<Profesor> profesores;

    public Catedra(String nombre, List<Profesor> profesores) {
        this.nombre = nombre;
        this.profesores = profesores;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
